public record ahb(int b, aho c) implements xz<aha> {
   public static final xq<us, ahb> a = xz.a(ahb::a, ahb::new);
   private static final int d = 1048576;

   private ahb(us $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static aho a(ajc $$0, us $$1) {
      return b($$0, $$1);
   }

   private static ahq b(ajc $$0, us $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new ahq($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(us $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public yb<ahb> a() {
      return ahg.a;
   }

   public void a(aha $$0) {
      $$0.a(this);
   }

   public aho e() {
      return this.c;
   }
}
