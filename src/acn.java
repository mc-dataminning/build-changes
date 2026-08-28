public class acn implements zv<ach> {
   public static final zm<wl, acn> a = zv.a(acn::a, acn::new);
   private final int b;
   private final iz c;
   private final int d;

   public acn(int $$0, iz $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private acn(wl $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(wl $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.k(this.d);
   }

   @Override
   public zx<acn> a() {
      return agt.h;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public iz e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
