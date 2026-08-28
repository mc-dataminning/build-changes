public class aej implements zg<abu> {
   public static final yx<vw, aej> a = zg.a(aej::a, aej::new);
   private final int b;
   private final byte c;

   public aej(bsr $$0, byte $$1) {
      this.b = $$0.an();
      this.c = $$1;
   }

   private aej(vw $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(vw $$0) {
      $$0.c(this.b);
      $$0.k(this.c);
   }

   @Override
   public zi<aej> a() {
      return agg.am;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public bsr a(dcw $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
