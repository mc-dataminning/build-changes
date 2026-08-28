public record aaf(aaf.a c) implements zy {
   public static final ym<vl, aaf> a = zy.a(aaf::a, aaf::new);
   public static final zy.b<aaf> b = zy.a("debug/hive");

   private aaf(vl $$0) {
      this(new aaf.a($$0));
   }

   private void a(vl $$0) {
      this.c.a($$0);
   }

   @Override
   public zy.b<aaf> a() {
      return b;
   }

   public aaf.a b() {
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
