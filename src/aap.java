public record aap(aap.a c) implements aai {
   public static final yw<vu, aap> a = aai.a(aap::a, aap::new);
   public static final aai.b<aap> b = aai.a("debug/hive");

   private aap(vu $$0) {
      this(new aap.a($$0));
   }

   private void a(vu $$0) {
      this.c.a($$0);
   }

   @Override
   public aai.b<aap> a() {
      return b;
   }

   public aap.a b() {
      return this.c;
   }

   public static record a(iv a, String b, int c, int d, boolean e) {
      public a(vu $$0) {
         this($$0.e(), $$0.p(), $$0.readInt(), $$0.readInt(), $$0.readBoolean());
      }

      public void a(vu $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.q(this.c);
         $$0.q(this.d);
         $$0.a(this.e);
      }
   }
}
