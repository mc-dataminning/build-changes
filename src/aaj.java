public record aaj(aaj.a c) implements aac {
   public static final ys<vu, aaj> a = aac.a(aaj::a, aaj::new);
   public static final aac.b<aaj> b = aac.a("debug/hive");

   private aaj(vu $$0) {
      this(new aaj.a($$0));
   }

   private void a(vu $$0) {
      this.c.a($$0);
   }

   @Override
   public aac.b<aaj> a() {
      return b;
   }

   public aaj.a b() {
      return this.c;
   }

   public static record a(in a, String b, int c, int d, boolean e) {
      public a(vu $$0) {
         this($$0.e(), $$0.p(), $$0.readInt(), $$0.readInt(), $$0.readBoolean());
      }

      public void a(vu $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.p(this.c);
         $$0.p(this.d);
         $$0.a(this.e);
      }
   }
}
