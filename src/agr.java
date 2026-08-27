public record agr(int b, String c, int d, agq e) implements xx<agu> {
   public static final xo<uq, agr> a = xx.a(agr::a, agr::new);
   private static final int f = 255;

   @Deprecated
   public agr(int b, String c, int d, agq e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private agr(uq $$0) {
      this($$0.n(), $$0.d(255), $$0.readUnsignedShort(), agq.a($$0.n()));
   }

   private void a(uq $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public xz<agr> a() {
      return ags.a;
   }

   public void a(agu $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public agq g() {
      return this.e;
   }
}
