public class fss implements fsh<dft> {
   private final fgl a;

   public fss(fsi.a $$0) {
      this.a = new fgl($$0.a(fka.m));
   }

   public void a(dft $$0, float $$1, enk $$2, fqh $$3, int $$4, int $$5) {
      dgw $$6 = $$0.q();
      if ($$6.c(czd.d)) {
         $$2.a();
         $$2.a(0.5F, 1.0625F, 0.5F);
         float $$7 = $$6.c(czd.b).h().p();
         $$2.a(a.d.rotationDegrees(-$$7));
         $$2.a(a.f.rotationDegrees(67.5F));
         $$2.a(0.0F, -0.125F, 0.0F);
         this.a.a(0.0F, 0.1F, 0.9F, 1.2F);
         eno $$8 = fsq.a.a($$3, fqp::c);
         this.a.b($$2, $$8, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
         $$2.b();
      }
   }
}
