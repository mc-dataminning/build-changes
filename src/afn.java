public class afn implements zf<abt> {
   public static final yw<wj, afn> a = zf.a(afn::a, afn::new);
   private final jm<avn> b;
   private final avp c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public afn(jm<avn> $$0, avp $$1, bsq $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.an();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private afn(wj $$0) {
      this.b = avn.d.decode($$0);
      this.c = $$0.b(avp.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(wj $$0) {
      avn.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public zh<afn> a() {
      return agf.aR;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public jm<avn> b() {
      return this.b;
   }

   public avp e() {
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
