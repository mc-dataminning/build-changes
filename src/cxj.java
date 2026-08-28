import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cxj extends cwj {
   public static final Predicate<cwn> c = $$0 -> $$0.a(awx.aX);
   public static final Predicate<cwn> d = c.or($$0 -> $$0.a(cwr.vt));

   public cxj(cwj.a $$0) {
      super($$0);
   }

   public Predicate<cwn> d() {
      return this.b();
   }

   public abstract Predicate<cwn> b();

   public static cwn a(bvf $$0, Predicate<cwn> $$1) {
      if ($$1.test($$0.b(bsh.b))) {
         return $$0.b(bsh.b);
      } else {
         return $$1.test($$0.b(bsh.a)) ? $$0.b(bsh.a) : cwn.j;
      }
   }

   public abstract int c();

   protected void a(arc $$0, bvf $$1, bsh $$2, cwn $$3, List<cwn> $$4, float $$5, float $$6, boolean $$7, @Nullable bvf $$8) {
      float $$9 = dcz.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cwn $$14 = $$4.get($$13);
         if (!$$14.f()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            cpo.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6x -> this.a($$1, $$6x, $$16, $$5, $$6, $$15, $$8));
            $$3.a(this.h($$14), $$1, bvf.d($$2));
            if ($$3.f()) {
               break;
            }
         }
      }
   }

   protected int h(cwn $$0) {
      return 1;
   }

   protected abstract void a(bvf var1, cpo var2, int var3, float var4, float var5, float var6, @Nullable bvf var7);

   protected cpo a(dgg $$0, bvf $$1, cwn $$2, cwn $$3, boolean $$4) {
      cuo $$6 = $$3.h() instanceof cuo $$5 ? $$5 : (cuo)cwr.pb;
      cpc $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.b(true);
      }

      return $$7;
   }

   protected static List<cwn> a(cwn $$0, cwn $$1, bvf $$2) {
      if ($$1.f()) {
         return List.of();
      } else {
         int $$4 = $$2.dW() instanceof arc $$3 ? dcz.a($$3, $$0, $$2, 1) : 1;
         List<cwn> $$5 = new ArrayList<>($$4);
         cwn $$6 = $$1.v();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            cwn $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.f()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static cwn a(cwn $$0, cwn $$1, bvf $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fV() && $$2.dW() instanceof arc $$4 ? dcz.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.M()) {
         return cwn.j;
      } else if ($$5 == 0) {
         cwn $$6 = $$1.c(1);
         $$6.b(kv.v, bae.a);
         return $$6;
      } else {
         cwn $$7 = $$1.a($$5);
         if ($$1.f() && $$2 instanceof cov $$8) {
            $$8.gi().h($$1);
         }

         return $$7;
      }
   }
}
