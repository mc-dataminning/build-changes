public class czg extends czw implements dau {
   public czg(czw.a $$0) {
      super($$0);
   }

   @Override
   public but a(djz $$0, crz $$1, bus $$2) {
      daa $$3 = $$1.b($$2);
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awr.je, aws.g, 0.5F, 0.4F / ($$0.G_().i() * 0.4F + 0.8F));
      if ($$0 instanceof aru $$4) {
         csu.a(ctf::new, $$4, $$3, $$1, -20.0F, 0.7F, 1.0F);
      }

      $$1.b(axb.c.b(this));
      $$3.a(1, $$1);
      return but.a;
   }

   @Override
   public csu a(djz $$0, jq $$1, daa $$2, jc $$3) {
      return new ctf($$0, $$1.a(), $$1.b(), $$1.c(), $$2);
   }

   @Override
   public dau.a a() {
      return dau.a.a().a(dau.a.a.c() * 0.5F).b(dau.a.a.d() * 1.25F).a();
   }
}
