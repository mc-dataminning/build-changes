import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cuj extends ctl {
   public static final Predicate<ctq> c = $$0 -> $$0.a(awf.aU);
   public static final Predicate<ctq> j = c.or($$0 -> $$0.a(ctt.uu));

   public cuj(ctl.a $$0) {
      super($$0);
   }

   public Predicate<ctq> d() {
      return this.b();
   }

   public abstract Predicate<ctq> b();

   public static ctq a(bsq $$0, Predicate<ctq> $$1) {
      if ($$1.test($$0.b(bpv.b))) {
         return $$0.b(bpv.b);
      } else {
         return $$1.test($$0.b(bpv.a)) ? $$0.b(bpv.a) : ctq.i;
      }
   }

   @Override
   public int g() {
      return 1;
   }

   public abstract int c();

   protected void a(daz $$0, bsq $$1, bpv $$2, ctq $$3, List<ctq> $$4, float $$5, float $$6, boolean $$7, @Nullable bsq $$8) {
      float $$9 = 10.0F;
      float $$10 = $$4.size() == 1 ? 0.0F : 20.0F / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         ctq $$14 = $$4.get($$13);
         if (!$$14.e()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            $$3.a(this.k($$14), $$1, bsq.d($$2));
            cmq $$16 = this.a($$0, $$1, $$3, $$14, $$7);
            this.a($$1, $$16, $$13, $$5, $$6, $$15, $$8);
            $$0.b($$16);
         }
      }
   }

   protected int k(ctq $$0) {
      return 1;
   }

   protected abstract void a(bsq var1, cmq var2, int var3, float var4, float var5, float var6, @Nullable bsq var7);

   protected cmq a(daz $$0, bsq $$1, ctq $$2, ctq $$3, boolean $$4) {
      crj $$6 = $$3.g() instanceof crj $$5 ? $$5 : (crj)ctt.ov;
      cme $$7 = $$6.a($$0, $$3, $$1);
      if ($$4) {
         $$7.a(true);
      }

      int $$8 = czc.a(cze.y, $$2);
      if ($$8 > 0) {
         $$7.h($$7.z() + (double)$$8 * 0.5 + 0.5);
      }

      int $$9 = czc.a(cze.z, $$2);
      if ($$9 > 0) {
         $$7.b($$9);
      }

      if (czc.a(cze.A, $$2) > 0) {
         $$7.g(100);
      }

      int $$10 = czc.a(cze.K, $$2);
      if ($$10 > 0) {
         $$7.a((byte)$$10);
      }

      return $$7;
   }

   protected static boolean a(ctq $$0, ctq $$1, boolean $$2) {
      return $$2 || $$1.a(ctt.ov) && czc.a(cze.B, $$0) > 0;
   }

   protected static List<ctq> a(ctq $$0, ctq $$1, bsq $$2) {
      if ($$1.e()) {
         return List.of();
      } else {
         int $$3 = czc.a(cze.I, $$0);
         int $$4 = $$3 == 0 ? 1 : 3;
         List<ctq> $$5 = new ArrayList<>($$4);
         ctq $$6 = $$1.s();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            $$5.add(a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0));
         }

         return $$5;
      }
   }

   protected static ctq a(ctq $$0, ctq $$1, bsq $$2, boolean $$3) {
      boolean $$4 = !$$3 && !a($$0, $$1, $$2.fP());
      if (!$$4) {
         ctq $$5 = $$1.c(1);
         $$5.b(kb.t, azh.a);
         return $$5;
      } else {
         ctq $$6 = $$1.a(1);
         if ($$1.e() && $$2 instanceof cly $$7) {
            $$7.gc().h($$1);
         }

         return $$6;
      }
   }
}
