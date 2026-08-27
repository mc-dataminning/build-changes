public class exm extends eyk {
   private static final tl a = tl.c("gui.toMenu");
   private static final tl b = tl.c("gui.toTitle");
   private final eyk c;
   private final tl k;
   private final tl l;
   private final ewd m = ewd.d();

   public exm(eyk $$0, tl $$1, tl $$2) {
      this($$0, $$1, $$2, a);
   }

   public exm(eyk $$0, tl $$1, tl $$2, tl $$3) {
      super($$1);
      this.c = $$0;
      this.k = $$2;
      this.l = $$3;
   }

   @Override
   protected void aH_() {
      this.m.c().b().a(10);
      this.m.a(new etw(this.e, this.i));
      this.m.a(new etk(this.k, this.i).j(this.g - 50).b(true));
      esq $$0;
      if (this.f.D()) {
         $$0 = esq.a(this.l, $$0x -> this.f.a(this.c)).a();
      } else {
         $$0 = esq.a(b, $$0x -> this.f.a(new eyp())).a();
      }

      this.m.a($$0);
      this.m.a();
      this.m.a(this::d);
      this.b();
   }

   @Override
   protected void b() {
      evx.a(this.m, this.s());
   }

   @Override
   public tl g() {
      return tk.a(this.e, this.k);
   }

   @Override
   public boolean ay_() {
      return false;
   }
}
