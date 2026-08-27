public class ags implements yz<afx> {
   public static final yq<vs, ags> a = yz.a(ags::a, ags::new);
   private final im b;
   private final int c;
   private final boolean d;

   public ags(im $$0, int $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ags(vs $$0) {
      this.b = $$0.e();
      this.c = $$0.l();
      this.d = $$0.readBoolean();
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zb<ags> a() {
      return afv.bx;
   }

   public void a(afx $$0) {
      $$0.a(this);
   }

   public im b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
