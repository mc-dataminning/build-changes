public record aht(int b, aig c) implements yp<ahs> {
   public static final yg<vi, aht> a = yp.a(aht::a, aht::new);
   private static final int d = 1048576;

   private aht(vi $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static aig a(ajv $$0, vi $$1) {
      return b($$0, $$1);
   }

   private static aii b(ajv $$0, vi $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new aii($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(vi $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public yr<aht> a() {
      return ahy.a;
   }

   public void a(ahs $$0) {
      $$0.a(this);
   }

   public aig e() {
      return this.c;
   }
}
