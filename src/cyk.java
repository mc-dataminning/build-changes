import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cyk extends cxk {
   public static final Predicate<cxo> c = $$0 -> $$0.a(ayd.aZ);
   public static final Predicate<cxo> d = c.or($$0 -> $$0.a(cxs.vk));

   public cyk(cxk.a $$0) {
      super($$0);
   }

   public Predicate<cxo> d() {
      return this.b();
   }

   public abstract Predicate<cxo> b();

   public static cxo a(bwf $$0, Predicate<cxo> $$1) {
      if ($$1.test($$0.b(bth.b))) {
         return $$0.b(bth.b);
      } else {
         return $$1.test($$0.b(bth.a)) ? $$0.b(bth.a) : cxo.j;
      }
   }

   public abstract int c();

   protected void a(ash $$0, bwf $$1, bth $$2, cxo $$3, List<cxo> $$4, float $$5, float $$6, boolean $$7, @Nullable bwf $$8) {
      float $$9 = dea.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cxo $$14 = $$4.get($$13);
         if (!$$14.f()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            cqp.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6x -> this.a($$1, $$6x, $$16, $$5, $$6, $$15, $$8));
            $$3.a(this.h($$14), $$1, bwf.d($$2));
            if ($$3.f()) {
               break;
            }
         }
      }
   }

   protected int h(cxo $$0) {
      return 1;
   }

   protected abstract void a(bwf var1, cqp var2, int var3, float var4, float var5, float var6, @Nullable bwf var7);

   protected cqp a(dhh $$0, bwf $$1, cxo $$2, cxo $$3, boolean $$4) {
      cvp $$6 = $$3.h() instanceof cvp $$5 ? $$5 : (cvp)cxs.oS;
      cqd $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.b(true);
      }

      return $$7;
   }

   protected static List<cxo> a(cxo $$0, cxo $$1, bwf $$2) {
      if ($$1.f()) {
         return List.of();
      } else {
         int $$4 = $$2.dW() instanceof ash $$3 ? dea.a($$3, $$0, $$2, 1) : 1;
         List<cxo> $$5 = new ArrayList<>($$4);
         cxo $$6 = $$1.v();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            cxo $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.f()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static cxo a(cxo $$0, cxo $$1, bwf $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fV() && $$2.dW() instanceof ash $$4 ? dea.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.L()) {
         return cxo.j;
      } else if ($$5 == 0) {
         cxo $$6 = $$1.c(1);
         $$6.b(ku.v, bbk.a);
         return $$6;
      } else {
         cxo $$7 = $$1.a($$5);
         if ($$1.f() && $$2 instanceof cpw $$8) {
            $$8.gi().h($$1);
         }

         return $$7;
      }
   }
}
