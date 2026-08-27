public class ftf extends fup<bza, ffd<bza>> {
   private static final aey a = new aey("textures/entity/enderman/enderman.png");
   private final ase i = ase.a();

   public ftf(ftj.a $$0) {
      super($$0, new ffd<>($$0.a(fid.R)), 0.5F);
      this.a(new fxb<>(this));
      this.a(new fws(this, $$0.c()));
   }

   public void a(bza $$0, float $$1, float $$2, elr $$3, fog $$4, int $$5) {
      dfl $$6 = $$0.gd();
      ffd<bza> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.ge();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ehp a(bza $$0, float $$1) {
      if ($$0.ge()) {
         double $$2 = 0.02;
         return new ehp(this.i.k() * 0.02, 0.0, this.i.k() * 0.02);
      } else {
         return super.a($$0, $$1);
      }
   }

   public aey a(bza $$0) {
      return a;
   }
}
