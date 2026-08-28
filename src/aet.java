public class aet implements zo<acd> {
   public static final zf<we, aet> a = zo.a(aet::a, aet::new);
   private final int b;
   private final byte c;

   public aet(btz $$0, byte $$1) {
      this.b = $$0.ar();
      this.c = $$1;
   }

   private aet(we $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(we $$0) {
      $$0.c(this.b);
      $$0.l(this.c);
   }

   @Override
   public zq<aet> a() {
      return ags.an;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public btz a(dev $$0) {
      return $$0.a(this.b);
   }

   public float b() {
      return azj.a(this.c);
   }
}
