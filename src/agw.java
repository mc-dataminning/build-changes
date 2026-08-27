public class agw implements yz<afx> {
   public static final yq<vs, agw> a = yz.a(agw::a, agw::new);
   private final boolean b;
   private final boolean c;

   public agw(boolean $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private agw(vs $$0) {
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(afx $$0) {
      $$0.a(this);
   }

   @Override
   public zb<agw> a() {
      return afv.bE;
   }

   public boolean b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
