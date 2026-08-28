public class ahu implements zl<agr> {
   public static final zc<wb, ahu> a = zl.a(ahu::a, ahu::new);
   private final int b;
   private final ale c;
   private final boolean d;

   public ahu(int $$0, dam<?> $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
   }

   private ahu(wb $$0) {
      this.b = $$0.x();
      this.c = $$0.q();
      this.d = $$0.readBoolean();
   }

   private void a(wb $$0) {
      $$0.f(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zn<ahu> a() {
      return agp.bL;
   }

   public void a(agr $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public ale e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
