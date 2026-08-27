public class ewx extends exv {
   private static final te a = te.c("gui.toMenu");
   private static final te b = te.c("gui.toTitle");
   private final exv c;
   private final te k;
   private final te l;
   private final evo m = evo.d();

   public ewx(exv $$0, te $$1, te $$2) {
      this($$0, $$1, $$2, a);
   }

   public ewx(exv $$0, te $$1, te $$2, te $$3) {
      super($$1);
      this.c = $$0;
      this.k = $$2;
      this.l = $$3;
   }

   @Override
   protected void aE_() {
      this.m.c().b().a(10);
      this.m.a(new etn(this.e, this.i));
      this.m.a(new etc(this.k, this.i).i(this.g - 50).b(true));
      esi $$0;
      if (this.f.C()) {
         $$0 = esi.a(this.l, $$0x -> this.f.a(this.c)).a();
      } else {
         $$0 = esi.a(b, $$0x -> this.f.a(new eya())).a();
      }

      this.m.a($$0);
      this.m.a();
      this.m.a(this::d);
      this.b();
   }

   @Override
   protected void b() {
      evi.a(this.m, this.s());
   }

   @Override
   public te e() {
      return td.a(this.e, this.k);
   }

   @Override
   public boolean aA_() {
      return false;
   }
}
