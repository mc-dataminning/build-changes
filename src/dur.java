import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dur {
   private static final Logger a = LogUtils.getLogger();
   static final Predicate<doz> b = $$0 -> !$$0.i();
   static final Predicate<doz> c = doy.a::d;
   private final avz d;
   private final Predicate<doz> e;
   private final dqv f;

   public dur(dqv $$0, dur.a $$1) {
      this.e = $$1.e();
      this.f = $$0;
      int $$2 = axk.e($$0.J_() + 1);
      this.d = new axy($$2, 256);
   }

   public static void a(dqv $$0, Set<dur.a> $$1) {
      int $$2 = $$1.size();
      ObjectList<dur> $$3 = new ObjectArrayList($$2);
      ObjectListIterator<dur> $$4 = $$3.iterator();
      int $$5 = $$0.b() + 16;
      ib.a $$6 = new ib.a();

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            for (dur.a $$9 : $$1) {
               $$3.add($$0.a($$9));
            }

            for (int $$10 = $$5 - 1; $$10 >= $$0.I_(); $$10--) {
               $$6.d($$7, $$10, $$8);
               doz $$11 = $$0.a_($$6);
               if (!$$11.a(dca.a)) {
                  while ($$4.hasNext()) {
                     dur $$12 = (dur)$$4.next();
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

   public boolean a(int $$0, int $$1, int $$2, doz $$3) {
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
            ib.a $$5 = new ib.a();

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

   public void a(dqv $$0, dur.a $$1, long[] $$2) {
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

   public static enum a implements aye {
      a("WORLD_SURFACE_WG", dur.b.a, dur.b),
      b("WORLD_SURFACE", dur.b.c, dur.b),
      c("OCEAN_FLOOR_WG", dur.b.a, dur.c),
      d("OCEAN_FLOOR", dur.b.b, dur.c),
      e("MOTION_BLOCKING", dur.b.c, $$0 -> $$0.d() || !$$0.u().c()),
      f("MOTION_BLOCKING_NO_LEAVES", dur.b.b, $$0 -> ($$0.d() || !$$0.u().c()) && !($$0.b() instanceof dgh));

      public static final Codec<dur.a> g = aye.a(dur.a::values);
      private final String h;
      private final dur.b i;
      private final Predicate<doz> j;

      private a(String $$0, dur.b $$1, Predicate<doz> $$2) {
         this.h = $$0;
         this.i = $$1;
         this.j = $$2;
      }

      public String a() {
         return this.h;
      }

      public boolean b() {
         return this.i == dur.b.c;
      }

      public boolean d() {
         return this.i != dur.b.a;
      }

      public Predicate<doz> e() {
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
