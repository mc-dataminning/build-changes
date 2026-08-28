import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cyg extends cxg {
   public static final Predicate<cxk> c = $$0 -> $$0.a(ayd.aZ);
   public static final Predicate<cxk> d = c.or($$0 -> $$0.a(cxo.vk));

   public cyg(cxg.a $$0) {
      super($$0);
   }

   public Predicate<cxk> d() {
      return this.b();
   }

   public abstract Predicate<cxk> b();

   public static cxk a(bwb $$0, Predicate<cxk> $$1) {
      if ($$1.test($$0.b(btd.b))) {
         return $$0.b(btd.b);
      } else {
         return $$1.test($$0.b(btd.a)) ? $$0.b(btd.a) : cxk.k;
      }
   }

   public abstract int c();

   protected void a(ash $$0, bwb $$1, btd $$2, cxk $$3, List<cxk> $$4, float $$5, float $$6, boolean $$7, @Nullable bwb $$8) {
      float $$9 = ddt.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cxk $$14 = $$4.get($$13);
         if (!$$14.f()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            cql.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6x -> this.a($$1, $$6x, $$16, $$5, $$6, $$15, $$8));
            $$3.a(this.h($$14), $$1, bwb.d($$2));
            if ($$3.f()) {
               break;
            }
         }
      }
   }

   protected int h(cxk $$0) {
      return 1;
   }

   protected abstract void a(bwb var1, cql var2, int var3, float var4, float var5, float var6, @Nullable bwb var7);

   protected cql a(dha $$0, bwb $$1, cxk $$2, cxk $$3, boolean $$4) {
      cvl $$6 = $$3.h() instanceof cvl $$5 ? $$5 : (cvl)cxo.oS;
      cpz $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.a(true);
      }

      return $$7;
   }

   protected static List<cxk> a(cxk $$0, cxk $$1, bwb $$2) {
      if ($$1.f()) {
         return List.of();
      } else {
         int $$4 = $$2.dV() instanceof ash $$3 ? ddt.a($$3, $$0, $$2, 1) : 1;
         List<cxk> $$5 = new ArrayList<>($$4);
         cxk $$6 = $$1.v();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            cxk $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.f()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static cxk a(cxk $$0, cxk $$1, bwb $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fT() && $$2.dV() instanceof ash $$4 ? ddt.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.L()) {
         return cxk.k;
      } else if ($$5 == 0) {
         cxk $$6 = $$1.c(1);
         $$6.b(ku.v, bbk.a);
         return $$6;
      } else {
         cxk $$7 = $$1.a($$5);
         if ($$1.f() && $$2 instanceof cps $$8) {
            $$8.gg().h($$1);
         }

         return $$7;
      }
   }
}
