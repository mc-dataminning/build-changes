public class fab extends faz {
   private static final uv a = uv.c("gui.toMenu");
   private static final uv b = uv.c("gui.toTitle");
   private final faz c;
   private final uv k;
   private final uv l;
   private final eys m = eys.d();

   public fab(faz $$0, uv $$1, uv $$2) {
      this($$0, $$1, $$2, a);
   }

   public fab(faz $$0, uv $$1, uv $$2, uv $$3) {
      super($$1);
      this.c = $$0;
      this.k = $$2;
      this.l = $$3;
   }

   @Override
   protected void aQ_() {
      this.m.c().b().a(10);
      this.m.a(new ewl(this.e, this.i));
      this.m.a(new evy(this.k, this.i).j(this.g - 50).b(true));
      eve $$0;
      if (this.f.C()) {
         $$0 = eve.a(this.l, $$0x -> this.f.a(this.c)).a();
      } else {
         $$0 = eve.a(b, $$0x -> this.f.a(new fbe())).a();
      }

      this.m.a($$0);
      this.m.a();
      this.m.a(this::d);
      this.c();
   }

   @Override
   protected void c() {
      eym.a(this.m, this.s());
   }

   @Override
   public uv h() {
      return uu.a(this.e, this.k);
   }

   @Override
   public boolean aF_() {
      return false;
   }
}
