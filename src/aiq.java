public record aiq(int b, ajd c) implements yw<aip> {
   public static final yn<vl, aiq> a = yw.a(aiq::a, aiq::new);
   private static final int d = 1048576;

   private aiq(vl $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static ajd a(aku $$0, vl $$1) {
      return b($$0, $$1);
   }

   private static ajf b(aku $$0, vl $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.k($$2);
         return new ajf($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(vl $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public yy<aiq> a() {
      return aiv.a;
   }

   public void a(aip $$0) {
      $$0.a(this);
   }

   public ajd e() {
      return this.c;
   }
}
