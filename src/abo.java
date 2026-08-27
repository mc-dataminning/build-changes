public class abo implements wo<yh> {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   private final String d;
   private final uv e;
   private final elb.a f;
   private final int g;

   public abo(ekv $$0, int $$1) {
      this.d = $$0.b();
      this.e = $$0.d();
      this.f = $$0.f();
      this.g = $$1;
   }

   public abo(ty $$0) {
      this.d = $$0.s();
      this.g = $$0.readByte();
      if (this.g != 0 && this.g != 2) {
         this.e = uu.a;
         this.f = elb.a.a;
      } else {
         this.e = $$0.m();
         this.f = $$0.b(elb.a.class);
      }
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.d);
      $$0.k(this.g);
      if (this.g == 0 || this.g == 2) {
         $$0.a(this.e);
         $$0.a(this.f);
      }
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.d;
   }

   public uv d() {
      return this.e;
   }

   public int e() {
      return this.g;
   }

   public elb.a f() {
      return this.f;
   }
}
