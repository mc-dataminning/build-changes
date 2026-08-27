public class ftw extends fsw<bxz> {
   private static final aer a = new aer("textures/entity/lead_knot.png");
   private final ffk<bxz> f;

   public ftw(fsx.a $$0) {
      super($$0);
      this.f = new ffk<>($$0.a(fhr.aq));
   }

   public void a(bxz $$0, float $$1, float $$2, elf $$3, fnu $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      elj $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, fyl.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aer a(bxz $$0) {
      return a;
   }
}
