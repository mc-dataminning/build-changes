import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class ecr {
   private static final Logger a = LogUtils.getLogger();
   static final Predicate<dww> b = $$0 -> !$$0.l();
   static final Predicate<dww> c = dwv.a::d;
   private final axo d;
   private final Predicate<dww> e;
   private final dyr f;

   public ecr(dyr $$0, ecr.a $$1) {
      this.e = $$1.e();
      this.f = $$0;
      int $$2 = ayz.e($$0.M_() + 1);
      this.d = new azo($$2, 256);
   }

   public static void a(dyr $$0, Set<ecr.a> $$1) {
      if (!$$1.isEmpty()) {
         int $$2 = $$1.size();
         ObjectList<ecr> $$3 = new ObjectArrayList($$2);
         ObjectListIterator<ecr> $$4 = $$3.iterator();
         int $$5 = $$0.b() + 16;
         ji.a $$6 = new ji.a();

         for (int $$7 = 0; $$7 < 16; $$7++) {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               for (ecr.a $$9 : $$1) {
                  $$3.add($$0.a($$9));
               }

               for (int $$10 = $$5 - 1; $$10 >= $$0.L_(); $$10--) {
                  $$6.d($$7, $$10, $$8);
                  dww $$11 = $$0.a_($$6);
                  if (!$$11.a(djn.a)) {
                     while ($$4.hasNext()) {
                        ecr $$12 = (ecr)$$4.next();
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

   public boolean a(int $$0, int $$1, int $$2, dww $$3) {
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
            ji.a $$5 = new ji.a();

            for (int $$6 = $$1 - 1; $$6 >= this.f.L_(); $$6--) {
               $$5.d($$0, $$6, $$2);
               if (this.e.test(this.f.a_($$5))) {
                  this.a($$0, $$2, $$6 + 1);
                  return true;
               }
            }

            this.a($$0, $$2, this.f.L_());
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
      return this.d.a($$0) + this.f.L_();
   }

   private void a(int $$0, int $$1, int $$2) {
      this.d.b(c($$0, $$1), $$2 - this.f.L_());
   }

   public void a(dyr $$0, ecr.a $$1, long[] $$2) {
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

   public static enum a implements azv {
      a("WORLD_SURFACE_WG", ecr.b.a, ecr.b),
      b("WORLD_SURFACE", ecr.b.c, ecr.b),
      c("OCEAN_FLOOR_WG", ecr.b.a, ecr.c),
      d("OCEAN_FLOOR", ecr.b.b, ecr.c),
      e("MOTION_BLOCKING", ecr.b.c, $$0 -> $$0.d() || !$$0.y().c()),
      f("MOTION_BLOCKING_NO_LEAVES", ecr.b.b, $$0 -> ($$0.d() || !$$0.y().c()) && !($$0.b() instanceof dnx));

      public static final Codec<ecr.a> g = azv.a(ecr.a::values);
      private final String h;
      private final ecr.b i;
      private final Predicate<dww> j;

      private a(final String $$0, final ecr.b $$1, final Predicate<dww> $$2) {
         this.h = $$0;
         this.i = $$1;
         this.j = $$2;
      }

      public String a() {
         return this.h;
      }

      public boolean b() {
         return this.i == ecr.b.c;
      }

      public boolean d() {
         return this.i != ecr.b.a;
      }

      public Predicate<dww> e() {
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
