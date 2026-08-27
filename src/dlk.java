import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dlk {
   private static final Logger a = LogUtils.getLogger();
   static final Predicate<dgb> b = $$0 -> !$$0.i();
   static final Predicate<dgb> c = dga.a::d;
   private final arp d;
   private final Predicate<dgb> e;
   private final dhx f;

   public dlk(dhx $$0, dlk.a $$1) {
      this.e = $$1.e();
      this.f = $$0;
      int $$2 = asy.e($$0.J_() + 1);
      this.d = new atl($$2, 256);
   }

   public static void a(dhx $$0, Set<dlk.a> $$1) {
      int $$2 = $$1.size();
      ObjectList<dlk> $$3 = new ObjectArrayList($$2);
      ObjectListIterator<dlk> $$4 = $$3.iterator();
      int $$5 = $$0.b() + 16;
      ht.a $$6 = new ht.a();

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            for (dlk.a $$9 : $$1) {
               $$3.add($$0.a($$9));
            }

            for (int $$10 = $$5 - 1; $$10 >= $$0.I_(); $$10--) {
               $$6.d($$7, $$10, $$8);
               dgb $$11 = $$0.a_($$6);
               if (!$$11.a(cuc.a)) {
                  while ($$4.hasNext()) {
                     dlk $$12 = (dlk)$$4.next();
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

   public boolean a(int $$0, int $$1, int $$2, dgb $$3) {
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
            ht.a $$5 = new ht.a();

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

   public void a(dhx $$0, dlk.a $$1, long[] $$2) {
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

   public static enum a implements atr {
      a("WORLD_SURFACE_WG", dlk.b.a, dlk.b),
      b("WORLD_SURFACE", dlk.b.c, dlk.b),
      c("OCEAN_FLOOR_WG", dlk.b.a, dlk.c),
      d("OCEAN_FLOOR", dlk.b.b, dlk.c),
      e("MOTION_BLOCKING", dlk.b.c, $$0 -> $$0.d() || !$$0.u().c()),
      f("MOTION_BLOCKING_NO_LEAVES", dlk.b.b, $$0 -> ($$0.d() || !$$0.u().c()) && !($$0.b() instanceof cyi));

      public static final Codec<dlk.a> g = atr.a(dlk.a::values);
      private final String h;
      private final dlk.b i;
      private final Predicate<dgb> j;

      private a(String $$0, dlk.b $$1, Predicate<dgb> $$2) {
         this.h = $$0;
         this.i = $$1;
         this.j = $$2;
      }

      public String a() {
         return this.h;
      }

      public boolean b() {
         return this.i == dlk.b.c;
      }

      public boolean d() {
         return this.i != dlk.b.a;
      }

      public Predicate<dgb> e() {
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
