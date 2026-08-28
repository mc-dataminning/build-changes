import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class dat extends czu {
   public static final Predicate<czy> c = $$0 -> $$0.a(axm.aY);
   public static final Predicate<czy> d = c.or($$0 -> $$0.a(dac.vE));

   public dat(czu.a $$0) {
      super($$0);
   }

   public Predicate<czy> c() {
      return this.a();
   }

   public abstract Predicate<czy> a();

   public static czy a(bxu $$0, Predicate<czy> $$1) {
      if ($$1.test($$0.b(buq.b))) {
         return $$0.b(buq.b);
      } else {
         return $$1.test($$0.b(buq.a)) ? $$0.b(buq.a) : czy.k;
      }
   }

   public abstract int b();

   protected void a(ars $$0, bxu $$1, buq $$2, czy $$3, List<czy> $$4, float $$5, float $$6, boolean $$7, @Nullable bxu $$8) {
      float $$9 = dgn.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         czy $$14 = $$4.get($$13);
         if (!$$14.f()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            css.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6x -> this.a($$1, $$6x, $$16, $$5, $$6, $$15, $$8));
            $$3.a(this.h($$14), $$1, bxu.d($$2));
            if ($$3.f()) {
               break;
            }
         }
      }
   }

   protected int h(czy $$0) {
      return 1;
   }

   protected abstract void a(bxu var1, css var2, int var3, float var4, float var5, float var6, @Nullable bxu var7);

   protected css a(djx $$0, bxu $$1, czy $$2, czy $$3, boolean $$4) {
      cyc $$6 = $$3.h() instanceof cyc $$5 ? $$5 : (cyc)dac.pk;
      csf $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.b(true);
      }

      return $$7;
   }

   protected static List<czy> a(czy $$0, czy $$1, bxu $$2) {
      if ($$1.f()) {
         return List.of();
      } else {
         int $$4 = $$2.dV() instanceof ars $$3 ? dgn.a($$3, $$0, $$2, 1) : 1;
         List<czy> $$5 = new ArrayList<>($$4);
         czy $$6 = $$1.v();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            czy $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.f()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static czy a(czy $$0, czy $$1, bxu $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fV() && $$2.dV() instanceof ars $$4 ? dgn.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.M()) {
         return czy.k;
      } else if ($$5 == 0) {
         czy $$6 = $$1.c(1);
         $$6.b(kk.u, baw.a);
         return $$6;
      } else {
         czy $$7 = $$1.a($$5);
         if ($$1.f() && $$2 instanceof crx $$8) {
            $$8.gj().i($$1);
         }

         return $$7;
      }
   }
}
