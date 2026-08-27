import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cvi extends cuc {
   public static final Predicate<cuh> c = $$0 -> $$0.a(awm.aV);
   public static final Predicate<cuh> j = c.or($$0 -> $$0.a(cuk.wf));
   public static final Predicate<cuh> k = $$0 -> $$0.a(cuk.vT);

   public cvi(cuc.a $$0) {
      super($$0);
   }

   public Predicate<cuh> d() {
      return this.b();
   }

   public abstract Predicate<cuh> b();

   public static cuh a(bso $$0, Predicate<cuh> $$1) {
      if ($$1.test($$0.b(bpz.b))) {
         return $$0.b(bpz.b);
      } else {
         return $$1.test($$0.b(bpz.a)) ? $$0.b(bpz.a) : cuh.i;
      }
   }

   @Override
   public int g() {
      return 1;
   }

   public abstract int c();

   protected void a(dca $$0, bso $$1, bpz $$2, cuh $$3, List<cuh> $$4, float $$5, float $$6, boolean $$7, @Nullable bso $$8) {
      float $$9 = 10.0F;
      float $$10 = $$4.size() == 1 ? 0.0F : 20.0F / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cuh $$14 = $$4.get($$13);
         if (!$$14.d()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            $$3.a(this.k($$14), $$1, bso.d($$2));
            cms $$16 = this.a($$0, $$1, $$3, $$14, $$7);
            this.a($$1, $$16, $$13, $$5, $$6, $$15, $$8);
            $$0.b($$16);
         }
      }
   }

   protected int k(cuh $$0) {
      return 1;
   }

   protected abstract void a(bso var1, cms var2, int var3, float var4, float var5, float var6, @Nullable bso var7);

   protected cms a(dca $$0, bso $$1, cuh $$2, cuh $$3, boolean $$4) {
      crx $$6 = $$3.f() instanceof crx $$5 ? $$5 : (crx)cuk.pL;
      cme $$7 = $$6.a($$0, $$3, $$1);
      if ($$4) {
         $$7.a(true);
      }

      int $$8 = dae.a(dag.z, $$2);
      if ($$8 > 0) {
         $$7.h($$7.z() + (double)$$8 * 0.5 + 0.5);
      }

      int $$9 = dae.a(dag.A, $$2);
      if ($$9 > 0) {
         $$7.b($$9);
      }

      if (dae.a(dag.B, $$2) > 0) {
         $$7.g(100);
      }

      int $$10 = dae.a(dag.L, $$2);
      if ($$10 > 0) {
         $$7.a((byte)$$10);
      }

      return $$7;
   }

   protected static boolean a(cuh $$0, cuh $$1, boolean $$2) {
      return $$2 || $$1.a(cuk.pL) && dae.a(dag.C, $$0) > 0;
   }

   protected static List<cuh> a(cuh $$0, cuh $$1, bso $$2) {
      if ($$1.d()) {
         return List.of();
      } else {
         int $$3 = dae.a(dag.J, $$0);
         int $$4 = $$3 == 0 ? 1 : 3;
         List<cuh> $$5 = new ArrayList<>($$4);
         cuh $$6 = $$1.r();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            $$5.add(a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0));
         }

         return $$5;
      }
   }

   protected static cuh a(cuh $$0, cuh $$1, bso $$2, boolean $$3) {
      boolean $$4 = !$$3 && !a($$0, $$1, $$2.fY());
      if (!$$4) {
         cuh $$5 = $$1.c(1);
         $$5.b(ke.s, azo.a);
         return $$5;
      } else {
         cuh $$6 = $$1.a(1);
         if ($$1.d() && $$2 instanceof cly $$7) {
            $$7.gl().h($$1);
         }

         return $$6;
      }
   }
}
