public class aem implements xd<adg> {
   private final cji a;
   private final boolean b;
   private final boolean c;

   public aem(cji $$0, boolean $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aem(ug $$0) {
      this.a = $$0.b(cji.class);
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(adg $$0) {
      $$0.a(this);
   }

   public cji a() {
      return this.a;
   }

   public boolean d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
