public record aar(aar.a c) implements aak {
   public static final yy<vw, aar> a = aak.a(aar::a, aar::new);
   public static final aak.b<aar> b = aak.a("debug/hive");

   private aar(vw $$0) {
      this(new aar.a($$0));
   }

   private void a(vw $$0) {
      this.c.a($$0);
   }

   @Override
   public aak.b<aar> a() {
      return b;
   }

   public aar.a b() {
      return this.c;
   }

   public static record a(iv a, String b, int c, int d, boolean e) {
      public a(vw $$0) {
         this($$0.e(), $$0.p(), $$0.readInt(), $$0.readInt(), $$0.readBoolean());
      }

      public void a(vw $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.q(this.c);
         $$0.q(this.d);
         $$0.a(this.e);
      }
   }
}
