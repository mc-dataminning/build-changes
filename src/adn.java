public class adn implements zl<aca> {
   public static final zc<wb, adn> a = zl.a(adn::a, adn::new);
   private final int b;
   private final jf c;
   private final int d;
   private final boolean e;

   public adn(int $$0, jf $$1, int $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1.j();
      this.d = $$2;
      this.e = $$3;
   }

   private adn(wb $$0) {
      this.b = $$0.readInt();
      this.c = $$0.e();
      this.d = $$0.readInt();
      this.e = $$0.readBoolean();
   }

   private void a(wb $$0) {
      $$0.q(this.b);
      $$0.a(this.c);
      $$0.q(this.d);
      $$0.a(this.e);
   }

   @Override
   public zn<adn> a() {
      return agp.L;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.e;
   }

   public int e() {
      return this.b;
   }

   public int f() {
      return this.d;
   }

   public jf g() {
      return this.c;
   }
}
