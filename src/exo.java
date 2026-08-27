public class exo extends eym {
   private static final tn a = tn.c("gui.toMenu");
   private static final tn b = tn.c("gui.toTitle");
   private final eym c;
   private final tn k;
   private final tn l;
   private final ewf m = ewf.d();

   public exo(eym $$0, tn $$1, tn $$2) {
      this($$0, $$1, $$2, a);
   }

   public exo(eym $$0, tn $$1, tn $$2, tn $$3) {
      super($$1);
      this.c = $$0;
      this.k = $$2;
      this.l = $$3;
   }

   @Override
   protected void aH_() {
      this.m.c().b().a(10);
      this.m.a(new ety(this.e, this.i));
      this.m.a(new etm(this.k, this.i).j(this.g - 50).b(true));
      ess $$0;
      if (this.f.D()) {
         $$0 = ess.a(this.l, $$0x -> this.f.a(this.c)).a();
      } else {
         $$0 = ess.a(b, $$0x -> this.f.a(new eyr())).a();
      }

      this.m.a($$0);
      this.m.a();
      this.m.a(this::d);
      this.b();
   }

   @Override
   protected void b() {
      evz.a(this.m, this.s());
   }

   @Override
   public tn g() {
      return tm.a(this.e, this.k);
   }

   @Override
   public boolean ay_() {
      return false;
   }
}
