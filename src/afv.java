public class afv implements zh<abw> {
   public static final yy<vw, afv> a = zh.a(afv::a, afv::new);
   private final int b;
   private final int c;
   private final int d;

   public afv(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afv(vw $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = $$0.readInt();
   }

   private void a(vw $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
      $$0.q(this.d);
   }

   @Override
   public zj<afv> a() {
      return agp.aU;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
