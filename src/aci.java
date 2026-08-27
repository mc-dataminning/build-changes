public class aci implements ve<abd> {
   private final cfw a;
   private final boolean b;
   private final boolean c;

   public aci(cfw $$0, boolean $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aci(sp $$0) {
      this.a = $$0.b(cfw.class);
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(sp $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(abd $$0) {
      $$0.a(this);
   }

   public cfw a() {
      return this.a;
   }

   public boolean d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
