public class afy implements yb<aez> {
   public static final xs<uu, afy> a = yb.a(afy::a, afy::new);
   private final boolean b;
   private final boolean c;

   public afy(boolean $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private afy(uu $$0) {
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   private void a(uu $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(aez $$0) {
      $$0.a(this);
   }

   @Override
   public yd<afy> a() {
      return aex.bE;
   }

   public boolean b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
