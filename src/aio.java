public record aio(int b, ajb c) implements zf<ain> {
   public static final yw<vv, aio> a = zf.a(aio::a, aio::new);
   private static final int d = 1048576;

   private aio(vv $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static ajb a(akq $$0, vv $$1) {
      return b($$0, $$1);
   }

   private static ajd b(akq $$0, vv $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new ajd($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(vv $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public zh<aio> a() {
      return ait.a;
   }

   public void a(ain $$0) {
      $$0.a(this);
   }

   public ajb e() {
      return this.c;
   }
}
