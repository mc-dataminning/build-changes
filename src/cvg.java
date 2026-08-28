import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cvg extends cui {
   public static final Predicate<cun> c = $$0 -> $$0.a(awx.aU);
   public static final Predicate<cun> j = c.or($$0 -> $$0.a(cuq.uu));

   public cvg(cui.a $$0) {
      super($$0);
   }

   public Predicate<cun> d() {
      return this.b();
   }

   public abstract Predicate<cun> b();

   public static cun a(btn $$0, Predicate<cun> $$1) {
      if ($$1.test($$0.b(bqr.b))) {
         return $$0.b(bqr.b);
      } else {
         return $$1.test($$0.b(bqr.a)) ? $$0.b(bqr.a) : cun.l;
      }
   }

   @Override
   public int g() {
      return 1;
   }

   public abstract int c();

   protected void a(dbw $$0, btn $$1, bqr $$2, cun $$3, List<cun> $$4, float $$5, float $$6, boolean $$7, @Nullable btn $$8) {
      float $$9 = 10.0F;
      float $$10 = $$4.size() == 1 ? 0.0F : 20.0F / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cun $$14 = $$4.get($$13);
         if (!$$14.e()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            $$3.a(this.k($$14), $$1, btn.d($$2));
            cnn $$16 = this.a($$0, $$1, $$3, $$14, $$7);
            this.a($$1, $$16, $$13, $$5, $$6, $$15, $$8);
            $$0.b($$16);
         }
      }
   }

   protected int k(cun $$0) {
      return 1;
   }

   protected abstract void a(btn var1, cnn var2, int var3, float var4, float var5, float var6, @Nullable btn var7);

   protected cnn a(dbw $$0, btn $$1, cun $$2, cun $$3, boolean $$4) {
      csg $$6 = $$3.g() instanceof csg $$5 ? $$5 : (csg)cuq.ov;
      cnb $$7 = $$6.a($$0, $$3, $$1);
      if ($$4) {
         $$7.a(true);
      }

      int $$8 = czz.a(dab.y, $$2);
      if ($$8 > 0) {
         $$7.h($$7.z() + (double)$$8 * 0.5 + 0.5);
      }

      int $$9 = czz.a(dab.z, $$2);
      if ($$9 > 0) {
         $$7.b($$9);
      }

      if (czz.a(dab.A, $$2) > 0) {
         $$7.g(100);
      }

      int $$10 = czz.a(dab.K, $$2);
      if ($$10 > 0) {
         $$7.a((byte)$$10);
      }

      return $$7;
   }

   protected static boolean a(cun $$0, cun $$1, boolean $$2) {
      return $$2 || $$1.a(cuq.ov) && czz.a(dab.B, $$0) > 0;
   }

   protected static List<cun> a(cun $$0, cun $$1, btn $$2) {
      if ($$1.e()) {
         return List.of();
      } else {
         int $$3 = czz.a(dab.I, $$0);
         int $$4 = $$3 == 0 ? 1 : 3;
         List<cun> $$5 = new ArrayList<>($$4);
         cun $$6 = $$1.s();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            $$5.add(a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0));
         }

         return $$5;
      }
   }

   protected static cun a(cun $$0, cun $$1, btn $$2, boolean $$3) {
      boolean $$4 = !$$3 && !a($$0, $$1, $$2.fP());
      if (!$$4) {
         cun $$5 = $$1.c(1);
         $$5.b(km.t, baa.a);
         return $$5;
      } else {
         cun $$6 = $$1.a(1);
         if ($$1.e() && $$2 instanceof cmv $$7) {
            $$7.gc().h($$1);
         }

         return $$6;
      }
   }
}
