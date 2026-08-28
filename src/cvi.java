import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cvi extends cuk {
   public static final Predicate<cup> c = $$0 -> $$0.a(awy.aU);
   public static final Predicate<cup> j = c.or($$0 -> $$0.a(cus.uu));

   public cvi(cuk.a $$0) {
      super($$0);
   }

   public Predicate<cup> d() {
      return this.b();
   }

   public abstract Predicate<cup> b();

   public static cup a(btp $$0, Predicate<cup> $$1) {
      if ($$1.test($$0.b(bqt.b))) {
         return $$0.b(bqt.b);
      } else {
         return $$1.test($$0.b(bqt.a)) ? $$0.b(bqt.a) : cup.l;
      }
   }

   @Override
   public int g() {
      return 1;
   }

   public abstract int c();

   protected void a(dby $$0, btp $$1, bqt $$2, cup $$3, List<cup> $$4, float $$5, float $$6, boolean $$7, @Nullable btp $$8) {
      float $$9 = 10.0F;
      float $$10 = $$4.size() == 1 ? 0.0F : 20.0F / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cup $$14 = $$4.get($$13);
         if (!$$14.e()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            $$3.a(this.k($$14), $$1, btp.d($$2));
            cnp $$16 = this.a($$0, $$1, $$3, $$14, $$7);
            this.a($$1, $$16, $$13, $$5, $$6, $$15, $$8);
            $$0.b($$16);
         }
      }
   }

   protected int k(cup $$0) {
      return 1;
   }

   protected abstract void a(btp var1, cnp var2, int var3, float var4, float var5, float var6, @Nullable btp var7);

   protected cnp a(dby $$0, btp $$1, cup $$2, cup $$3, boolean $$4) {
      csi $$6 = $$3.g() instanceof csi $$5 ? $$5 : (csi)cus.ov;
      cnd $$7 = $$6.a($$0, $$3, $$1);
      if ($$4) {
         $$7.a(true);
      }

      int $$8 = dab.a(dad.y, $$2);
      if ($$8 > 0) {
         $$7.h($$7.z() + (double)$$8 * 0.5 + 0.5);
      }

      int $$9 = dab.a(dad.z, $$2);
      if ($$9 > 0) {
         $$7.b($$9);
      }

      if (dab.a(dad.A, $$2) > 0) {
         $$7.g(100);
      }

      int $$10 = dab.a(dad.K, $$2);
      if ($$10 > 0) {
         $$7.a((byte)$$10);
      }

      return $$7;
   }

   protected static boolean a(cup $$0, cup $$1, boolean $$2) {
      return $$2 || $$1.a(cus.ov) && dab.a(dad.B, $$0) > 0;
   }

   protected static List<cup> a(cup $$0, cup $$1, btp $$2) {
      if ($$1.e()) {
         return List.of();
      } else {
         int $$3 = dab.a(dad.I, $$0);
         int $$4 = $$3 == 0 ? 1 : 3;
         List<cup> $$5 = new ArrayList<>($$4);
         cup $$6 = $$1.s();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            $$5.add(a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0));
         }

         return $$5;
      }
   }

   protected static cup a(cup $$0, cup $$1, btp $$2, boolean $$3) {
      boolean $$4 = !$$3 && !a($$0, $$1, $$2.fP());
      if (!$$4) {
         cup $$5 = $$1.c(1);
         $$5.b(km.u, bac.a);
         return $$5;
      } else {
         cup $$6 = $$1.a(1);
         if ($$1.e() && $$2 instanceof cmx $$7) {
            $$7.gc().h($$1);
         }

         return $$6;
      }
   }
}
