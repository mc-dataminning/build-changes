public class aab implements wk<yd> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 4;
   private static final int d = 8;
   private final boolean e;
   private final boolean f;
   private final boolean g;
   private final boolean h;
   private final float i;
   private final float j;

   public aab(cdj $$0) {
      this.e = $$0.a;
      this.f = $$0.b;
      this.g = $$0.c;
      this.h = $$0.d;
      this.i = $$0.a();
      this.j = $$0.b();
   }

   public aab(tu $$0) {
      byte $$1 = $$0.readByte();
      this.e = ($$1 & 1) != 0;
      this.f = ($$1 & 2) != 0;
      this.g = ($$1 & 4) != 0;
      this.h = ($$1 & 8) != 0;
      this.i = $$0.readFloat();
      this.j = $$0.readFloat();
   }

   @Override
   public void a(tu $$0) {
      byte $$1 = 0;
      if (this.e) {
         $$1 = (byte)($$1 | 1);
      }

      if (this.f) {
         $$1 = (byte)($$1 | 2);
      }

      if (this.g) {
         $$1 = (byte)($$1 | 4);
      }

      if (this.h) {
         $$1 = (byte)($$1 | 8);
      }

      $$0.k($$1);
      $$0.a(this.i);
      $$0.a(this.j);
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }

   public boolean e() {
      return this.g;
   }

   public boolean f() {
      return this.h;
   }

   public float g() {
      return this.i;
   }

   public float h() {
      return this.j;
   }
}
