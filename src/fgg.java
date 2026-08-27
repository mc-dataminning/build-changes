public class fgg extends fhf {
   private static final vu a = vu.c("gui.toMenu");
   private static final vu b = vu.c("gui.toTitle");
   private final fhf c;
   private final vu k;
   private final vu l;
   private final fex m = fex.d();

   public fgg(fhf $$0, vu $$1, vu $$2) {
      this($$0, $$1, $$2, a);
   }

   public fgg(fhf $$0, vu $$1, vu $$2, vu $$3) {
      super($$1);
      this.c = $$0;
      this.k = $$2;
      this.l = $$3;
   }

   @Override
   protected void aO_() {
      this.m.c().b().a(10);
      this.m.a(new fcn(this.e, this.i));
      this.m.a(new fca(this.k, this.i).c(this.g - 50).b(true));
      fbg $$0;
      if (this.f.F()) {
         $$0 = fbg.a(this.l, $$0x -> this.f.a(this.c)).a();
      } else {
         $$0 = fbg.a(b, $$0x -> this.f.a(new fhk())).a();
      }

      this.m.a($$0);
      this.m.a();
      this.m.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fer.a(this.m, this.F());
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
