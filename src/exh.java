public class exh extends eyf {
   private static final ti a = ti.c("gui.toMenu");
   private static final ti b = ti.c("gui.toTitle");
   private final eyf c;
   private final ti k;
   private final ti l;
   private final evy m = evy.d();

   public exh(eyf $$0, ti $$1, ti $$2) {
      this($$0, $$1, $$2, a);
   }

   public exh(eyf $$0, ti $$1, ti $$2, ti $$3) {
      super($$1);
      this.c = $$0;
      this.k = $$2;
      this.l = $$3;
   }

   @Override
   protected void aD_() {
      this.m.c().b().a(10);
      this.m.a(new etr(this.e, this.i));
      this.m.a(new etf(this.k, this.i).j(this.g - 50).b(true));
      esl $$0;
      if (this.f.D()) {
         $$0 = esl.a(this.l, $$0x -> this.f.a(this.c)).a();
      } else {
         $$0 = esl.a(b, $$0x -> this.f.a(new eyk())).a();
      }

      this.m.a($$0);
      this.m.a();
      this.m.a(this::d);
      this.b();
   }

   @Override
   protected void b() {
      evs.a(this.m, this.s());
   }

   @Override
   public ti g() {
      return th.a(this.e, this.k);
   }

   @Override
   public boolean at_() {
      return false;
   }
}
