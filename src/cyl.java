import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class cyl extends cxl {
   public static final Predicate<cxp> c = $$0 -> $$0.a(ayd.aZ);
   public static final Predicate<cxp> d = c.or($$0 -> $$0.a(cxt.vk));

   public cyl(cxl.a $$0) {
      super($$0);
   }

   public Predicate<cxp> d() {
      return this.b();
   }

   public abstract Predicate<cxp> b();

   public static cxp a(bwg $$0, Predicate<cxp> $$1) {
      if ($$1.test($$0.b(bti.b))) {
         return $$0.b(bti.b);
      } else {
         return $$1.test($$0.b(bti.a)) ? $$0.b(bti.a) : cxp.j;
      }
   }

   public abstract int c();

   protected void a(ash $$0, bwg $$1, bti $$2, cxp $$3, List<cxp> $$4, float $$5, float $$6, boolean $$7, @Nullable bwg $$8) {
      float $$9 = deb.a($$0, $$3, $$1, 0.0F);
      float $$10 = $$4.size() == 1 ? 0.0F : 2.0F * $$9 / (float)($$4.size() - 1);
      float $$11 = (float)(($$4.size() - 1) % 2) * $$10 / 2.0F;
      float $$12 = 1.0F;

      for (int $$13 = 0; $$13 < $$4.size(); $$13++) {
         cxp $$14 = $$4.get($$13);
         if (!$$14.f()) {
            float $$15 = $$11 + $$12 * (float)(($$13 + 1) / 2) * $$10;
            $$12 = -$$12;
            int $$16 = $$13;
            cqq.a(this.a($$0, $$1, $$3, $$14, $$7), $$0, $$14, $$6x -> this.a($$1, $$6x, $$16, $$5, $$6, $$15, $$8));
            $$3.a(this.h($$14), $$1, bwg.d($$2));
            if ($$3.f()) {
               break;
            }
         }
      }
   }

   protected int h(cxp $$0) {
      return 1;
   }

   protected abstract void a(bwg var1, cqq var2, int var3, float var4, float var5, float var6, @Nullable bwg var7);

   protected cqq a(dhi $$0, bwg $$1, cxp $$2, cxp $$3, boolean $$4) {
      cvq $$6 = $$3.h() instanceof cvq $$5 ? $$5 : (cvq)cxt.oS;
      cqe $$7 = $$6.a($$0, $$3, $$1, $$2);
      if ($$4) {
         $$7.b(true);
      }

      return $$7;
   }

   protected static List<cxp> a(cxp $$0, cxp $$1, bwg $$2) {
      if ($$1.f()) {
         return List.of();
      } else {
         int $$4 = $$2.dW() instanceof ash $$3 ? deb.a($$3, $$0, $$2, 1) : 1;
         List<cxp> $$5 = new ArrayList<>($$4);
         cxp $$6 = $$1.v();

         for (int $$7 = 0; $$7 < $$4; $$7++) {
            cxp $$8 = a($$0, $$7 == 0 ? $$1 : $$6, $$2, $$7 > 0);
            if (!$$8.f()) {
               $$5.add($$8);
            }
         }

         return $$5;
      }
   }

   protected static cxp a(cxp $$0, cxp $$1, bwg $$2, boolean $$3) {
      int $$5 = !$$3 && !$$2.fV() && $$2.dW() instanceof ash $$4 ? deb.a($$4, $$0, $$1, 1) : 0;
      if ($$5 > $$1.L()) {
         return cxp.j;
      } else if ($$5 == 0) {
         cxp $$6 = $$1.c(1);
         $$6.b(ku.v, bbk.a);
         return $$6;
      } else {
         cxp $$7 = $$1.a($$5);
         if ($$1.f() && $$2 instanceof cpx $$8) {
            $$8.gi().h($$1);
         }

         return $$7;
      }
   }
}
