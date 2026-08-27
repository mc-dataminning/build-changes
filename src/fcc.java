public class fcc extends fda {
   private static final vf a = vf.c("gui.toMenu");
   private static final vf b = vf.c("gui.toTitle");
   private final fda c;
   private final vf k;
   private final vf l;
   private final fat m = fat.d();

   public fcc(fda $$0, vf $$1, vf $$2) {
      this($$0, $$1, $$2, a);
   }

   public fcc(fda $$0, vf $$1, vf $$2, vf $$3) {
      super($$1);
      this.c = $$0;
      this.k = $$2;
      this.l = $$3;
   }

   @Override
   protected void aN_() {
      this.m.c().b().a(10);
      this.m.a(new eym(this.e, this.i));
      this.m.a(new exz(this.k, this.i).c(this.g - 50).b(true));
      exf $$0;
      if (this.f.D()) {
         $$0 = exf.a(this.l, $$0x -> this.f.a(this.c)).a();
      } else {
         $$0 = exf.a(b, $$0x -> this.f.a(new fdf())).a();
      }

      this.m.a($$0);
      this.m.a();
      this.m.a(this::d);
      this.c();
   }

   @Override
   protected void c() {
      fan.a(this.m, this.F());
   }

   @Override
   public vf h() {
      return ve.a(this.e, this.k);
   }

   @Override
   public boolean aL_() {
      return false;
   }
}
