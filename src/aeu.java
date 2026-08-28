public class aeu implements zk<abz> {
   public static final zb<wa, aeu> a = zk.a(aeu::a, aeu::new);
   private final double b;
   private final double c;

   public aeu(dvr $$0) {
      this.b = $$0.a();
      this.c = $$0.b();
   }

   private aeu(wa $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
   }

   private void a(wa $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zm<aeu> a() {
      return ago.as;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public double b() {
      return this.c;
   }

   public double e() {
      return this.b;
   }
}
