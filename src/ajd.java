public record ajd(int b, ajq c) implements zo<ajc> {
   public static final zf<we, ajd> a = zo.a(ajd::a, ajd::new);
   private static final int d = 1048576;

   private ajd(we $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static ajq a(alh $$0, we $$1) {
      return b($$0, $$1);
   }

   private static ajs b(alh $$0, we $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.k($$2);
         return new ajs($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(we $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public zq<ajd> a() {
      return aji.a;
   }

   public void a(ajc $$0) {
      $$0.a(this);
   }

   public ajq e() {
      return this.c;
   }
}
