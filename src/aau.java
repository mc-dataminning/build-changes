public record aau(aau.a c) implements aan {
   public static final zb<wa, aau> a = aan.a(aau::a, aau::new);
   public static final aan.b<aau> b = aan.a("debug/hive");

   private aau(wa $$0) {
      this(new aau.a($$0));
   }

   private void a(wa $$0) {
      this.c.a($$0);
   }

   @Override
   public aan.b<aau> a() {
      return b;
   }

   public aau.a b() {
      return this.c;
   }

   public static record a(je a, String b, int c, int d, boolean e) {
      public a(wa $$0) {
         this($$0.e(), $$0.p(), $$0.readInt(), $$0.readInt(), $$0.readBoolean());
      }

      public void a(wa $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.q(this.c);
         $$0.q(this.d);
         $$0.a(this.e);
      }
   }
}
