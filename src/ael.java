public class ael implements zl<abw> {
   public static final zc<we, ael> a = zl.a(ael::a, ael::new);
   private final int b;
   private final byte c;

   public ael(brv $$0, byte $$1) {
      this.b = $$0.al();
      this.c = $$1;
   }

   private ael(we $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(we $$0) {
      $$0.c(this.b);
      $$0.k(this.c);
   }

   @Override
   public zn<ael> a() {
      return agj.an;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public brv a(dca $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
