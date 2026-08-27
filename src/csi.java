import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class csi extends crn {
   public static final Predicate<crs> c = $$0 -> $$0.a(avm.at);
   public static final Predicate<crs> j = c.or($$0 -> $$0.a(crv.us));

   public csi(crn.a $$0) {
      super($$0);
   }

   public Predicate<crs> d() {
      return this.b();
   }

   public abstract Predicate<crs> b();

   public static crs a(bqt $$0, Predicate<crs> $$1) {
      if ($$1.test($$0.b(boe.b))) {
         return $$0.b(boe.b);
      } else {
         return $$1.test($$0.b(boe.a)) ? $$0.b(boe.a) : crs.i;
      }
   }

   @Override
   public int g() {
      return 1;
   }

   public abstract int c();

   protected void a(czg $$0, bqt $$1, boe $$2, crs $$3, List<crs> $$4, float $$5, float $$6, boolean $$7, @Nullable bqt $$8) {
      float $$9 = 10.0F;
      float $$10 = $$4.size() == 1 ? 0.0F : 20.0F / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         crs $$14 = $$4.get($$13);
         if (!$$14.d()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            $$3.a(this.k($$14), $$1, bqt.d($$2));
            cks $$16 = this.a($$0, $$1, $$3, $$14, $$7);
            this.a($$1, $$16, $$13, $$5, $$6, $$15, $$8);
            $$0.b($$16);
         }
      }
   }

   protected int k(crs $$0) {
      return 1;
   }

   protected abstract void a(bqt var1, cks var2, int var3, float var4, float var5, float var6, @Nullable bqt var7);

   protected cks a(czg $$0, bqt $$1, crs $$2, crs $$3, boolean $$4) {
      cpl $$6 = $$3.f() instanceof cpl $$5 ? $$5 : (cpl)crv.ou;
      ckg $$7 = $$6.a($$0, $$3, $$1);
      if ($$4) {
         $$7.a(true);
      }

      int $$8 = cxa.a(cxc.y, $$2);
      if ($$8 > 0) {
         $$7.h($$7.z() + (double)$$8 * 0.5 + 0.5);
      }

      int $$9 = cxa.a(cxc.z, $$2);
      if ($$9 > 0) {
         $$7.b($$9);
      }

      if (cxa.a(cxc.A, $$2) > 0) {
         $$7.g(100);
      }

      int $$10 = cxa.a(cxc.K, $$2);
      if ($$10 > 0) {
         $$7.a((byte)$$10);
      }

      return $$7;
   }

   protected static boolean a(crs $$0, crs $$1, boolean $$2) {
      return $$2 || $$1.a(crv.ou) && cxa.a(cxc.B, $$0) > 0;
   }

   protected static List<crs> a(crs $$0, crs $$1, bqt $$2) {
      if ($$1.d()) {
         return List.of();
      } else {
         int $$3 = cxa.a(cxc.I, $$0);
         int $$4 = $$3 == 0 ? 1 : 3;
         List<crs> $$5 = new ArrayList<>($$4);
         crs $$6 = $$1.r();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            $$5.add(a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0));
         }

         return $$5;
      }
   }

   protected static crs a(crs $$0, crs $$1, bqt $$2, boolean $$3) {
      boolean $$4 = !$$3 && !a($$0, $$1, $$2.fM());
      if (!$$4) {
         crs $$5 = $$1.c(1);
         $$5.b(jr.o, ayo.a);
         return $$5;
      } else {
         crs $$6 = $$1.a(1);
         if ($$1.d() && $$2 instanceof cka $$7) {
            $$7.fZ().g($$1);
         }

         return $$6;
      }
   }
}
