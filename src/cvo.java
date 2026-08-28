import java.util.function.Consumer;

public class cvo extends cxk {
   public cvo(cxk.a $$0) {
      super($$0);
   }

   @Override
   public bti a(dbh $$0) {
      jm $$1 = $$0.k();
      if ($$1 == jm.a) {
         return bti.d;
      } else {
         dhh $$2 = $$0.q();
         dbf $$3 = new dbf($$0);
         jh $$4 = $$3.a();
         cxo $$5 = $$0.n();
         fbx $$6 = fbx.c($$4);
         fbs $$7 = bvq.f.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof ash $$8) {
               Consumer<clp> $$9 = bvq.a($$8, $$5, $$0.o());
               clp $$10 = bvq.f.b($$8, $$9, $$4, bvp.m, true, true);
               if ($$10 == null) {
                  return bti.d;
               }

               float $$11 = (float)bae.d((bae.h($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dA(), $$10.dC(), $$10.dG(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dA(), $$10.dC(), $$10.dG(), axf.aD, axg.e, 0.75F, 0.8F);
               $$10.a(ecq.t, $$0.o());
            }

            $$5.h(1);
            return bti.a;
         } else {
            return bti.d;
         }
      }
   }
}
