import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cwx extends cvx {
   public static final Predicate<cwb> c = $$0 -> $$0.a(axj.aX);
   public static final Predicate<cwb> d = c.or($$0 -> $$0.a(cwf.uw));

   public cwx(cvx.a $$0) {
      super($$0);
   }

   public Predicate<cwb> d() {
      return this.b();
   }

   public abstract Predicate<cwb> b();

   public static cwb a(bva $$0, Predicate<cwb> $$1) {
      if ($$1.test($$0.b(bsc.b))) {
         return $$0.b(bsc.b);
      } else {
         return $$1.test($$0.b(bsc.a)) ? $$0.b(bsc.a) : cwb.k;
      }
   }

   public abstract int c();

   protected void a(arn $$0, bva $$1, bsc $$2, cwb $$3, List<cwb> $$4, float $$5, float $$6, boolean $$7, @Nullable bva $$8) {
      float $$9 = dbu.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cwb $$14 = $$4.get($$13);
         if (!$$14.f()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            cpg.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6x -> this.a($$1, $$6x, $$16, $$5, $$6, $$15, $$8));
            $$3.a(this.h($$14), $$1, bva.d($$2));
            if ($$3.f()) {
               break;
            }
         }
      }
   }

   protected int h(cwb $$0) {
      return 1;
   }

   protected abstract void a(bva var1, cpg var2, int var3, float var4, float var5, float var6, @Nullable bva var7);

   protected cpg a(dfb $$0, bva $$1, cwb $$2, cwb $$3, boolean $$4) {
      cuc $$6 = $$3.h() instanceof cuc $$5 ? $$5 : (cuc)cwf.ox;
      cou $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.a(true);
      }

      return $$7;
   }

   protected static List<cwb> a(cwb $$0, cwb $$1, bva $$2) {
      if ($$1.f()) {
         return List.of();
      } else {
         int $$4 = $$2.dX() instanceof arn $$3 ? dbu.a($$3, $$0, $$2, 1) : 1;
         List<cwb> $$5 = new ArrayList<>($$4);
         cwb $$6 = $$1.v();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            cwb $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.f()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static cwb a(cwb $$0, cwb $$1, bva $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fX() && $$2.dX() instanceof arn $$4 ? dbu.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.L()) {
         return cwb.k;
      } else if ($$5 == 0) {
         cwb $$6 = $$1.c(1);
         $$6.b(ku.v, bap.a);
         return $$6;
      } else {
         cwb $$7 = $$1.a($$5);
         if ($$1.f() && $$2 instanceof com $$8) {
            $$8.gk().h($$1);
         }

         return $$7;
      }
   }
}
