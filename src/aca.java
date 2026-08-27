public class aca implements uw<aav> {
   private final cfn a;
   private final boolean b;
   private final boolean c;

   public aca(cfn $$0, boolean $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aca(sh $$0) {
      this.a = $$0.b(cfn.class);
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(aav $$0) {
      $$0.a(this);
   }

   public cfn a() {
      return this.a;
   }

   public boolean d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
