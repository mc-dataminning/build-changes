public class ahz implements zs<ags> {
   public static final zj<wl, ahz> a = zs.a(ahz::a, ahz::new);
   private final crd b;
   private final boolean c;
   private final boolean d;

   public ahz(crd $$0, boolean $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahz(wl $$0) {
      this.b = $$0.b(crd.class);
      this.c = $$0.readBoolean();
      this.d = $$0.readBoolean();
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zu<ahz> a() {
      return agq.bN;
   }

   public void a(ags $$0) {
      $$0.a(this);
   }

   public crd b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
