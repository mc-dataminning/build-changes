public record aah(aah.a c) implements aaa {
   public static final yq<vs, aah> a = aaa.a(aah::a, aah::new);
   public static final aaa.b<aah> b = aaa.a("debug/hive");

   private aah(vs $$0) {
      this(new aah.a($$0));
   }

   private void a(vs $$0) {
      this.c.a($$0);
   }

   @Override
   public aaa.b<aah> a() {
      return b;
   }

   public aah.a b() {
      return this.c;
   }

   public static record a(im a, String b, int c, int d, boolean e) {
      public a(vs $$0) {
         this($$0.e(), $$0.p(), $$0.readInt(), $$0.readInt(), $$0.readBoolean());
      }

      public void a(vs $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.p(this.c);
         $$0.p(this.d);
         $$0.a(this.e);
      }
   }
}
