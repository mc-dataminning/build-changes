public class acq implements zf<abt> {
   public static final yw<wj, acq> a = zf.a(acq::a, acq::new);
   public static final int b = -1;
   public static final int c = -2;
   private final int d;
   private final int e;
   private final int f;
   private final cuo g;

   public acq(int $$0, int $$1, int $$2, cuo $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3.s();
   }

   private acq(wj $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = cuo.h.decode($$0);
   }

   private void a(wj $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      cuo.h.encode($$0, this.g);
   }

   @Override
   public zh<acq> a() {
      return agf.w;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.d;
   }

   public int e() {
      return this.f;
   }

   public cuo f() {
      return this.g;
   }

   public int g() {
      return this.e;
   }
}
