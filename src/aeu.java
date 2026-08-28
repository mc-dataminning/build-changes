public class aeu implements zp<ace> {
   public static final zg<wf, aeu> a = zp.a(aeu::a, aeu::new);
   private final int b;
   private final byte c;

   public aeu(bue $$0, byte $$1) {
      this.b = $$0.as();
      this.c = $$1;
   }

   private aeu(wf $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(wf $$0) {
      $$0.c(this.b);
      $$0.l(this.c);
   }

   @Override
   public zr<aeu> a() {
      return agt.an;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public bue a(dfb $$0) {
      return $$0.a(this.b);
   }

   public float b() {
      return azk.a(this.c);
   }
}
