public record afl(int b, int c, boolean d) implements xz<aev> {
   public static final xq<us, afl> a = xz.a(afl::a, afl::new);

   private afl(us $$0) {
      this($$0.l(), $$0.l(), $$0.readBoolean());
   }

   private void a(us $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public yb<afl> a() {
      return aet.bs;
   }

   public void a(aev $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
