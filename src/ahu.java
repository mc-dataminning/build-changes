public class ahu implements zj<agt> {
   public static final za<vy, ahu> a = zj.a(ahu::a, ahu::new);
   private final boolean b;
   private final boolean c;

   public ahu(boolean $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ahu(vy $$0) {
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   private void a(vy $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(agt $$0) {
      $$0.a(this);
   }

   @Override
   public zl<ahu> a() {
      return agr.bN;
   }

   public boolean b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
