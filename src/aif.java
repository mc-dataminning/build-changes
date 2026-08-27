public record aif(int b, ais c) implements zb<aie> {
   public static final ys<vu, aif> a = zb.a(aif::a, aif::new);
   private static final int d = 1048576;

   private aif(vu $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static ais a(akh $$0, vu $$1) {
      return b($$0, $$1);
   }

   private static aiu b(akh $$0, vu $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new aiu($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(vu $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public zd<aif> a() {
      return aik.a;
   }

   public void a(aie $$0) {
      $$0.a(this);
   }

   public ais e() {
      return this.c;
   }
}
