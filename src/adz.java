public record adz(int a, String b, int c, ady d) implements wb<aea> {
   private static final int e = 255;

   @Deprecated
   public adz(int a, String b, int c, ady d) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public adz(tl $$0) {
      this($$0.n(), $$0.d(255), $$0.readUnsignedShort(), ady.a($$0.n()));
   }

   @Override
   public void a(tl $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.c(this.d.a());
   }

   public void a(aea $$0) {
      $$0.a(this);
   }

   @Override
   public tk c() {
      return this.d.b();
   }

   public String d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public ady f() {
      return this.d;
   }
}
