public class ahg implements zl<agl> {
   public static final zc<we, ahg> a = zl.a(ahg::a, ahg::new);
   private final ir b;
   private final int c;
   private final boolean d;

   public ahg(ir $$0, int $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahg(we $$0) {
      this.b = $$0.e();
      this.c = $$0.l();
      this.d = $$0.readBoolean();
   }

   private void a(we $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zn<ahg> a() {
      return agj.bz;
   }

   public void a(agl $$0) {
      $$0.a(this);
   }

   public ir b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
