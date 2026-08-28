public class afu implements zf<abu> {
   public static final yw<wj, afu> a = zf.a(afu::a, afu::new);
   private final je<awm> b;
   private final awo c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public afu(je<awm> $$0, awo $$1, bwd $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.ar();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private afu(wj $$0) {
      this.b = awm.d.decode($$0);
      this.c = $$0.b(awo.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(wj $$0) {
      awm.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public zh<afu> a() {
      return agn.aV;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public je<awm> b() {
      return this.b;
   }

   public awo e() {
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
