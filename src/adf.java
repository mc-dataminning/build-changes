public class adf implements wb<aca> {
   private final cha a;
   private final boolean b;
   private final boolean c;

   public adf(cha $$0, boolean $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public adf(tl $$0) {
      this.a = $$0.b(cha.class);
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public cha a() {
      return this.a;
   }

   public boolean d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
