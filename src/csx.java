public class csx extends ctl {
   public csx(ctl.a $$0) {
      super($$0);
   }

   @Override
   public bpx<ctq> a(daz $$0, cly $$1, bpv $$2) {
      ctq $$3 = $$1.b($$2);
      if ($$1.ct != null) {
         if (!$$0.B) {
            int $$4 = $$1.ct.a($$3);
            $$3.a($$4, $$1, bsq.d($$2));
         }

         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avi.iW, avj.g, 1.0F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         $$1.a(dvw.C);
      } else {
         $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avi.iY, avj.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
         if (!$$0.B) {
            int $$5 = czc.e($$3);
            int $$6 = czc.d($$3);
            $$0.b(new cmm($$1, $$0, $$6, $$5));
         }

         $$1.b(avs.c.b(this));
         $$1.a(dvw.D);
      }

      return bpx.a($$3, $$0.x_());
   }

   @Override
   public int g() {
      return 1;
   }
}
