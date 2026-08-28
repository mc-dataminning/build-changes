public class adx implements zp<ace> {
   public static final zg<wt, adx> a = zp.a(adx::a, adx::new);
   private final int b;
   private final ddz c;
   private final int d;
   private final int e;
   private final boolean f;
   private final boolean g;

   public adx(int $$0, ddz $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private adx(wt $$0) {
      this.b = $$0.x();
      this.c = ddz.b.decode($$0);
      this.d = $$0.l();
      this.e = $$0.l();
      this.f = $$0.readBoolean();
      this.g = $$0.readBoolean();
   }

   private void a(wt $$0) {
      $$0.f(this.b);
      ddz.b.encode($$0, this.c);
      $$0.c(this.d);
      $$0.c(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
   }

   @Override
   public zr<adx> a() {
      return agt.Q;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public ddz e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public boolean h() {
      return this.f;
   }

   public boolean i() {
      return this.g;
   }
}
