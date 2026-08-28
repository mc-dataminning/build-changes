public class afl implements aac<acr> {
   public static final zt<ws, afl> a = aac.a(afl::a, afl::new);
   private final int b;
   private final byte c;

   public afl(bvf $$0, byte $$1) {
      this.b = $$0.ar();
      this.c = $$1;
   }

   private afl(ws $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(ws $$0) {
      $$0.c(this.b);
      $$0.l(this.c);
   }

   @Override
   public aae<afl> a() {
      return ahk.aq;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public bvf a(dha $$0) {
      return $$0.a(this.b);
   }

   public float b() {
      return bae.a(this.c);
   }
}
