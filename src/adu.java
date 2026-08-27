public class adu implements wb<aca> {
   private final eib a;
   private final bia b;
   private final int c;

   public adu(bia $$0, eib $$1, int $$2) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
   }

   public adu(tl $$0) {
      this.b = $$0.b(bia.class);
      this.a = $$0.y();
      this.c = $$0.n();
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.b);
      $$0.a(this.a);
      $$0.c(this.c);
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public bia a() {
      return this.b;
   }

   public eib d() {
      return this.a;
   }

   public int e() {
      return this.c;
   }
}
