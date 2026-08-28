public class acq implements zf<abu> {
   public static final yw<wj, acq> a = zf.a(acq::a, acq::new);
   private final int b;
   private final int c;
   private final int d;
   private final cyy e;

   public acq(int $$0, int $$1, int $$2, cyy $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3.v();
   }

   private acq(wj $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = $$0.readShort();
      this.e = cyy.h.decode($$0);
   }

   private void a(wj $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      $$0.m(this.d);
      cyy.h.encode($$0, this.e);
   }

   @Override
   public zh<acq> a() {
      return agn.v;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.d;
   }

   public cyy f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
