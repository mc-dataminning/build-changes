import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cxi extends cwi {
   public static final Predicate<cwm> c = $$0 -> $$0.a(axl.aY);
   public static final Predicate<cwm> d = c.or($$0 -> $$0.a(cwq.uM));

   public cxi(cwi.a $$0) {
      super($$0);
   }

   public Predicate<cwm> d() {
      return this.b();
   }

   public abstract Predicate<cwm> b();

   public static cwm a(bvh $$0, Predicate<cwm> $$1) {
      if ($$1.test($$0.b(bsj.b))) {
         return $$0.b(bsj.b);
      } else {
         return $$1.test($$0.b(bsj.a)) ? $$0.b(bsj.a) : cwm.k;
      }
   }

   public abstract int c();

   protected void a(arp $$0, bvh $$1, bsj $$2, cwm $$3, List<cwm> $$4, float $$5, float $$6, boolean $$7, @Nullable bvh $$8) {
      float $$9 = dcf.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cwm $$14 = $$4.get($$13);
         if (!$$14.f()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            cpn.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6x -> this.a($$1, $$6x, $$16, $$5, $$6, $$15, $$8));
            $$3.a(this.h($$14), $$1, bvh.d($$2));
            if ($$3.f()) {
               break;
            }
         }
      }
   }

   protected int h(cwm $$0) {
      return 1;
   }

   protected abstract void a(bvh var1, cpn var2, int var3, float var4, float var5, float var6, @Nullable bvh var7);

   protected cpn a(dfm $$0, bvh $$1, cwm $$2, cwm $$3, boolean $$4) {
      cun $$6 = $$3.h() instanceof cun $$5 ? $$5 : (cun)cwq.ox;
      cpb $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.a(true);
      }

      return $$7;
   }

   protected static List<cwm> a(cwm $$0, cwm $$1, bvh $$2) {
      if ($$1.f()) {
         return List.of();
      } else {
         int $$4 = $$2.dV() instanceof arp $$3 ? dcf.a($$3, $$0, $$2, 1) : 1;
         List<cwm> $$5 = new ArrayList<>($$4);
         cwm $$6 = $$1.v();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            cwm $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.f()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static cwm a(cwm $$0, cwm $$1, bvh $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fT() && $$2.dV() instanceof arp $$4 ? dcf.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.L()) {
         return cwm.k;
      } else if ($$5 == 0) {
         cwm $$6 = $$1.c(1);
         $$6.b(ku.v, bas.a);
         return $$6;
      } else {
         cwm $$7 = $$1.a($$5);
         if ($$1.f() && $$2 instanceof cou $$8) {
            $$8.gg().h($$1);
         }

         return $$7;
      }
   }
}
