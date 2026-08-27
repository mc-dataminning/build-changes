public class exm extends eyk {
   private static final tm a = tm.c("gui.toMenu");
   private static final tm b = tm.c("gui.toTitle");
   private final eyk c;
   private final tm k;
   private final tm l;
   private final ewd m = ewd.d();

   public exm(eyk $$0, tm $$1, tm $$2) {
      this($$0, $$1, $$2, a);
   }

   public exm(eyk $$0, tm $$1, tm $$2, tm $$3) {
      super($$1);
      this.c = $$0;
      this.k = $$2;
      this.l = $$3;
   }

   @Override
   protected void aI_() {
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
   public tm g() {
      return tl.a(this.e, this.k);
   }

   @Override
   public boolean ay_() {
      return false;
   }
}
