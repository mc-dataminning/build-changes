public class afw implements zh<abw> {
   public static final yy<wl, afw> a = zh.a(afw::a, afw::new);
   private final jf<awo> b;
   private final awq c;
   private final int d;
   private final float e;
   private final float f;
   private final long g;

   public afw(jf<awo> $$0, awq $$1, bwt $$2, float $$3, float $$4, long $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.ao();
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private afw(wl $$0) {
      this.b = awo.d.decode($$0);
      this.c = $$0.b(awq.class);
      this.d = $$0.l();
      this.e = $$0.readFloat();
      this.f = $$0.readFloat();
      this.g = $$0.readLong();
   }

   private void a(wl $$0) {
      awo.d.encode($$0, this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e);
      $$0.a(this.f);
      $$0.b(this.g);
   }

   @Override
   public zj<afw> a() {
      return agp.aV;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public jf<awo> b() {
      return this.b;
   }

   public awq e() {
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
