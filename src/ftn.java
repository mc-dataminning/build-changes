public class ftn extends fsn<bya> {
   private static final aer a = new aer("textures/entity/lead_knot.png");
   private final fff<bya> f;

   public ftn(fso.a $$0) {
      super($$0);
      this.f = new fff<>($$0.a(fhm.aq));
   }

   public void a(bya $$0, float $$1, float $$2, elg $$3, fnl $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      elk $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, fyc.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aer a(bya $$0) {
      return a;
   }
}
