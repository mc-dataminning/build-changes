public class ahs implements zl<agr> {
   public static final zc<wb, ahs> a = zl.a(ahs::a, ahs::new);
   private final boolean b;
   private final boolean c;

   public ahs(boolean $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ahs(wb $$0) {
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   private void a(wb $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(agr $$0) {
      $$0.a(this);
   }

   @Override
   public zn<ahs> a() {
      return agp.bJ;
   }

   public boolean b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
