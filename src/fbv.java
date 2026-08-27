public class fbv extends fct {
   private static final vd a = vd.c("gui.toMenu");
   private static final vd b = vd.c("gui.toTitle");
   private final fct c;
   private final vd k;
   private final vd l;
   private final fam m = fam.d();

   public fbv(fct $$0, vd $$1, vd $$2) {
      this($$0, $$1, $$2, a);
   }

   public fbv(fct $$0, vd $$1, vd $$2, vd $$3) {
      super($$1);
      this.c = $$0;
      this.k = $$2;
      this.l = $$3;
   }

   @Override
   protected void aN_() {
      this.m.c().b().a(10);
      this.m.a(new eyf(this.e, this.i));
      this.m.a(new exs(this.k, this.i).c(this.g - 50).b(true));
      ewy $$0;
      if (this.f.C()) {
         $$0 = ewy.a(this.l, $$0x -> this.f.a(this.c)).a();
      } else {
         $$0 = ewy.a(b, $$0x -> this.f.a(new fcy())).a();
      }

      this.m.a($$0);
      this.m.a();
      this.m.a(this::d);
      this.c();
   }

   @Override
   protected void c() {
      fag.a(this.m, this.F());
   }

   @Override
   public vd h() {
      return vc.a(this.e, this.k);
   }

   @Override
   public boolean aL_() {
      return false;
   }
}
