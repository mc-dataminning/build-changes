public class fpr implements fpg<ddl> {
   private final fdt a;

   public fpr(fph.a $$0) {
      this.a = new fdt($$0.a(fhi.m));
   }

   public void a(ddl $$0, float $$1, elh $$2, fng $$3, int $$4, int $$5) {
      dey $$6 = $$0.q();
      if ($$6.c(cws.c)) {
         $$2.a();
         $$2.a(0.5F, 1.0625F, 0.5F);
         float $$7 = $$6.c(cws.a).h().p();
         $$2.a(a.d.rotationDegrees(-$$7));
         $$2.a(a.f.rotationDegrees(67.5F));
         $$2.a(0.0F, -0.125F, 0.0F);
         this.a.a(0.0F, 0.1F, 0.9F, 1.2F);
         ell $$8 = fpp.a.a($$3, fno::b);
         this.a.b($$2, $$8, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
         $$2.b();
      }
   }
}
