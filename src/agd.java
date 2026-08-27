public record agd(int b, int c, boolean d) implements yp<afn> {
   public static final yg<vi, agd> a = yp.a(agd::a, agd::new);

   private agd(vi $$0) {
      this($$0.l(), $$0.l(), $$0.readBoolean());
   }

   private void a(vi $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public yr<agd> a() {
      return afl.bs;
   }

   public void a(afn $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
