public class fgi extends fhh {
   private static final vu a = vu.c("gui.toMenu");
   private static final vu b = vu.c("gui.toTitle");
   private final fhh c;
   private final vu k;
   private final vu l;
   private final fez m = fez.d();

   public fgi(fhh $$0, vu $$1, vu $$2) {
      this($$0, $$1, $$2, a);
   }

   public fgi(fhh $$0, vu $$1, vu $$2, vu $$3) {
      super($$1);
      this.c = $$0;
      this.k = $$2;
      this.l = $$3;
   }

   @Override
   protected void aO_() {
      this.m.c().b().a(10);
      this.m.a(new fcp(this.e, this.i));
      this.m.a(new fcc(this.k, this.i).c(this.g - 50).b(true));
      fbi $$0;
      if (this.f.F()) {
         $$0 = fbi.a(this.l, $$0x -> this.f.a(this.c)).a();
      } else {
         $$0 = fbi.a(b, $$0x -> this.f.a(new fhm())).a();
      }

      this.m.a($$0);
      this.m.a();
      this.m.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fet.a(this.m, this.F());
   }

   @Override
   public vu i() {
      return vt.a(this.e, this.k);
   }

   @Override
   public boolean aM_() {
      return false;
   }
}
