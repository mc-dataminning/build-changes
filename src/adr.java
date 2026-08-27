public class adr implements wk<acl> {
   private final cia a;
   private final boolean b;
   private final boolean c;

   public adr(cia $$0, boolean $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public adr(tu $$0) {
      this.a = $$0.b(cia.class);
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(acl $$0) {
      $$0.a(this);
   }

   public cia a() {
      return this.a;
   }

   public boolean d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
