public enum emc {
   a(0, drq.a),
   b(1, drq.b),
   c(2, drq.c),
   d(3, drq.d);

   private final int e;
   private final sw f;

   private emc(int $$0, acp<drp> $$1) {
      this.e = $$0;
      this.f = sw.c($$1.a().f("generator"));
   }

   public sw a() {
      return this.f;
   }

   public int b() {
      return this.e;
   }
}
