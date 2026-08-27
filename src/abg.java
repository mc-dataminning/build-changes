public record abg(String b, int c, cbj d, boolean e, int f, biq g, boolean h, boolean i) implements uw<aav> {
   public static final int a = 16;

   public abg(sh $$0) {
      this($$0.d(16), $$0.readByte(), $$0.b(cbj.class), $$0.readBoolean(), $$0.readUnsignedByte(), $$0.b(biq.class), $$0.readBoolean(), $$0.readBoolean());
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.k(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
   }

   public void a(aav $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.b;
   }

   public int d() {
      return this.c;
   }

   public cbj e() {
      return this.d;
   }

   public boolean f() {
      return this.e;
   }

   public int g() {
      return this.f;
   }

   public biq h() {
      return this.g;
   }

   public boolean i() {
      return this.h;
   }

   public boolean j() {
      return this.i;
   }
}
