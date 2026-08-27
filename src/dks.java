import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class dks {
   private static final Logger a = LogUtils.getLogger();
   static final Predicate<dfj> b = $$0 -> !$$0.i();
   static final Predicate<dfj> c = dfi.a::d;
   private final aqp d;
   private final Predicate<dfj> e;
   private final dhf f;

   public dks(dhf $$0, dks.a $$1) {
      this.e = $$1.e();
      this.f = $$0;
      int $$2 = arw.e($$0.I_() + 1);
      this.d = new asj($$2, 256);
   }

   public static void a(dhf $$0, Set<dks.a> $$1) {
      int $$2 = $$1.size();
      ObjectList<dks> $$3 = new ObjectArrayList($$2);
      ObjectListIterator<dks> $$4 = $$3.iterator();
      int $$5 = $$0.b() + 16;
      gw.a $$6 = new gw.a();

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            for (dks.a $$9 : $$1) {
               $$3.add($$0.a($$9));
            }

            for (int $$10 = $$5 - 1; $$10 >= $$0.H_(); $$10--) {
               $$6.d($$7, $$10, $$8);
               dfj $$11 = $$0.a_($$6);
               if (!$$11.a(csw.a)) {
                  while ($$4.hasNext()) {
                     dks $$12 = (dks)$$4.next();
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

   public boolean a(int $$0, int $$1, int $$2, dfj $$3) {
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
            gw.a $$5 = new gw.a();

            for (int $$6 = $$1 - 1; $$6 >= this.f.H_(); $$6--) {
               $$5.d($$0, $$6, $$2);
               if (this.e.test(this.f.a_($$5))) {
                  this.a($$0, $$2, $$6 + 1);
                  return true;
               }
            }

            this.a($$0, $$2, this.f.H_());
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
      return this.d.a($$0) + this.f.H_();
   }

   private void a(int $$0, int $$1, int $$2) {
      this.d.b(c($$0, $$1), $$2 - this.f.H_());
   }

   public void a(dhf $$0, dks.a $$1, long[] $$2) {
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

   public static enum a implements asp {
      a("WORLD_SURFACE_WG", dks.b.a, dks.b),
      b("WORLD_SURFACE", dks.b.c, dks.b),
      c("OCEAN_FLOOR_WG", dks.b.a, dks.c),
      d("OCEAN_FLOOR", dks.b.b, dks.c),
      e("MOTION_BLOCKING", dks.b.c, $$0 -> $$0.d() || !$$0.u().c()),
      f("MOTION_BLOCKING_NO_LEAVES", dks.b.b, $$0 -> ($$0.d() || !$$0.u().c()) && !($$0.b() instanceof cxc));

      public static final Codec<dks.a> g = asp.a(dks.a::values);
      private final String h;
      private final dks.b i;
      private final Predicate<dfj> j;

      private a(String $$0, dks.b $$1, Predicate<dfj> $$2) {
         this.h = $$0;
         this.i = $$1;
         this.j = $$2;
      }

      public String a() {
         return this.h;
      }

      public boolean b() {
         return this.i == dks.b.c;
      }

      public boolean d() {
         return this.i != dks.b.a;
      }

      public Predicate<dfj> e() {
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
