public class fqf implements fpu<ddm> {
   private final fec a;

   public fqf(fpv.a $$0) {
      this.a = new fec($$0.a(fhr.m));
   }

   public void a(ddm $$0, float $$1, elf $$2, fnu $$3, int $$4, int $$5) {
      dez $$6 = $$0.q();
      if ($$6.c(cwt.c)) {
         $$2.a();
         $$2.a(0.5F, 1.0625F, 0.5F);
         float $$7 = $$6.c(cwt.a).h().p();
         $$2.a(a.d.rotationDegrees(-$$7));
         $$2.a(a.f.rotationDegrees(67.5F));
         $$2.a(0.0F, -0.125F, 0.0F);
         this.a.a(0.0F, 0.1F, 0.9F, 1.2F);
         elj $$8 = fqd.a.a($$3, foc::c);
         this.a.b($$2, $$8, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
         $$2.b();
      }
   }
}
