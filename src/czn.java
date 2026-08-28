import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class czn extends cyo {
   public static final Predicate<cys> c = $$0 -> $$0.a(axi.aX);
   public static final Predicate<cys> d = c.or($$0 -> $$0.a(cyw.vx));

   public czn(cyo.a $$0) {
      super($$0);
   }

   public Predicate<cys> c() {
      return this.a();
   }

   public abstract Predicate<cys> a();

   public static cys a(bwz $$0, Predicate<cys> $$1) {
      if ($$1.test($$0.b(btx.b))) {
         return $$0.b(btx.b);
      } else {
         return $$1.test($$0.b(btx.a)) ? $$0.b(btx.a) : cys.k;
      }
   }

   public abstract int b();

   protected void a(aro $$0, bwz $$1, btx $$2, cys $$3, List<cys> $$4, float $$5, float $$6, boolean $$7, @Nullable bwz $$8) {
      float $$9 = dfh.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cys $$14 = $$4.get($$13);
         if (!$$14.f()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            crm.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6x -> this.a($$1, $$6x, $$16, $$5, $$6, $$15, $$8));
            $$3.a(this.h($$14), $$1, bwz.d($$2));
            if ($$3.f()) {
               break;
            }
         }
      }
   }

   protected int h(cys $$0) {
      return 1;
   }

   protected abstract void a(bwz var1, crm var2, int var3, float var4, float var5, float var6, @Nullable bwz var7);

   protected crm a(dip $$0, bwz $$1, cys $$2, cys $$3, boolean $$4) {
      cww $$6 = $$3.h() instanceof cww $$5 ? $$5 : (cww)cyw.pf;
      cqz $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.b(true);
      }

      return $$7;
   }

   protected static List<cys> a(cys $$0, cys $$1, bwz $$2) {
      if ($$1.f()) {
         return List.of();
      } else {
         int $$4 = $$2.dV() instanceof aro $$3 ? dfh.a($$3, $$0, $$2, 1) : 1;
         List<cys> $$5 = new ArrayList<>($$4);
         cys $$6 = $$1.v();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            cys $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.f()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static cys a(cys $$0, cys $$1, bwz $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fU() && $$2.dV() instanceof aro $$4 ? dfh.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.M()) {
         return cys.k;
      } else if ($$5 == 0) {
         cys $$6 = $$1.c(1);
         $$6.b(kj.u, bas.a);
         return $$6;
      } else {
         cys $$7 = $$1.a($$5);
         if ($$1.f() && $$2 instanceof cqs $$8) {
            $$8.gi().h($$1);
         }

         return $$7;
      }
   }
}
