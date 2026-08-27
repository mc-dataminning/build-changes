import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dwv {
   private static final Logger a = LogUtils.getLogger();
   static final Predicate<drd> b = $$0 -> !$$0.i();
   static final Predicate<drd> c = drc.a::d;
   private final awu d;
   private final Predicate<drd> e;
   private final dsz f;

   public dwv(dsz $$0, dwv.a $$1) {
      this.e = $$1.e();
      this.f = $$0;
      int $$2 = ayf.e($$0.J_() + 1);
      this.d = new ayt($$2, 256);
   }

   public static void a(dsz $$0, Set<dwv.a> $$1) {
      int $$2 = $$1.size();
      ObjectList<dwv> $$3 = new ObjectArrayList($$2);
      ObjectListIterator<dwv> $$4 = $$3.iterator();
      int $$5 = $$0.b() + 16;
      io.a $$6 = new io.a();

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            for (dwv.a $$9 : $$1) {
               $$3.add($$0.a($$9));
            }

            for (int $$10 = $$5 - 1; $$10 >= $$0.I_(); $$10--) {
               $$6.d($$7, $$10, $$8);
               drd $$11 = $$0.a_($$6);
               if (!$$11.a(dec.a)) {
                  while ($$4.hasNext()) {
                     dwv $$12 = (dwv)$$4.next();
                     if ($$12.e.test($$11)) {
                        $$12.a($$7, $$8, $$10 + 1);
                        $$4.remove();
                     }
                  }

                  if ($$3.isEmpty()) {
                     break;
                  }

                  $$4.back($$2);
               }
            }
         }
      }
   }

   public boolean a(int $$0, int $$1, int $$2, drd $$3) {
      int $$4 = this.a($$0, $$2);
      if ($$1 <= $$4 - 2) {
         return false;
      } else {
         if (this.e.test($$3)) {
            if ($$1 >= $$4) {
               this.a($$0, $$2, $$1 + 1);
               return true;
            }
         } else if ($$4 - 1 == $$1) {
            io.a $$5 = new io.a();

            for (int $$6 = $$1 - 1; $$6 >= this.f.I_(); $$6--) {
               $$5.d($$0, $$6, $$2);
               if (this.e.test(this.f.a_($$5))) {
                  this.a($$0, $$2, $$6 + 1);
                  return true;
               }
            }

            this.a($$0, $$2, this.f.I_());
            return true;
         }

         return false;
      }
   }

   public int a(int $$0, int $$1) {
      return this.a(c($$0, $$1));
   }

   public int b(int $$0, int $$1) {
      return this.a(c($$0, $$1)) - 1;
   }

   private int a(int $$0) {
      return this.d.a($$0) + this.f.I_();
   }

   private void a(int $$0, int $$1, int $$2) {
      this.d.b(c($$0, $$1), $$2 - this.f.I_());
   }

   public void a(dsz $$0, dwv.a $$1, long[] $$2) {
      long[] $$3 = this.d.a();
      if ($$3.length == $$2.length) {
         System.arraycopy($$2, 0, $$3, 0, $$2.length);
      } else {
         a.warn("Ignoring heightmap data for chunk " + $$0.f() + ", size does not match; expected: " + $$3.length + ", got: " + $$2.length);
         a($$0, EnumSet.of($$1));
      }
   }

   public long[] a() {
      return this.d.a();
   }

   private static int c(int $$0, int $$1) {
      return $$0 + $$1 * 16;
   }

   public static enum a implements ayz {
      a("WORLD_SURFACE_WG", dwv.b.a, dwv.b),
      b("WORLD_SURFACE", dwv.b.c, dwv.b),
      c("OCEAN_FLOOR_WG", dwv.b.a, dwv.c),
      d("OCEAN_FLOOR", dwv.b.b, dwv.c),
      e("MOTION_BLOCKING", dwv.b.c, $$0 -> $$0.d() || !$$0.u().c()),
      f("MOTION_BLOCKING_NO_LEAVES", dwv.b.b, $$0 -> ($$0.d() || !$$0.u().c()) && !($$0.b() instanceof dik));

      public static final Codec<dwv.a> g = ayz.a(dwv.a::values);
      private final String h;
      private final dwv.b i;
      private final Predicate<drd> j;

      private a(String $$0, dwv.b $$1, Predicate<drd> $$2) {
         this.h = $$0;
         this.i = $$1;
         this.j = $$2;
      }

      public String a() {
         return this.h;
      }

      public boolean b() {
         return this.i == dwv.b.c;
      }

      public boolean d() {
         return this.i != dwv.b.a;
      }

      public Predicate<drd> e() {
         return this.j;
      }

      @Override
      public String c() {
         return this.h;
      }
   }

   public static enum b {
      a,
      b,
      c;
   }
}
