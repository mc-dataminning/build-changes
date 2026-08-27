public record ail(int b, aiy c) implements ze<aik> {
   public static final yv<vx, ail> a = ze.a(ail::a, ail::new);
   private static final int d = 1048576;

   private ail(vx $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static aiy a(akn $$0, vx $$1) {
      return b($$0, $$1);
   }

   private static aja b(akn $$0, vx $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new aja($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(vx $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public zg<ail> a() {
      return aiq.a;
   }

   public void a(aik $$0) {
      $$0.a(this);
   }

   public aiy e() {
      return this.c;
   }
}
