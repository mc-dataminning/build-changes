public class fub extends ftb<byc> {
   private static final aeu a = new aeu("textures/entity/lead_knot.png");
   private final ffp<byc> f;

   public fub(ftc.a $$0) {
      super($$0);
      this.f = new ffp<>($$0.a(fhw.aq));
   }

   public void a(byc $$0, float $$1, float $$2, elk $$3, fnz $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      elo $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, fyq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aeu a(byc $$0) {
      return a;
   }
}
