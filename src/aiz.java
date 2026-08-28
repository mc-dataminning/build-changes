public record aiz(int b, ajm c) implements zk<aiy> {
   public static final zb<wa, aiz> a = zk.a(aiz::a, aiz::new);
   private static final int d = 1048576;

   private aiz(wa $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static ajm a(alc $$0, wa $$1) {
      return b($$0, $$1);
   }

   private static ajo b(alc $$0, wa $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.k($$2);
         return new ajo($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(wa $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public zm<aiz> a() {
      return aje.a;
   }

   public void a(aiy $$0) {
      $$0.a(this);
   }

   public ajm e() {
      return this.c;
   }
}
