public class aen implements zf<abu> {
   public static final yw<vu, aen> a = zf.a(aen::a, aen::new);
   private final int b;
   private final byte c;

   public aen(bwi $$0, byte $$1) {
      this.b = $$0.ao();
      this.c = $$1;
   }

   private aen(vu $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(vu $$0) {
      $$0.c(this.b);
      $$0.l(this.c);
   }

   @Override
   public zh<aen> a() {
      return agn.aq;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public bwi a(djm $$0) {
      return $$0.a(this.b);
   }

   public float b() {
      return azm.a(this.c);
   }
}
