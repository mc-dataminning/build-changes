public class afe implements xf<adj> {
   private final elo a;
   private final bjz b;
   private final int c;

   public afe(bjz $$0, elo $$1, int $$2) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
   }

   public afe(ui $$0) {
      this.b = $$0.b(bjz.class);
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

   public bjz a() {
      return this.b;
   }

   public elo d() {
      return this.a;
   }

   public int e() {
      return this.c;
   }
}
