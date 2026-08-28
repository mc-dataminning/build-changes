public class cvq extends cut implements cuu {
   public cvq(ctx.a $$0) {
      super($$0);
   }

   @Override
   public bqh<cuc> a(dcf $$0, cmk $$1, bqf $$2) {
      cuc $$3 = $$1.b($$2);
      if (!$$0.B) {
         cno $$4 = new cno($$0, $$1);
         $$4.a($$3);
         $$4.a($$1, $$1.dI(), $$1.dG(), -20.0F, 0.5F, 1.0F);
         $$0.b($$4);
      }

      $$1.b(avr.c.b(this));
      $$3.a(1, $$1);
      return bqh.a($$3, $$0.x_());
   }

   @Override
   public cnc a(dcf $$0, jt $$1, cuc $$2, jf $$3) {
      cno $$4 = new cno($$0, $$1.a(), $$1.b(), $$1.c());
      $$4.a($$2);
      return $$4;
   }

   @Override
   public cuu.a c() {
      return cuu.a.a().a(cuu.a.a.c() * 0.5F).b(cuu.a.a.d() * 1.25F).a();
   }
}
