public class aia implements zl<agl> {
   public static final zc<wp, aia> a = zl.a(aia::a, aia::new);
   private final int b;
   private final cuh c;

   public aia(int $$0, cuh $$1) {
      this.b = $$0;
      this.c = $$1.r();
   }

   private aia(wp $$0) {
      this.b = $$0.readShort();
      this.c = cuh.e.decode($$0);
   }

   private void a(wp $$0) {
      $$0.l(this.b);
      cuh.e.encode($$0, this.c);
   }

   @Override
   public zn<aia> a() {
      return agj.bW;
   }

   public void a(agl $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public cuh e() {
      return this.c;
   }
}
