public class ahd implements yz<afx> {
   public static final yq<vs, ahd> a = yz.a(ahd::a, ahd::new);
   private final cow b;
   private final boolean c;
   private final boolean d;

   public ahd(cow $$0, boolean $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahd(vs $$0) {
      this.b = $$0.b(cow.class);
      this.c = $$0.readBoolean();
      this.d = $$0.readBoolean();
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zb<ahd> a() {
      return afv.bL;
   }

   public void a(afx $$0) {
      $$0.a(this);
   }

   public cow b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
