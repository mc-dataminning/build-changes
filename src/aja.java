public record aja(int b, ajn c) implements zd<aiz> {
   public static final yu<vs, aja> a = zd.a(aja::a, aja::new);
   private static final int d = 1048576;

   private aja(vs $$0) {
      this($$0.l(), a($$0.q(), $$0));
   }

   private static ajn a(ale $$0, vs $$1) {
      return b($$0, $$1);
   }

   private static ajp b(ale $$0, vs $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.k($$2);
         return new ajp($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   private void a(vs $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
   }

   @Override
   public zf<aja> a() {
      return ajf.a;
   }

   public void a(aiz $$0) {
      $$0.a(this);
   }

   public ajn e() {
      return this.c;
   }
}
