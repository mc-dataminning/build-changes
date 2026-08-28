public record ajh(int b, String c, int d, ajg e) implements zo<ajk> {
   public static final ze<vy, ajh> a = zo.a(ajh::a, ajh::new);
   private static final int f = 255;

   @Deprecated
   public ajh(int b, String c, int d, ajg e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private ajh(vy $$0) {
      this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), ajg.a($$0.l()));
   }

   private void a(vy $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.m(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public zq<ajh> a() {
      return aji.a;
   }

   public void a(ajk $$0) {
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

   public ajg g() {
      return this.e;
   }
}
