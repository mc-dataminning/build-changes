public record acz(int a, String b, int c, acy d) implements va<ada> {
   private static final int e = 255;

   @Deprecated
   public acz(int a, String b, int c, acy d) {
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
   }

   public acz(sl $$0) {
      this($$0.m(), $$0.d(255), $$0.readUnsignedShort(), acy.a($$0.m()));
   }

   @Override
   public void a(sl $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.c(this.d.a());
   }

   public void a(ada $$0) {
      $$0.a(this);
   }

   @Override
   public sk c() {
      return this.d.b();
   }

   public String d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public acy f() {
      return this.d;
   }
}
