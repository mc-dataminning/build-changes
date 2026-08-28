public class fkv extends fky {
   private static final xk b = xk.c("mco.connect.connecting");
   private final hhq c;
   private final fic d;
   private final fid e;

   public fkv(ftr $$0, fic $$1, fid $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new hhq($$0);
   }

   @Override
   public void run() {
      if (this.e.a != null) {
         this.c.a(this.d, ggx.a(this.e.a));
      } else {
         this.b();
      }
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      flz.Q().af().i();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public xk a() {
      return b;
   }
}
