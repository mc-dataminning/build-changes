public record aam(aam.a c) implements aaf {
   public static final yv<vx, aam> a = aaf.a(aam::a, aam::new);
   public static final aaf.b<aam> b = aaf.a("debug/hive");

   private aam(vx $$0) {
      this(new aam.a($$0));
   }

   private void a(vx $$0) {
      this.c.a($$0);
   }

   @Override
   public aaf.b<aam> a() {
      return b;
   }

   public aam.a b() {
      return this.c;
   }

   public static record a(io a, String b, int c, int d, boolean e) {
      public a(vx $$0) {
         this($$0.e(), $$0.p(), $$0.readInt(), $$0.readInt(), $$0.readBoolean());
      }

      public void a(vx $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.p(this.c);
         $$0.p(this.d);
         $$0.a(this.e);
      }
   }
}
