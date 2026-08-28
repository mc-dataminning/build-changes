public record ajb(int b, String c, int d, aja e) implements zs<aje> {
   public static final zj<wi, ajb> a = zs.a(ajb::a, ajb::new);
   private static final int f = 255;

   @Deprecated
   public ajb(int b, String c, int d, aja e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private ajb(wi $$0) {
      this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), aja.a($$0.l()));
   }

   private void a(wi $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.m(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public zu<ajb> a() {
      return ajc.a;
   }

   public void a(aje $$0) {
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

   public aja g() {
      return this.e;
   }
}
