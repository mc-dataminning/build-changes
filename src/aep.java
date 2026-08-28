public class aep implements zh<abw> {
   public static final yy<vw, aep> a = zh.a(aep::a, aep::new);
   private final int b;
   private final byte c;

   public aep(bwt $$0, byte $$1) {
      this.b = $$0.ao();
      this.c = $$1;
   }

   private aep(vw $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(vw $$0) {
      $$0.c(this.b);
      $$0.l(this.c);
   }

   @Override
   public zj<aep> a() {
      return agp.aq;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public bwt a(djx $$0) {
      return $$0.a(this.b);
   }

   public float b() {
      return azo.a(this.c);
   }
}
