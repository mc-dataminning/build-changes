public class ahz implements zq<agw> {
   public static final zh<wg, ahz> a = zq.a(ahz::a, ahz::new);
   private final int b;
   private final alj c;
   private final boolean d;

   public ahz(int $$0, dbc<?> $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
   }

   private ahz(wg $$0) {
      this.b = $$0.x();
      this.c = $$0.q();
      this.d = $$0.readBoolean();
   }

   private void a(wg $$0) {
      $$0.f(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zs<ahz> a() {
      return agu.bL;
   }

   public void a(agw $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public alj e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
