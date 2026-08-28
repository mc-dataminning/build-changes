public class ade implements zs<ach> {
   public static final zj<ww, ade> a = zs.a(ade::a, ade::new);
   private final int b;
   private final int c;
   private final int d;
   private final cwf e;

   public ade(int $$0, int $$1, int $$2, cwf $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3.v();
   }

   private ade(ww $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = $$0.readShort();
      this.e = cwf.h.decode($$0);
   }

   private void a(ww $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      $$0.m(this.d);
      cwf.h.encode($$0, this.e);
   }

   @Override
   public zu<ade> a() {
      return agw.w;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.d;
   }

   public cwf f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
