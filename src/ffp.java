public class ffp extends ffq {
   private final bwv b;

   public ffp(bwv $$0) {
      this($$0, $$0.dt());
   }

   public ffp(bwv $$0, ffs $$1) {
      super($$1);
      this.b = $$0;
   }

   public bwv a() {
      return this.b;
   }

   @Override
   public ffq.a d() {
      return ffq.a.c;
   }
}
