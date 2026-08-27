public record agv(int b, String c, int d, agu e) implements xz<agy> {
   public static final xq<us, agv> a = xz.a(agv::a, agv::new);
   private static final int f = 255;

   @Deprecated
   public agv(int b, String c, int d, agu e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private agv(us $$0) {
      this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), agu.a($$0.l()));
   }

   private void a(us $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public yb<agv> a() {
      return agw.a;
   }

   public void a(agy $$0) {
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

   public agu g() {
      return this.e;
   }
}
