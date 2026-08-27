public record air(int b, aje c) implements zl<aiq> {
   public static final zc<we, air> a = zl.a(air::a, air::new);
   private static final int d = 1048576;

   private air(we $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static aje a(akt $$0, we $$1) {
      return b($$0, $$1);
   }

   private static ajg b(akt $$0, we $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new ajg($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(we $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public zn<air> a() {
      return aiw.a;
   }

   public void a(aiq $$0) {
      $$0.a(this);
   }

   public aje e() {
      return this.c;
   }
}
