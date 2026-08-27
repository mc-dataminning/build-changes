public record abi(String b, int c, cbl d, boolean e, int f, bis g, boolean h, boolean i) implements ux<aaw> {
   public static final int a = 16;

   public abi(si $$0) {
      this($$0.d(16), $$0.readByte(), $$0.b(cbl.class), $$0.readBoolean(), $$0.readUnsignedByte(), $$0.b(bis.class), $$0.readBoolean(), $$0.readBoolean());
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.k(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
   }

   public void a(aaw $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.b;
   }

   public int d() {
      return this.c;
   }

   public cbl e() {
      return this.d;
   }

   public boolean f() {
      return this.e;
   }

   public int g() {
      return this.f;
   }

   public bis h() {
      return this.g;
   }

   public boolean i() {
      return this.h;
   }

   public boolean j() {
      return this.i;
   }
}
