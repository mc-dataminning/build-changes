public record aba(aba.a c) implements aat {
   public static final zj<wl, aba> a = aat.a(aba::a, aba::new);
   public static final aat.b<aba> b = aat.a("debug/hive");

   private aba(wl $$0) {
      this(new aba.a($$0));
   }

   private void a(wl $$0) {
      this.c.a($$0);
   }

   @Override
   public aat.b<aba> a() {
      return b;
   }

   public aba.a b() {
      return this.c;
   }

   public static record a(iz a, String b, int c, int d, boolean e) {
      public a(wl $$0) {
         this($$0.e(), $$0.p(), $$0.readInt(), $$0.readInt(), $$0.readBoolean());
      }

      public void a(wl $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.p(this.c);
         $$0.p(this.d);
         $$0.a(this.e);
      }
   }
}
