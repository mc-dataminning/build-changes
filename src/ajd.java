public record ajd(int b, ajq c) implements zw<ajc> {
   public static final zn<wm, ajd> a = zw.a(ajd::a, ajd::new);
   private static final int d = 1048576;

   private ajd(wm $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static ajq a(alf $$0, wm $$1) {
      return b($$0, $$1);
   }

   private static ajs b(alf $$0, wm $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new ajs($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(wm $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public zy<ajd> a() {
      return aji.a;
   }

   public void a(ajc $$0) {
      $$0.a(this);
   }

   public ajq e() {
      return this.c;
   }
}
