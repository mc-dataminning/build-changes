public record aat(aat.a c) implements aam {
   public static final za<vy, aat> a = aam.a(aat::a, aat::new);
   public static final aam.b<aat> b = aam.a("debug/hive");

   private aat(vy $$0) {
      this(new aat.a($$0));
   }

   private void a(vy $$0) {
      this.c.a($$0);
   }

   @Override
   public aam.b<aat> a() {
      return b;
   }

   public aat.a b() {
      return this.c;
   }

   public static record a(iw a, String b, int c, int d, boolean e) {
      public a(vy $$0) {
         this($$0.e(), $$0.p(), $$0.readInt(), $$0.readInt(), $$0.readBoolean());
      }

      public void a(vy $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.q(this.c);
         $$0.q(this.d);
         $$0.a(this.e);
      }
   }
}
