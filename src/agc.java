public class agc implements zw<aci> {
   public static final zn<xa, agc> a = zw.a(agc::a, agc::new);
   private final ji<avz> b;
   private final awb c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public agc(ji<avz> $$0, awb $$1, bsv $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.al();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private agc(xa $$0) {
      this.b = avz.d.decode($$0);
      this.c = $$0.b(awb.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(xa $$0) {
      avz.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public zy<agc> a() {
      return agu.aR;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public ji<avz> b() {
      return this.b;
   }

   public awb e() {
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
