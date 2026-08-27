public class fcb extends fcz {
   private static final vf a = vf.c("gui.toMenu");
   private static final vf b = vf.c("gui.toTitle");
   private final fcz c;
   private final vf k;
   private final vf l;
   private final fas m = fas.d();

   public fcb(fcz $$0, vf $$1, vf $$2) {
      this($$0, $$1, $$2, a);
   }

   public fcb(fcz $$0, vf $$1, vf $$2, vf $$3) {
      super($$1);
      this.c = $$0;
      this.k = $$2;
      this.l = $$3;
   }

   @Override
   protected void aN_() {
      this.m.c().b().a(10);
      this.m.a(new eyl(this.e, this.i));
      this.m.a(new exy(this.k, this.i).c(this.g - 50).b(true));
      exe $$0;
      if (this.f.D()) {
         $$0 = exe.a(this.l, $$0x -> this.f.a(this.c)).a();
      } else {
         $$0 = exe.a(b, $$0x -> this.f.a(new fde())).a();
      }

      this.m.a($$0);
      this.m.a();
      this.m.a(this::d);
      this.c();
   }

   @Override
   protected void c() {
      fam.a(this.m, this.F());
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
