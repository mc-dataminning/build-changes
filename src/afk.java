public class afk implements ze<abq> {
   public static final yv<wi, afk> a = ze.a(afk::a, afk::new);
   public static final float b = 8.0F;
   private final ix<avg> c;
   private final avi d;
   private final int e;
   private final int f;
   private final int g;
   private final float h;
   private final float i;
   private final long j;

   public afk(ix<avg> $$0, avi $$1, double $$2, double $$3, double $$4, float $$5, float $$6, long $$7) {
      this.c = $$0;
      this.d = $$1;
      this.e = (int)($$2 * 8.0);
      this.f = (int)($$3 * 8.0);
      this.g = (int)($$4 * 8.0);
      this.h = $$5;
      this.i = $$6;
      this.j = $$7;
   }

   private afk(wi $$0) {
      this.c = avg.d.decode($$0);
      this.d = $$0.b(avi.class);
      this.e = $$0.readInt();
      this.f = $$0.readInt();
      this.g = $$0.readInt();
      this.h = $$0.readFloat();
      this.i = $$0.readFloat();
      this.j = $$0.readLong();
   }

   private void a(wi $$0) {
      avg.d.encode($$0, this.c);
      $$0.a(this.d);
      $$0.p(this.e);
      $$0.p(this.f);
      $$0.p(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
      $$0.b(this.j);
   }

   @Override
   public zg<afk> a() {
      return agb.aS;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public ix<avg> b() {
      return this.c;
   }

   public avi e() {
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
