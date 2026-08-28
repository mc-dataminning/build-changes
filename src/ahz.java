public class ahz implements zl<agr> {
   public static final zc<wb, ahz> a = zl.a(ahz::a, ahz::new);
   private final csp b;
   private final boolean c;
   private final boolean d;

   public ahz(csp $$0, boolean $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahz(wb $$0) {
      this.b = $$0.b(csp.class);
      this.c = $$0.readBoolean();
      this.d = $$0.readBoolean();
   }

   private void a(wb $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zn<ahz> a() {
      return agp.bQ;
   }

   public void a(agr $$0) {
      $$0.a(this);
   }

   public csp b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
