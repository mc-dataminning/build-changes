import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class czt extends cyu {
   public static final Predicate<cyy> c = $$0 -> $$0.a(axk.aX);
   public static final Predicate<cyy> d = c.or($$0 -> $$0.a(czc.vz));

   public czt(cyu.a $$0) {
      super($$0);
   }

   public Predicate<cyy> c() {
      return this.a();
   }

   public abstract Predicate<cyy> a();

   public static cyy a(bxc $$0, Predicate<cyy> $$1) {
      if ($$1.test($$0.b(bua.b))) {
         return $$0.b(bua.b);
      } else {
         return $$1.test($$0.b(bua.a)) ? $$0.b(bua.a) : cyy.k;
      }
   }

   public abstract int b();

   protected void a(arq $$0, bxc $$1, bua $$2, cyy $$3, List<cyy> $$4, float $$5, float $$6, boolean $$7, @Nullable bxc $$8) {
      float $$9 = dfn.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cyy $$14 = $$4.get($$13);
         if (!$$14.f()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            crs.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6x -> this.a($$1, $$6x, $$16, $$5, $$6, $$15, $$8));
            $$3.a(this.h($$14), $$1, bxc.d($$2));
            if ($$3.f()) {
               break;
            }
         }
      }
   }

   protected int h(cyy $$0) {
      return 1;
   }

   protected abstract void a(bxc var1, crs var2, int var3, float var4, float var5, float var6, @Nullable bxc var7);

   protected crs a(div $$0, bxc $$1, cyy $$2, cyy $$3, boolean $$4) {
      cxc $$6 = $$3.h() instanceof cxc $$5 ? $$5 : (cxc)czc.ph;
      crf $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.b(true);
      }

      return $$7;
   }

   protected static List<cyy> a(cyy $$0, cyy $$1, bxc $$2) {
      if ($$1.f()) {
         return List.of();
      } else {
         int $$4 = $$2.dV() instanceof arq $$3 ? dfn.a($$3, $$0, $$2, 1) : 1;
         List<cyy> $$5 = new ArrayList<>($$4);
         cyy $$6 = $$1.v();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            cyy $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.f()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static cyy a(cyy $$0, cyy $$1, bxc $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fU() && $$2.dV() instanceof arq $$4 ? dfn.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.M()) {
         return cyy.k;
      } else if ($$5 == 0) {
         cyy $$6 = $$1.c(1);
         $$6.b(kj.u, bau.a);
         return $$6;
      } else {
         cyy $$7 = $$1.a($$5);
         if ($$1.f() && $$2 instanceof cqy $$8) {
            $$8.gi().h($$1);
         }

         return $$7;
      }
   }
}
