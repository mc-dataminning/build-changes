public class ael implements wo<acp> {
   private final bja a;
   private final int b;

   public ael(bja $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public ael(ty $$0) {
      this.a = $$0.b(bja.class);
      this.b = $$0.n();
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a);
      $$0.c(this.b);
   }

   public void a(acp $$0) {
      $$0.a(this);
   }

   public bja a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }
}
