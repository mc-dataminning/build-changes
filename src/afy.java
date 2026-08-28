public class afy implements zl<aca> {
   public static final zc<wp, afy> a = zl.a(afy::a, afy::new);
   public static final float b = 8.0F;
   private final jo<awf> c;
   private final awh d;
   private final int e;
   private final int f;
   private final int g;
   private final float h;
   private final float i;
   private final long j;

   public afy(jo<awf> $$0, awh $$1, double $$2, double $$3, double $$4, float $$5, float $$6, long $$7) {
      this.c = $$0;
      this.d = $$1;
      this.e = (int)($$2 * 8.0);
      this.f = (int)($$3 * 8.0);
      this.g = (int)($$4 * 8.0);
      this.h = $$5;
      this.i = $$6;
      this.j = $$7;
   }

   private afy(wp $$0) {
      this.c = awf.d.decode($$0);
      this.d = $$0.b(awh.class);
      this.e = $$0.readInt();
      this.f = $$0.readInt();
      this.g = $$0.readInt();
      this.h = $$0.readFloat();
      this.i = $$0.readFloat();
      this.j = $$0.readLong();
   }

   private void a(wp $$0) {
      awf.d.encode($$0, this.c);
      $$0.a(this.d);
      $$0.q(this.e);
      $$0.q(this.f);
      $$0.q(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
      $$0.b(this.j);
   }

   @Override
   public zn<afy> a() {
      return agp.aT;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public jo<awf> b() {
      return this.c;
   }

   public awh e() {
      return this.d;
   }

   public double f() {
      return (double)((float)this.e / 8.0F);
   }

   public double g() {
      return (double)((float)this.f / 8.0F);
   }

   public double h() {
      return (double)((float)this.g / 8.0F);
   }

   public float i() {
      return this.h;
   }

   public float j() {
      return this.i;
   }

   public long k() {
      return this.j;
   }
}
