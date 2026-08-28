public record abe(abe.a c) implements aax {
   public static final zn<wm, abe> a = aax.a(abe::a, abe::new);
   public static final aax.b<abe> b = aax.a("debug/hive");

   private abe(wm $$0) {
      this(new abe.a($$0));
   }

   private void a(wm $$0) {
      this.c.a($$0);
   }

   @Override
   public aax.b<abe> a() {
      return b;
   }

   public abe.a b() {
      return this.c;
   }

   public static record a(iz a, String b, int c, int d, boolean e) {
      public a(wm $$0) {
         this($$0.e(), $$0.p(), $$0.readInt(), $$0.readInt(), $$0.readBoolean());
      }

      public void a(wm $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.p(this.c);
         $$0.p(this.d);
         $$0.a(this.e);
      }
   }
}
