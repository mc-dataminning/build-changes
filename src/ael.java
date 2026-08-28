public class ael implements zd<abs> {
   public static final yu<vs, ael> a = zd.a(ael::a, ael::new);
   private final int b;
   private final byte c;

   public ael(bwa $$0, byte $$1) {
      this.b = $$0.ar();
      this.c = $$1;
   }

   private ael(vs $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(vs $$0) {
      $$0.c(this.b);
      $$0.l(this.c);
   }

   @Override
   public zf<ael> a() {
      return agl.aq;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public bwa a(dip $$0) {
      return $$0.a(this.b);
   }

   public float b() {
      return azk.a(this.c);
   }
}
