public record add(int a, ado b) implements va<adc> {
   private static final int c = 1048576;

   public add(sl $$0) {
      this($$0.m(), a($$0.s(), $$0));
   }

   private static ado a(aeu $$0, sl $$1) {
      return b($$0, $$1);
   }

   private static adq b(aeu $$0, sl $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new adq($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(sl $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
   }

   public void a(adc $$0) {
      $$0.a(this);
   }

   public ado d() {
      return this.b;
   }
}
