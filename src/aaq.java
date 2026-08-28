public record aaq(aaq.a c) implements aaj {
   public static final yx<vw, aaq> a = aaj.a(aaq::a, aaq::new);
   public static final aaj.b<aaq> b = aaj.a("debug/hive");

   private aaq(vw $$0) {
      this(new aaq.a($$0));
   }

   private void a(vw $$0) {
      this.c.a($$0);
   }

   @Override
   public aaj.b<aaq> a() {
      return b;
   }

   public aaq.a b() {
      return this.c;
   }

   public static record a(jd a, String b, int c, int d, boolean e) {
      public a(vw $$0) {
         this($$0.e(), $$0.p(), $$0.readInt(), $$0.readInt(), $$0.readBoolean());
      }

      public void a(vw $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.p(this.c);
         $$0.p(this.d);
         $$0.a(this.e);
      }
   }
}
