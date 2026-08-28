import java.util.List;
import javax.annotation.Nullable;

public class cxt extends czg {
   private final bwr<? extends ctu> a;

   public cxt(bwr<? extends ctu> $$0, czg.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bug a(djh $$0, crj $$1, buf $$2) {
      czk $$3 = $$1.b($$2);
      fev $$4 = a($$0, $$1, diq.b.c);
      if ($$4.d() == fev.a.a) {
         return bug.e;
      } else {
         fex $$5 = $$1.h(1.0F);
         double $$6 = 5.0;
         List<bwi> $$7 = $$0.a($$1, $$1.cQ().b($$5.c(5.0)).g(1.0), bwp.h);
         if (!$$7.isEmpty()) {
            fex $$8 = $$1.bC();

            for (bwi $$9 : $$7) {
               fes $$10 = $$9.cQ().g((double)$$9.bQ());
               if ($$10.d($$8)) {
                  return bug.e;
               }
            }
         }

         if ($$4.d() == fev.a.b) {
            ctu $$11 = this.a($$0, $$4, $$3, $$1);
            if ($$11 == null) {
               return bug.d;
            } else {
               $$11.w($$1.dK());
               if (!$$0.a($$11, $$11.cQ())) {
                  return bug.d;
               } else {
                  if (!$$0.C) {
                     $$0.b($$11);
                     $$0.a($$1, efo.t, $$4.g());
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
   private ctu a(djh $$0, fev $$1, czk $$2, crj $$3) {
      ctu $$4 = this.a.a($$0, bwq.m);
      if ($$4 != null) {
         fex $$5 = $$1.g();
         $$4.p($$5.d, $$5.e, $$5.f);
         if ($$0 instanceof arq $$6) {
            bwr.<ctu>a($$6, $$2, $$3).accept($$4);
         }
      }

      return $$4;
   }
}
