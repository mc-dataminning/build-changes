import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class eak {
   private static final Logger a = LogUtils.getLogger();
   static final Predicate<duo> b = $$0 -> !$$0.l();
   static final Predicate<duo> c = dun.a::d;
   private final axs d;
   private final Predicate<duo> e;
   private final dwk f;

   public eak(dwk $$0, eak.a $$1) {
      this.e = $$1.e();
      this.f = $$0;
      int $$2 = azd.e($$0.H_() + 1);
      this.d = new azs($$2, 256);
   }

   public static void a(dwk $$0, Set<eak.a> $$1) {
      if (!$$1.isEmpty()) {
         int $$2 = $$1.size();
         ObjectList<eak> $$3 = new ObjectArrayList($$2);
         ObjectListIterator<eak> $$4 = $$3.iterator();
         int $$5 = $$0.b() + 16;
         je.a $$6 = new je.a();

         for (int $$7 = 0; $$7 < 16; $$7++) {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               for (eak.a $$9 : $$1) {
                  $$3.add($$0.a($$9));
               }

               for (int $$10 = $$5 - 1; $$10 >= $$0.G_(); $$10--) {
                  $$6.d($$7, $$10, $$8);
                  duo $$11 = $$0.a_($$6);
                  if (!$$11.a(dhl.a)) {
                     while ($$4.hasNext()) {
                        eak $$12 = (eak)$$4.next();
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
   }

   public boolean a(int $$0, int $$1, int $$2, duo $$3) {
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
            je.a $$5 = new je.a();

            for (int $$6 = $$1 - 1; $$6 >= this.f.G_(); $$6--) {
               $$5.d($$0, $$6, $$2);
               if (this.e.test(this.f.a_($$5))) {
                  this.a($$0, $$2, $$6 + 1);
                  return true;
               }
            }

            this.a($$0, $$2, this.f.G_());
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
      return this.d.a($$0) + this.f.G_();
   }

   private void a(int $$0, int $$1, int $$2) {
      this.d.b(c($$0, $$1), $$2 - this.f.G_());
   }

   public void a(dwk $$0, eak.a $$1, long[] $$2) {
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

   public static enum a implements azz {
      a("WORLD_SURFACE_WG", eak.b.a, eak.b),
      b("WORLD_SURFACE", eak.b.c, eak.b),
      c("OCEAN_FLOOR_WG", eak.b.a, eak.c),
      d("OCEAN_FLOOR", eak.b.b, eak.c),
      e("MOTION_BLOCKING", eak.b.c, $$0 -> $$0.d() || !$$0.y().c()),
      f("MOTION_BLOCKING_NO_LEAVES", eak.b.b, $$0 -> ($$0.d() || !$$0.y().c()) && !($$0.b() instanceof dlt));

      public static final Codec<eak.a> g = azz.a(eak.a::values);
      private final String h;
      private final eak.b i;
      private final Predicate<duo> j;

      private a(final String $$0, final eak.b $$1, final Predicate<duo> $$2) {
         this.h = $$0;
         this.i = $$1;
         this.j = $$2;
      }

      public String a() {
         return this.h;
      }

      public boolean b() {
         return this.i == eak.b.c;
      }

      public boolean d() {
         return this.i != eak.b.a;
      }

      public Predicate<duo> e() {
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
