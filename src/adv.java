public class adv implements wo<acp> {
   private final cif a;
   private final boolean b;
   private final boolean c;

   public adv(cif $$0, boolean $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public adv(ty $$0) {
      this.a = $$0.b(cif.class);
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(acp $$0) {
      $$0.a(this);
   }

   public cif a() {
      return this.a;
   }

   public boolean d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
