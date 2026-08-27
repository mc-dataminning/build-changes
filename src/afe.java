public class afe implements xf<adj> {
   private final elp a;
   private final bka b;
   private final int c;

   public afe(bka $$0, elp $$1, int $$2) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
   }

   public afe(ui $$0) {
      this.b = $$0.b(bka.class);
      this.a = $$0.y();
      this.c = $$0.n();
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.b);
      $$0.a(this.a);
      $$0.c(this.c);
   }

   public void a(adj $$0) {
      $$0.a(this);
   }

   public bka a() {
      return this.b;
   }

   public elp d() {
      return this.a;
   }

   public int e() {
      return this.c;
   }
}
