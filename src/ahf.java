public record ahf(int b, ahs c) implements yb<ahe> {
   public static final xs<uu, ahf> a = yb.a(ahf::a, ahf::new);
   private static final int d = 1048576;

   private ahf(uu $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static ahs a(ajh $$0, uu $$1) {
      return b($$0, $$1);
   }

   private static ahu b(ajh $$0, uu $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new ahu($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(uu $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public yd<ahf> a() {
      return ahk.a;
   }

   public void a(ahe $$0) {
      $$0.a(this);
   }

   public ahs e() {
      return this.c;
   }
}
