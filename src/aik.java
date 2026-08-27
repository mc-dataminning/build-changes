public record aik(int b, aix c) implements ze<aij> {
   public static final yv<vx, aik> a = ze.a(aik::a, aik::new);
   private static final int d = 1048576;

   private aik(vx $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static aix a(akm $$0, vx $$1) {
      return b($$0, $$1);
   }

   private static aiz b(akm $$0, vx $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new aiz($$0);
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
   public zg<aik> a() {
      return aip.a;
   }

   public void a(aij $$0) {
      $$0.a(this);
   }

   public aix e() {
      return this.c;
   }
}
