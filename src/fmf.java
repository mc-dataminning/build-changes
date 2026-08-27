public class fmf implements flu<dao> {
   private final fao a;

   public fmf(flv.a $$0) {
      this.a = new fao($$0.a(fed.m));
   }

   public void a(dao $$0, float $$1, eij $$2, fjx $$3, int $$4, int $$5) {
      dcb $$6 = $$0.q();
      if ($$6.c(ctv.c)) {
         $$2.a();
         $$2.a(0.5F, 1.0625F, 0.5F);
         float $$7 = $$6.c(ctv.a).h().p();
         $$2.a(a.d.rotationDegrees(-$$7));
         $$2.a(a.f.rotationDegrees(67.5F));
         $$2.a(0.0F, -0.125F, 0.0F);
         this.a.a(0.0F, 0.1F, 0.9F, 1.2F);
         ein $$8 = fmd.a.a($$3, fkf::b);
         this.a.b($$2, $$8, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
         $$2.b();
      }
   }
}
