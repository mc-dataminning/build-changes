public class ftm implements fsz<dgq> {
   private final fjn<?> a;

   public ftm(fta.a $$0) {
      this.a = new fjn($$0.a(fks.be));
   }

   public void a(dgq $$0, float $$1, eob $$2, fqz $$3, int $$4, int $$5) {
      ib $$6 = ib.b;
      if ($$0.n()) {
         dhn $$7 = $$0.i().a_($$0.aC_());
         if ($$7.b() instanceof dcd) {
            $$6 = $$7.c(dcd.b);
         }
      }

      ckc $$8 = $$0.w();
      ged $$9;
      if ($$8 == null) {
         $$9 = fro.i;
      } else {
         $$9 = fro.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      fkt $$12 = this.a.b();
      $$12.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
      $$12.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      eof $$13 = $$9.a($$3, frh::e);
      this.a.a($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
