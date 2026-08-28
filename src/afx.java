public class afx implements zh<abw> {
   public static final yy<wl, afx> a = zh.a(afx::a, afx::new);
   public static final float b = 8.0F;
   private final jf<awo> c;
   private final awq d;
   private final int e;
   private final int f;
   private final int g;
   private final float h;
   private final float i;
   private final long j;

   public afx(jf<awo> $$0, awq $$1, double $$2, double $$3, double $$4, float $$5, float $$6, long $$7) {
      this.c = $$0;
      this.d = $$1;
      this.e = (int)($$2 * 8.0);
      this.f = (int)($$3 * 8.0);
      this.g = (int)($$4 * 8.0);
      this.h = $$5;
      this.i = $$6;
      this.j = $$7;
   }

   private afx(wl $$0) {
      this.c = awo.d.decode($$0);
      this.d = $$0.b(awq.class);
      this.e = $$0.readInt();
      this.f = $$0.readInt();
      this.g = $$0.readInt();
      this.h = $$0.readFloat();
      this.i = $$0.readFloat();
      this.j = $$0.readLong();
   }

   private void a(wl $$0) {
      awo.d.encode($$0, this.c);
      $$0.a(this.d);
      $$0.q(this.e);
      $$0.q(this.f);
      $$0.q(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
      $$0.b(this.j);
   }

   @Override
   public zj<afx> a() {
      return agp.aW;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public jf<awo> b() {
      return this.c;
   }

   public awq e() {
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
