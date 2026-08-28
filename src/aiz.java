public record aiz(int b, ajm c) implements zs<aiy> {
   public static final zj<wl, aiz> a = zs.a(aiz::a, aiz::new);
   private static final int d = 1048576;

   private aiz(wl $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static ajm a(alb $$0, wl $$1) {
      return b($$0, $$1);
   }

   private static ajo b(alb $$0, wl $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new ajo($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(wl $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public zu<aiz> a() {
      return aje.a;
   }

   public void a(aiy $$0) {
      $$0.a(this);
   }

   public ajm e() {
      return this.c;
   }
}
