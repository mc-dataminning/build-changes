import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cvd extends cuf {
   public static final Predicate<cuk> c = $$0 -> $$0.a(awu.aU);
   public static final Predicate<cuk> j = c.or($$0 -> $$0.a(cun.uu));

   public cvd(cuf.a $$0) {
      super($$0);
   }

   public Predicate<cuk> d() {
      return this.b();
   }

   public abstract Predicate<cuk> b();

   public static cuk a(btk $$0, Predicate<cuk> $$1) {
      if ($$1.test($$0.b(bqo.b))) {
         return $$0.b(bqo.b);
      } else {
         return $$1.test($$0.b(bqo.a)) ? $$0.b(bqo.a) : cuk.l;
      }
   }

   @Override
   public int g() {
      return 1;
   }

   public abstract int c();

   protected void a(dbt $$0, btk $$1, bqo $$2, cuk $$3, List<cuk> $$4, float $$5, float $$6, boolean $$7, @Nullable btk $$8) {
      float $$9 = 10.0F;
      float $$10 = $$4.size() == 1 ? 0.0F : 20.0F / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cuk $$14 = $$4.get($$13);
         if (!$$14.e()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            $$3.a(this.k($$14), $$1, btk.d($$2));
            cnk $$16 = this.a($$0, $$1, $$3, $$14, $$7);
            this.a($$1, $$16, $$13, $$5, $$6, $$15, $$8);
            $$0.b($$16);
         }
      }
   }

   protected int k(cuk $$0) {
      return 1;
   }

   protected abstract void a(btk var1, cnk var2, int var3, float var4, float var5, float var6, @Nullable btk var7);

   protected cnk a(dbt $$0, btk $$1, cuk $$2, cuk $$3, boolean $$4) {
      csd $$6 = $$3.g() instanceof csd $$5 ? $$5 : (csd)cun.ov;
      cmy $$7 = $$6.a($$0, $$3, $$1);
      if ($$4) {
         $$7.a(true);
      }

      int $$8 = czw.a(czy.y, $$2);
      if ($$8 > 0) {
         $$7.h($$7.z() + (double)$$8 * 0.5 + 0.5);
      }

      int $$9 = czw.a(czy.z, $$2);
      if ($$9 > 0) {
         $$7.b($$9);
      }

      if (czw.a(czy.A, $$2) > 0) {
         $$7.g(100);
      }

      int $$10 = czw.a(czy.K, $$2);
      if ($$10 > 0) {
         $$7.a((byte)$$10);
      }

      return $$7;
   }

   protected static boolean a(cuk $$0, cuk $$1, boolean $$2) {
      return $$2 || $$1.a(cun.ov) && czw.a(czy.B, $$0) > 0;
   }

   protected static List<cuk> a(cuk $$0, cuk $$1, btk $$2) {
      if ($$1.e()) {
         return List.of();
      } else {
         int $$3 = czw.a(czy.I, $$0);
         int $$4 = $$3 == 0 ? 1 : 3;
         List<cuk> $$5 = new ArrayList<>($$4);
         cuk $$6 = $$1.s();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            $$5.add(a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0));
         }

         return $$5;
      }
   }

   protected static cuk a(cuk $$0, cuk $$1, btk $$2, boolean $$3) {
      boolean $$4 = !$$3 && !a($$0, $$1, $$2.fP());
      if (!$$4) {
         cuk $$5 = $$1.c(1);
         $$5.b(km.t, azx.a);
         return $$5;
      } else {
         cuk $$6 = $$1.a(1);
         if ($$1.e() && $$2 instanceof cms $$7) {
            $$7.gc().h($$1);
         }

         return $$6;
      }
   }
}
