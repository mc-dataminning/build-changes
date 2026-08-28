public class aei implements zf<abt> {
   public static final yw<vv, aei> a = zf.a(aei::a, aei::new);
   private final int b;
   private final byte c;

   public aei(bsq $$0, byte $$1) {
      this.b = $$0.an();
      this.c = $$1;
   }

   private aei(vv $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(vv $$0) {
      $$0.c(this.b);
      $$0.k(this.c);
   }

   @Override
   public zh<aei> a() {
      return agf.am;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public bsq a(dcu $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
