import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cwt extends cvt {
   public static final Predicate<cvx> c = $$0 -> $$0.a(axi.aU);
   public static final Predicate<cvx> d = c.or($$0 -> $$0.a(cwb.uw));

   public cwt(cvt.a $$0) {
      super($$0);
   }

   public Predicate<cvx> d() {
      return this.b();
   }

   public abstract Predicate<cvx> b();

   public static cvx a(buv $$0, Predicate<cvx> $$1) {
      if ($$1.test($$0.b(brx.b))) {
         return $$0.b(brx.b);
      } else {
         return $$1.test($$0.b(brx.a)) ? $$0.b(brx.a) : cvx.k;
      }
   }

   public abstract int c();

   protected void a(arm $$0, buv $$1, brx $$2, cvx $$3, List<cvx> $$4, float $$5, float $$6, boolean $$7, @Nullable buv $$8) {
      float $$9 = dbo.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cvx $$14 = $$4.get($$13);
         if (!$$14.f()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            cpb.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6x -> this.a($$1, $$6x, $$16, $$5, $$6, $$15, $$8));
            $$3.a(this.h($$14), $$1, buv.d($$2));
            if ($$3.f()) {
               break;
            }
         }
      }
   }

   protected int h(cvx $$0) {
      return 1;
   }

   protected abstract void a(buv var1, cpb var2, int var3, float var4, float var5, float var6, @Nullable buv var7);

   protected cpb a(dev $$0, buv $$1, cvx $$2, cvx $$3, boolean $$4) {
      ctx $$6 = $$3.h() instanceof ctx $$5 ? $$5 : (ctx)cwb.ox;
      cop $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.a(true);
      }

      return $$7;
   }

   protected static List<cvx> a(cvx $$0, cvx $$1, buv $$2) {
      if ($$1.f()) {
         return List.of();
      } else {
         int $$4 = $$2.dX() instanceof arm $$3 ? dbo.a($$3, $$0, $$2, 1) : 1;
         List<cvx> $$5 = new ArrayList<>($$4);
         cvx $$6 = $$1.v();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            cvx $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.f()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static cvx a(cvx $$0, cvx $$1, buv $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fX() && $$2.dX() instanceof arm $$4 ? dbo.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.L()) {
         return cvx.k;
      } else if ($$5 == 0) {
         cvx $$6 = $$1.c(1);
         $$6.b(kt.v, bao.a);
         return $$6;
      } else {
         cvx $$7 = $$1.a($$5);
         if ($$1.f() && $$2 instanceof coh $$8) {
            $$8.gk().h($$1);
         }

         return $$7;
      }
   }
}
