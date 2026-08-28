public record aag(aag.a c) implements zz {
   public static final yn<vl, aag> a = zz.a(aag::a, aag::new);
   public static final zz.b<aag> b = zz.a("debug/hive");

   private aag(vl $$0) {
      this(new aag.a($$0));
   }

   private void a(vl $$0) {
      this.c.a($$0);
   }

   @Override
   public zz.b<aag> a() {
      return b;
   }

   public aag.a b() {
      return this.c;
   }

   public static record a(ji a, String b, int c, int d, boolean e) {
      public a(vl $$0) {
         this($$0.e(), $$0.p(), $$0.readInt(), $$0.readInt(), $$0.readBoolean());
      }

      public void a(vl $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.q(this.c);
         $$0.q(this.d);
         $$0.a(this.e);
      }
   }
}
