public record afp(int b, int c, boolean d) implements yb<aez> {
   public static final xs<uu, afp> a = yb.a(afp::a, afp::new);

   private afp(uu $$0) {
      this($$0.l(), $$0.l(), $$0.readBoolean());
   }

   private void a(uu $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public yd<afp> a() {
      return aex.bs;
   }

   public void a(aez $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
