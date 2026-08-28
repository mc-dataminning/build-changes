public class agf implements zo<acf> {
   public static final ze<wp, agf> a = zo.a(agf::a, agf::new);
   private final jg<awx> b;
   private final awz c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public agf(jg<awx> $$0, awz $$1, bxe $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.ao();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private agf(wp $$0) {
      this.b = awx.d.decode($$0);
      this.c = $$0.b(awz.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(wp $$0) {
      awx.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public zq<agf> a() {
      return agy.aV;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public jg<awx> b() {
      return this.b;
   }

   public awz e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public float g() {
      return this.e;
   }

   public float h() {
      return this.f;
   }

   public long i() {
      return this.g;
   }
}
