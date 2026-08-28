public class ahx implements zq<agw> {
   public static final zh<wg, ahx> a = zq.a(ahx::a, ahx::new);
   private final boolean b;
   private final boolean c;

   public ahx(boolean $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ahx(wg $$0) {
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(agw $$0) {
      $$0.a(this);
   }

   @Override
   public zs<ahx> a() {
      return agu.bJ;
   }

   public boolean b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
