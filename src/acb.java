public class acb implements zh<abw> {
   public static final yy<vw, acb> a = zh.a(acb::a, acb::new);
   private final int b;
   private final iv c;
   private final int d;

   public acb(int $$0, iv $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private acb(vw $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(vw $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
   }

   @Override
   public zj<acb> a() {
      return agp.g;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public iv e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
