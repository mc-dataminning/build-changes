public record aii(int b, aiv c) implements zb<aih> {
   public static final ys<vr, aii> a = zb.a(aii::a, aii::new);
   private static final int d = 1048576;

   private aii(vr $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static aiv a(akk $$0, vr $$1) {
      return b($$0, $$1);
   }

   private static aix b(akk $$0, vr $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new aix($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(vr $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public zd<aii> a() {
      return ain.a;
   }

   public void a(aih $$0) {
      $$0.a(this);
   }

   public aiv e() {
      return this.c;
   }
}
