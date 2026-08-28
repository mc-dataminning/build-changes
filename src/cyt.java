import java.util.List;
import javax.annotation.Nullable;

public class cyt extends dag {
   private final bxn<? extends cut> a;

   public cyt(bxn<? extends cut> $$0, dag.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bvc a(dkj $$0, csi $$1, bvb $$2) {
      dak $$3 = $$1.b($$2);
      fga $$4 = a($$0, $$1, djq.b.c);
      if ($$4.d() == fga.a.a) {
         return bvc.e;
      } else {
         fgc $$5 = $$1.h(1.0F);
         double $$6 = 5.0;
         List<bxe> $$7 = $$0.a($$1, $$1.cR().b($$5.c(5.0)).g(1.0), bxl.h);
         if (!$$7.isEmpty()) {
            fgc $$8 = $$1.bD();

            for (bxe $$9 : $$7) {
               ffx $$10 = $$9.cR().g((double)$$9.bR());
               if ($$10.d($$8)) {
                  return bvc.e;
               }
            }
         }

         if ($$4.d() == fga.a.b) {
            cut $$11 = this.a($$0, $$4, $$3, $$1);
            if ($$11 == null) {
               return bvc.d;
            } else {
               $$11.w($$1.dL());
               if (!$$0.a($$11, $$11.cR())) {
                  return bvc.d;
               } else {
                  if (!$$0.C) {
                     $$0.b($$11);
                     $$0.a($$1, egq.t, $$4.g());
                     $$3.a(1, $$1);
                  }

                  $$1.b(axi.c.b(this));
                  return bvc.a;
               }
            }
         } else {
            return bvc.e;
         }
      }
   }

   @Nullable
   private cut a(dkj $$0, fga $$1, dak $$2, csi $$3) {
      cut $$4 = this.a.a($$0, bxm.m);
      if ($$4 != null) {
         fgc $$5 = $$1.g();
         $$4.p($$5.d, $$5.e, $$5.f);
         if ($$0 instanceof asb $$6) {
            bxn.<cut>a($$6, $$2, $$3).accept($$4);
         }
      }

      return $$4;
   }
}
