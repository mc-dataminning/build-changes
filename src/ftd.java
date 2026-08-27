public class ftd extends fun<byy, ffb<byy>> {
   private static final aex a = new aex("textures/entity/enderman/enderman.png");
   private final asc i = asc.a();

   public ftd(fth.a $$0) {
      super($$0, new ffb<>($$0.a(fib.R)), 0.5F);
      this.a(new fwz<>(this));
      this.a(new fwq(this, $$0.c()));
   }

   public void a(byy $$0, float $$1, float $$2, elp $$3, foe $$4, int $$5) {
      dfj $$6 = $$0.gd();
      ffb<byy> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.ge();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ehn a(byy $$0, float $$1) {
      if ($$0.ge()) {
         double $$2 = 0.02;
         return new ehn(this.i.k() * 0.02, 0.0, this.i.k() * 0.02);
      } else {
         return super.a($$0, $$1);
      }
   }

   public aex a(byy $$0) {
      return a;
   }
}
