public class acr implements zg<abu> {
   public static final yx<wk, acr> a = zg.a(acr::a, acr::new);
   public static final int b = -1;
   public static final int c = -2;
   private final int d;
   private final int e;
   private final int f;
   private final cuq g;

   public acr(int $$0, int $$1, int $$2, cuq $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3.s();
   }

   private acr(wk $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = cuq.h.decode($$0);
   }

   private void a(wk $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      cuq.h.encode($$0, this.g);
   }

   @Override
   public zi<acr> a() {
      return agg.w;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.d;
   }

   public int e() {
      return this.f;
   }

   public cuq f() {
      return this.g;
   }

   public int g() {
      return this.e;
   }
}
