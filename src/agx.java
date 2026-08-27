public record agx(int b, ahk c) implements xx<agw> {
   public static final xo<uq, agx> a = xx.a(agx::a, agx::new);
   private static final int d = 1048576;

   private agx(uq $$0) {
      this($$0.n(), a($$0.s(), $$0));
   }

   private static ahk a(aiy $$0, uq $$1) {
      return b($$0, $$1);
   }

   private static ahm b(aiy $$0, uq $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new ahm($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(uq $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public xz<agx> a() {
      return ahc.a;
   }

   public void a(agw $$0) {
      $$0.a(this);
   }

   public ahk e() {
      return this.c;
   }
}
