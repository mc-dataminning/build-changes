public record aip(int b, ajc c) implements zg<aio> {
   public static final yx<vw, aip> a = zg.a(aip::a, aip::new);
   private static final int d = 1048576;

   private aip(vw $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static ajc a(akr $$0, vw $$1) {
      return b($$0, $$1);
   }

   private static aje b(akr $$0, vw $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new aje($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(vw $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public zi<aip> a() {
      return aiu.a;
   }

   public void a(aio $$0) {
      $$0.a(this);
   }

   public ajc e() {
      return this.c;
   }
}
