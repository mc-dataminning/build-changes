import java.util.List;
import javax.annotation.Nullable;

public class cxw extends czj {
   private final bwr<? extends ctx> a;

   public cxw(bwr<? extends ctx> $$0, czj.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bug a(djm $$0, crm $$1, buf $$2) {
      czn $$3 = $$1.b($$2);
      ffa $$4 = a($$0, $$1, dit.b.c);
      if ($$4.d() == ffa.a.a) {
         return bug.e;
      } else {
         ffc $$5 = $$1.h(1.0F);
         double $$6 = 5.0;
         List<bwi> $$7 = $$0.a($$1, $$1.cQ().b($$5.c(5.0)).g(1.0), bwp.h);
         if (!$$7.isEmpty()) {
            ffc $$8 = $$1.bC();

            for (bwi $$9 : $$7) {
               fex $$10 = $$9.cQ().g((double)$$9.bQ());
               if ($$10.d($$8)) {
                  return bug.e;
               }
            }
         }

         if ($$4.d() == ffa.a.b) {
            ctx $$11 = this.a($$0, $$4, $$3, $$1);
            if ($$11 == null) {
               return bug.d;
            } else {
               $$11.w($$1.dK());
               if (!$$0.a($$11, $$11.cQ())) {
                  return bug.d;
               } else {
                  if (!$$0.C) {
                     $$0.b($$11);
                     $$0.a($$1, eft.t, $$4.g());
                     $$3.a(1, $$1);
                  }

                  $$1.b(awx.c.b(this));
                  return bug.a;
               }
            }
         } else {
            return bug.e;
         }
      }
   }

   @Nullable
   private ctx a(djm $$0, ffa $$1, czn $$2, crm $$3) {
      ctx $$4 = this.a.a($$0, bwq.m);
      if ($$4 != null) {
         ffc $$5 = $$1.g();
         $$4.p($$5.d, $$5.e, $$5.f);
         if ($$0 instanceof arq $$6) {
            bwr.<ctx>a($$6, $$2, $$3).accept($$4);
         }
      }

      return $$4;
   }
}
