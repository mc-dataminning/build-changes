public class aia implements zj<agt> {
   public static final za<vy, aia> a = zj.a(aia::a, aia::new);
   private final int b;
   private final aia.a c;
   private final int d;

   public aia(bwv $$0, aia.a $$1) {
      this($$0, $$1, 0);
   }

   public aia(bwv $$0, aia.a $$1, int $$2) {
      this.b = $$0.ao();
      this.c = $$1;
      this.d = $$2;
   }

   private aia(vy $$0) {
      this.b = $$0.l();
      this.c = $$0.b(aia.a.class);
      this.d = $$0.l();
   }

   private void a(vy $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.c(this.d);
   }

   @Override
   public zl<aia> a() {
      return agr.bT;
   }

   public void a(agt $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public aia.a e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g,
      h,
      i;
   }
}
