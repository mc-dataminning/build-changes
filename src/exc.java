public class exc extends eya {
   private static final tf a = tf.c("gui.toMenu");
   private static final tf b = tf.c("gui.toTitle");
   private final eya c;
   private final tf k;
   private final tf l;
   private final evt m = evt.d();

   public exc(eya $$0, tf $$1, tf $$2) {
      this($$0, $$1, $$2, a);
   }

   public exc(eya $$0, tf $$1, tf $$2, tf $$3) {
      super($$1);
      this.c = $$0;
      this.k = $$2;
      this.l = $$3;
   }

   @Override
   protected void aC_() {
      this.m.c().b().a(10);
      this.m.a(new etm(this.e, this.i));
      this.m.a(new eta(this.k, this.i).j(this.g - 50).b(true));
      esg $$0;
      if (this.f.D()) {
         $$0 = esg.a(this.l, $$0x -> this.f.a(this.c)).a();
      } else {
         $$0 = esg.a(b, $$0x -> this.f.a(new eyf())).a();
      }

      this.m.a($$0);
      this.m.a();
      this.m.a(this::d);
      this.b();
   }

   @Override
   protected void b() {
      evn.a(this.m, this.s());
   }

   @Override
   public tf e() {
      return te.a(this.e, this.k);
   }

   @Override
   public boolean ay_() {
      return false;
   }
}
