public class fuc extends ftc<byn> {
   private static final aez a = new aez("textures/entity/lead_knot.png");
   private final ffp<byn> f;

   public fuc(ftd.a $$0) {
      super($$0);
      this.f = new ffp<>($$0.a(fhw.aq));
   }

   public void a(byn $$0, float $$1, float $$2, elj $$3, foa $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      eln $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, fyr.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aez a(byn $$0) {
      return a;
   }
}
