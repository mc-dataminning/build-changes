public class fco extends fdm {
   private static final vg a = vg.c("gui.toMenu");
   private static final vg b = vg.c("gui.toTitle");
   private final fdm c;
   private final vg k;
   private final vg l;
   private final fbf m = fbf.d();

   public fco(fdm $$0, vg $$1, vg $$2) {
      this($$0, $$1, $$2, a);
   }

   public fco(fdm $$0, vg $$1, vg $$2, vg $$3) {
      super($$1);
      this.c = $$0;
      this.k = $$2;
      this.l = $$3;
   }

   @Override
   protected void aP_() {
      this.m.c().b().a(10);
      this.m.a(new eyy(this.e, this.i));
      this.m.a(new eyl(this.k, this.i).c(this.g - 50).b(true));
      exr $$0;
      if (this.f.D()) {
         $$0 = exr.a(this.l, $$0x -> this.f.a(this.c)).a();
      } else {
         $$0 = exr.a(b, $$0x -> this.f.a(new fdr())).a();
      }

      this.m.a($$0);
      this.m.a();
      this.m.a(this::d);
      this.c();
   }

   @Override
   protected void c() {
      faz.a(this.m, this.F());
   }

   @Override
   public vg i() {
      return vf.a(this.e, this.k);
   }

   @Override
   public boolean aN_() {
      return false;
   }
}
