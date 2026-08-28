public class aei implements zw<aci> {
   public static final zn<wm, aei> a = zw.a(aei::a, aei::new);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   private static final int e = 8;
   private final boolean f;
   private final boolean g;
   private final boolean h;
   private final boolean i;
   private final float j;
   private final float k;

   public aei(cmw $$0) {
      this.f = $$0.a;
      this.g = $$0.b;
      this.h = $$0.c;
      this.i = $$0.d;
      this.j = $$0.a();
      this.k = $$0.b();
   }

   private aei(wm $$0) {
      byte $$1 = $$0.readByte();
      this.f = ($$1 & 1) != 0;
      this.g = ($$1 & 2) != 0;
      this.h = ($$1 & 4) != 0;
      this.i = ($$1 & 8) != 0;
      this.j = $$0.readFloat();
      this.k = $$0.readFloat();
   }

   private void a(wm $$0) {
      byte $$1 = 0;
      if (this.f) {
         $$1 = (byte)($$1 | 1);
      }

      if (this.g) {
         $$1 = (byte)($$1 | 2);
      }

      if (this.h) {
         $$1 = (byte)($$1 | 4);
      }

      if (this.i) {
         $$1 = (byte)($$1 | 8);
      }

      $$0.k($$1);
      $$0.a(this.j);
      $$0.a(this.k);
   }

   @Override
   public zy<aei> a() {
      return agu.Z;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.f;
   }

   public boolean e() {
      return this.g;
   }

   public boolean f() {
      return this.h;
   }

   public boolean g() {
      return this.i;
   }

   public float h() {
      return this.j;
   }

   public float i() {
      return this.k;
   }
}
