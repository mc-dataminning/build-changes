import java.util.function.Consumer;

public class cvi extends cxd {
   public cvi(cxd.a $$0) {
      super($$0);
   }

   @Override
   public bsy a(daz $$0) {
      jn $$1 = $$0.k();
      if ($$1 == jn.a) {
         return bsy.d;
      } else {
         dgz $$2 = $$0.q();
         dax $$3 = new dax($$0);
         ji $$4 = $$3.a();
         cxh $$5 = $$0.n();
         fbx $$6 = fbx.c($$4);
         fbs $$7 = bvi.f.n().a($$6.a(), $$6.b(), $$6.c());
         if ($$2.a(null, $$7) && $$2.a_(null, $$7).isEmpty()) {
            if ($$2 instanceof ard $$8) {
               Consumer<cll> $$9 = bvi.a($$8, $$5, $$0.o());
               cll $$10 = bvi.f.b($$8, $$9, $$4, bvh.m, true, true);
               if ($$10 == null) {
                  return bsy.d;
               }

               float $$11 = (float)ayz.d((ayz.h($$0.i() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               $$10.b($$10.dz(), $$10.dB(), $$10.dF(), $$11, 0.0F);
               $$8.a_($$10);
               $$2.a(null, $$10.dz(), $$10.dB(), $$10.dF(), awa.aD, awb.e, 0.75F, 0.8F);
               $$10.a(ecp.t, $$0.o());
            }

            $$5.h(1);
            return bsy.a;
         } else {
            return bsy.d;
         }
      }
   }
}
