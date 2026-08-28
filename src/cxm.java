import java.util.List;
import javax.annotation.Nullable;

public class cxm extends cyz {
   private final bwo<? extends ctn> a;

   public cxm(bwo<? extends ctn> $$0, cyz.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bud a(dja $$0, crc $$1, buc $$2) {
      czd $$3 = $$1.b($$2);
      feo $$4 = a($$0, $$1, dij.b.c);
      if ($$4.d() == feo.a.a) {
         return bud.e;
      } else {
         feq $$5 = $$1.h(1.0F);
         double $$6 = 5.0;
         List<bwf> $$7 = $$0.a($$1, $$1.cR().b($$5.c(5.0)).g(1.0), bwm.h);
         if (!$$7.isEmpty()) {
            feq $$8 = $$1.bE();

            for (bwf $$9 : $$7) {
               fel $$10 = $$9.cR().g((double)$$9.bS());
               if ($$10.d($$8)) {
                  return bud.e;
               }
            }
         }

         if ($$4.d() == feo.a.b) {
            ctn $$11 = this.a($$0, $$4, $$3, $$1);
            if ($$11 == null) {
               return bud.d;
            } else {
               $$11.w($$1.dL());
               if (!$$0.a($$11, $$11.cR())) {
                  return bud.d;
               } else {
                  if (!$$0.C) {
                     $$0.b($$11);
                     $$0.a($$1, efh.t, $$4.g());
                     $$3.a(1, $$1);
                  }

                  $$1.b(awx.c.b(this));
                  return bud.a;
               }
            }
         } else {
            return bud.e;
         }
      }
   }

   @Nullable
   private ctn a(dja $$0, feo $$1, czd $$2, crc $$3) {
      ctn $$4 = this.a.a($$0, bwn.m);
      if ($$4 != null) {
         feq $$5 = $$1.g();
         $$4.p($$5.d, $$5.e, $$5.f);
         if ($$0 instanceof arq $$6) {
            bwo.<ctn>a($$6, $$2, $$3).accept($$4);
         }
      }

      return $$4;
   }
}
