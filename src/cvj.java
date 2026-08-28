import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cvj extends cul {
   public static final Predicate<cuq> c = $$0 -> $$0.a(awy.aU);
   public static final Predicate<cuq> j = c.or($$0 -> $$0.a(cut.uu));

   public cvj(cul.a $$0) {
      super($$0);
   }

   public Predicate<cuq> d() {
      return this.b();
   }

   public abstract Predicate<cuq> b();

   public static cuq a(btq $$0, Predicate<cuq> $$1) {
      if ($$1.test($$0.b(bqu.b))) {
         return $$0.b(bqu.b);
      } else {
         return $$1.test($$0.b(bqu.a)) ? $$0.b(bqu.a) : cuq.l;
      }
   }

   @Override
   public int g() {
      return 1;
   }

   public abstract int c();

   protected void a(dbz $$0, btq $$1, bqu $$2, cuq $$3, List<cuq> $$4, float $$5, float $$6, boolean $$7, @Nullable btq $$8) {
      float $$9 = 10.0F;
      float $$10 = $$4.size() == 1 ? 0.0F : 20.0F / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cuq $$14 = $$4.get($$13);
         if (!$$14.e()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            $$3.a(this.k($$14), $$1, btq.d($$2));
            cnq $$16 = this.a($$0, $$1, $$3, $$14, $$7);
            this.a($$1, $$16, $$13, $$5, $$6, $$15, $$8);
            $$0.b($$16);
         }
      }
   }

   protected int k(cuq $$0) {
      return 1;
   }

   protected abstract void a(btq var1, cnq var2, int var3, float var4, float var5, float var6, @Nullable btq var7);

   protected cnq a(dbz $$0, btq $$1, cuq $$2, cuq $$3, boolean $$4) {
      csj $$6 = $$3.g() instanceof csj $$5 ? $$5 : (csj)cut.ov;
      cne $$7 = $$6.a($$0, $$3, $$1);
      if ($$4) {
         $$7.a(true);
      }

      int $$8 = dac.a(dae.y, $$2);
      if ($$8 > 0) {
         $$7.h($$7.z() + (double)$$8 * 0.5 + 0.5);
      }

      int $$9 = dac.a(dae.z, $$2);
      if ($$9 > 0) {
         $$7.b($$9);
      }

      if (dac.a(dae.A, $$2) > 0) {
         $$7.g(100);
      }

      int $$10 = dac.a(dae.K, $$2);
      if ($$10 > 0) {
         $$7.a((byte)$$10);
      }

      return $$7;
   }

   protected static boolean a(cuq $$0, cuq $$1, boolean $$2) {
      return $$2 || $$1.a(cut.ov) && dac.a(dae.B, $$0) > 0;
   }

   protected static List<cuq> a(cuq $$0, cuq $$1, btq $$2) {
      if ($$1.e()) {
         return List.of();
      } else {
         int $$3 = dac.a(dae.I, $$0);
         int $$4 = $$3 == 0 ? 1 : 3;
         List<cuq> $$5 = new ArrayList<>($$4);
         cuq $$6 = $$1.s();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            $$5.add(a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0));
         }

         return $$5;
      }
   }

   protected static cuq a(cuq $$0, cuq $$1, btq $$2, boolean $$3) {
      boolean $$4 = !$$3 && !a($$0, $$1, $$2.fP());
      if (!$$4) {
         cuq $$5 = $$1.c(1);
         $$5.b(km.u, bac.a);
         return $$5;
      } else {
         cuq $$6 = $$1.a(1);
         if ($$1.e() && $$2 instanceof cmy $$7) {
            $$7.gc().h($$1);
         }

         return $$6;
      }
   }
}
