public record ahr(int b, aie c) implements yn<ahq> {
   public static final ye<vg, ahr> a = yn.a(ahr::a, ahr::new);
   private static final int d = 1048576;

   private ahr(vg $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static aie a(ajt $$0, vg $$1) {
      return b($$0, $$1);
   }

   private static aig b(ajt $$0, vg $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new aig($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(vg $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public yp<ahr> a() {
      return ahw.a;
   }

   public void a(ahq $$0) {
      $$0.a(this);
   }

   public aie e() {
      return this.c;
   }
}
