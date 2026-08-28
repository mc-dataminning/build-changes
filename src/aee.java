public class aee implements yv<abk> {
   public static final ym<vl, aee> a = yv.a(aee::a, aee::new);
   private final int b;
   private final byte c;

   public aee(buk $$0, byte $$1) {
      this.b = $$0.ar();
      this.c = $$1;
   }

   private aee(vl $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(vl $$0) {
      $$0.c(this.b);
      $$0.l(this.c);
   }

   @Override
   public yx<aee> a() {
      return agd.aq;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public buk a(dgi $$0) {
      return $$0.a(this.b);
   }

   public float b() {
      return ayz.a(this.c);
   }
}
