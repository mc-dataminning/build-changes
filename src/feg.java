public class feg extends ffe {
   private static final vq a = vq.c("gui.toMenu");
   private static final vq b = vq.c("gui.toTitle");
   private final ffe c;
   private final vq k;
   private final vq l;
   private final fcx m = fcx.d();

   public feg(ffe $$0, vq $$1, vq $$2) {
      this($$0, $$1, $$2, a);
   }

   public feg(ffe $$0, vq $$1, vq $$2, vq $$3) {
      super($$1);
      this.c = $$0;
      this.k = $$2;
      this.l = $$3;
   }

   @Override
   protected void aQ_() {
      this.m.c().b().a(10);
      this.m.a(new fao(this.e, this.i));
      this.m.a(new fab(this.k, this.i).c(this.g - 50).b(true));
      ezh $$0;
      if (this.f.D()) {
         $$0 = ezh.a(this.l, $$0x -> this.f.a(this.c)).a();
      } else {
         $$0 = ezh.a(b, $$0x -> this.f.a(new ffj())).a();
      }

      this.m.a($$0);
      this.m.a();
      this.m.a(this::d);
      this.c();
   }

   @Override
   protected void c() {
      fcr.a(this.m, this.F());
   }

   @Override
   public vq i() {
      return vp.a(this.e, this.k);
   }

   @Override
   public boolean aO_() {
      return false;
   }
}
