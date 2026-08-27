import java.util.function.Consumer;

public class cju extends cmc {
   public cju(cmc.a $$0) {
      super($$0);
   }

   @Override
   public bjl a(cos $$0) {
      ia $$1 = $$0.k();
      if ($$1 == ia.a) {
         return bjl.e;
      } else {
         csy $$2 = $$0.q();
         coq $$3 = new coq($$0);
         hv $$4 = $$3.a();
         cmh $$5 = $$0.n();
         elb $$6 = elb.c($$4);
         ekw $$7 = blj.d.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof amp $$8) {
               Consumer<cau> $$9 = blj.a($$8, $$5, $$0.o());
               cau $$10 = blj.d.b($$8, $$5.v(), $$9, $$4, blz.m, true, true);
               if ($$10 == null) {
                  return bjl.e;
               }

               float $$11 = (float)aty.d((aty.g($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dr(), $$10.dt(), $$10.dx(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dr(), $$10.dt(), $$10.dx(), arc.ao, ard.e, 0.75F, 0.8F);
               $$10.a(dmz.t, $$0.o());
            }

            $$5.h(1);
            return bjl.a($$2.B);
         } else {
            return bjl.e;
         }
      }
   }
}
