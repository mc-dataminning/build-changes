public record ajh(int b, aju c) implements zs<ajg> {
   public static final zj<wi, ajh> a = zs.a(ajh::a, ajh::new);
   private static final int d = 1048576;

   private ajh(wi $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static aju a(all $$0, wi $$1) {
      return b($$0, $$1);
   }

   private static ajw b(all $$0, wi $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.k($$2);
         return new ajw($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(wi $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public zu<ajh> a() {
      return ajm.a;
   }

   public void a(ajg $$0) {
      $$0.a(this);
   }

   public aju e() {
      return this.c;
   }
}
