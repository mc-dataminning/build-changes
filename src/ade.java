public class ade implements wk<acj> {
   private final ht a;
   private final int b;
   private final boolean c;

   public ade(ht $$0, int $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ade(tu $$0) {
      this.a = $$0.e();
      this.b = $$0.n();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a);
      $$0.c(this.b);
      $$0.a(this.c);
   }

   public void a(acj $$0) {
      $$0.a(this);
   }

   public ht a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
