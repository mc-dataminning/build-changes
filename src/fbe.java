public class fbe extends fcc {
   private static final vb a = vb.c("gui.toMenu");
   private static final vb b = vb.c("gui.toTitle");
   private final fcc c;
   private final vb k;
   private final vb l;
   private final ezv m = ezv.d();

   public fbe(fcc $$0, vb $$1, vb $$2) {
      this($$0, $$1, $$2, a);
   }

   public fbe(fcc $$0, vb $$1, vb $$2, vb $$3) {
      super($$1);
      this.c = $$0;
      this.k = $$2;
      this.l = $$3;
   }

   @Override
   protected void aP_() {
      this.m.c().b().a(10);
      this.m.a(new exo(this.e, this.i));
      this.m.a(new exb(this.k, this.i).j(this.g - 50).b(true));
      ewh $$0;
      if (this.f.C()) {
         $$0 = ewh.a(this.l, $$0x -> this.f.a(this.c)).a();
      } else {
         $$0 = ewh.a(b, $$0x -> this.f.a(new fch())).a();
      }

      this.m.a($$0);
      this.m.a();
      this.m.a(this::d);
      this.c();
   }

   @Override
   protected void c() {
      ezp.a(this.m, this.s());
   }

   @Override
   public vb h() {
      return va.a(this.e, this.k);
   }

   @Override
   public boolean aE_() {
      return false;
   }
}
