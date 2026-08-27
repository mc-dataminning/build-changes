public class fip extends fjo {
   private static final wg a = wg.c("gui.toMenu");
   private static final wg b = wg.c("gui.toTitle");
   private final fjo c;
   private final wg d;
   private final wg o;
   private final fhg p = fhg.d();

   public fip(fjo $$0, wg $$1, wg $$2) {
      this($$0, $$1, $$2, a);
   }

   public fip(fjo $$0, wg $$1, wg $$2, wg $$3) {
      super($$1);
      this.c = $$0;
      this.d = $$2;
      this.o = $$3;
   }

   @Override
   protected void aN_() {
      this.p.c().b().a(10);
      this.p.a(new few(this.i, this.m));
      this.p.a(new fej(this.d, this.m).d(this.k - 50).b(true));
      fdp $$0;
      if (this.j.F()) {
         $$0 = fdp.a(this.o, $$0x -> this.j.a(this.c)).a();
      } else {
         $$0 = fdp.a(b, $$0x -> this.j.a(new fjt())).a();
      }

      this.p.a($$0);
      this.p.a();
      this.p.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fha.a(this.p, this.G());
   }

   @Override
   public wg i() {
      return wf.a(this.i, this.d);
   }

   @Override
   public boolean aE_() {
      return false;
   }
}
