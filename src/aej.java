public class aej implements zk<abz> {
   public static final zb<wa, aej> a = zk.a(aej::a, aej::new);
   private final int b;
   private final double c;

   public aej(int $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aej(wa $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
   }

   private void a(wa $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zm<aej> a() {
      return ago.bf;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }
}
