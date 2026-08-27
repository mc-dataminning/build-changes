public class aek implements wo<acp> {
   private final ejv a;
   private final bja b;
   private final int c;

   public aek(bja $$0, ejv $$1, int $$2) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
   }

   public aek(ty $$0) {
      this.b = $$0.b(bja.class);
      this.a = $$0.y();
      this.c = $$0.n();
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.b);
      $$0.a(this.a);
      $$0.c(this.c);
   }

   public void a(acp $$0) {
      $$0.a(this);
   }

   public bja a() {
      return this.b;
   }

   public ejv d() {
      return this.a;
   }

   public int e() {
      return this.c;
   }
}
