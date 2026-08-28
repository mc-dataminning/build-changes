public class csx extends ctx implements cuu {
   public csx(ctx.a $$0) {
      super($$0);
   }

   @Override
   public bqh<cuc> a(dcf $$0, cmk $$1, bqf $$2) {
      cuc $$3 = $$1.b($$2);
      $$0.a(null, $$1.dv(), $$1.dx(), $$1.dB(), avh.hN, avi.h, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      if (!$$0.B) {
         cnl $$4 = new cnl($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dI(), $$1.dG(), 0.0F, 1.5F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(avr.c.b(this));
      $$3.a(1, $$1);
      return bqh.a($$3, $$0.x_());
   }

   @Override
   public cnc a(dcf $$0, jt $$1, cuc $$2, jf $$3) {
      cnl $$4 = new cnl($$0, $$1.a(), $$1.b(), $$1.c());
      $$4.a($$2);
      return $$4;
   }
}
