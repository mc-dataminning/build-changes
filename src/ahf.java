public class ahf implements zb<afz> {
   public static final ys<vu, ahf> a = zb.a(ahf::a, ahf::new);
   private final cps b;
   private final boolean c;
   private final boolean d;

   public ahf(cps $$0, boolean $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahf(vu $$0) {
      this.b = $$0.b(cps.class);
      this.c = $$0.readBoolean();
      this.d = $$0.readBoolean();
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zd<ahf> a() {
      return afx.bL;
   }

   public void a(afz $$0) {
      $$0.a(this);
   }

   public cps b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
