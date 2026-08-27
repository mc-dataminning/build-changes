public class aec implements wu<acw> {
   private final ciy a;
   private final boolean b;
   private final boolean c;

   public aec(ciy $$0, boolean $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aec(ue $$0) {
      this.a = $$0.b(ciy.class);
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(acw $$0) {
      $$0.a(this);
   }

   public ciy a() {
      return this.a;
   }

   public boolean d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
