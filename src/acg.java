public class acg implements zl<aca> {
   public static final zc<wb, acg> a = zl.a(acg::a, acg::new);
   private final int b;
   private final jf c;
   private final int d;

   public acg(int $$0, jf $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private acg(wb $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(wb $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
   }

   @Override
   public zn<acg> a() {
      return agp.h;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public jf e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
