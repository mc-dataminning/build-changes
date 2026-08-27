public class acd implements zb<abm> {
   public static final ys<vu, acd> a = zb.a(acd::a, acd::new);
   private final boolean b;

   public acd(boolean $$0) {
      this.b = $$0;
   }

   private acd(vu $$0) {
      this.b = $$0.readBoolean();
   }

   private void a(vu $$0) {
      $$0.a(this.b);
   }

   @Override
   public zd<acd> a() {
      return afx.q;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.b;
   }
}
