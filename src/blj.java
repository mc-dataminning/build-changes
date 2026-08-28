public class blj extends blf {
   private final blg c;
   private final bli d;

   public blj(int $$0, blg $$1, bli $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public blj(int $$0, blg $$1, bli $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new aco((long[])this.b.clone(), this.d));
   }
}
