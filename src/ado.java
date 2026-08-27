public class ado implements yp<aba> {
   public static final yg<vi, ado> a = yp.a(ado::a, ado::new);
   private final int b;
   private final byte c;

   public ado(bqa $$0, byte $$1) {
      this.b = $$0.aj();
      this.c = $$1;
   }

   private ado(vi $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(vi $$0) {
      $$0.c(this.b);
      $$0.k(this.c);
   }

   @Override
   public yr<ado> a() {
      return afl.am;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public bqa a(czg $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
