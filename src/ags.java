public class ags implements zf<agp> {
   public static final yw<vu, ags> a = zf.a(ags::a, ags::new);
   private final int b;
   private final iu c;

   public ags(int $$0, iu $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ags(vu $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
   }

   private void a(vu $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zh<ags> a() {
      return agn.bl;
   }

   public void a(agp $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public iu e() {
      return this.c;
   }
}
