public record aeh(float b, boolean c) implements xx<aag> {
   public static final xo<uq, aeh> a = xx.a(aeh::a, aeh::new);

   private aeh(uq $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static aeh a(bmh $$0) {
      return new aeh($$0.f(), $$0.l());
   }

   private void a(uq $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public xz<aeh> a() {
      return aeq.cb;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
