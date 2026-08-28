public class fcr extends fcs {
   private final bvs b;

   public fcr(bvs $$0) {
      this($$0, $$0.dt());
   }

   public fcr(bvs $$0, fcu $$1) {
      super($$1);
      this.b = $$0;
   }

   public bvs a() {
      return this.b;
   }

   @Override
   public fcs.a d() {
      return fcs.a.c;
   }
}
