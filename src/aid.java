public class aid implements zj<agt> {
   public static final za<vy, aid> a = zj.a(aid::a, aid::new);
   private final cxi b;
   private final boolean c;
   private final boolean d;

   public aid(cxi $$0, boolean $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aid(vy $$0) {
      this.b = $$0.b(cxi.class);
      this.c = $$0.readBoolean();
      this.d = $$0.readBoolean();
   }

   private void a(vy $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zl<aid> a() {
      return agr.bW;
   }

   public void a(agt $$0) {
      $$0.a(this);
   }

   public cxi b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
