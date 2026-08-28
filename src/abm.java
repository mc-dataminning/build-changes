public record abm(abm.a c) implements abf {
   public static final zt<ws, abm> a = abf.a(abm::a, abm::new);
   public static final abf.b<abm> b = abf.a("debug/hive");

   private abm(ws $$0) {
      this(new abm.a($$0));
   }

   private void a(ws $$0) {
      this.c.a($$0);
   }

   @Override
   public abf.b<abm> a() {
      return b;
   }

   public abm.a b() {
      return this.c;
   }

   public static record a(jh a, String b, int c, int d, boolean e) {
      public a(ws $$0) {
         this($$0.e(), $$0.p(), $$0.readInt(), $$0.readInt(), $$0.readBoolean());
      }

      public void a(ws $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
         $$0.q(this.c);
         $$0.q(this.d);
         $$0.a(this.e);
      }
   }
}
