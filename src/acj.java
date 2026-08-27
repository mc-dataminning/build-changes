public record acj(int b, float c) implements yp<aba> {
   public static final yg<vi, acj> a = yp.a(acj::a, acj::new);

   public acj(bqt $$0) {
      this($$0.aj(), $$0.eG());
   }

   private acj(vi $$0) {
      this($$0.l(), $$0.readFloat());
   }

   private void a(vi $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public yr<acj> a() {
      return afl.I;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }
}
