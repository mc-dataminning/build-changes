public class fna extends fnd {
   private static final ww b = ww.c("mco.connect.connecting");
   private final hoj c;
   private final fkh d;
   private final fki e;

   public fna(fxi $$0, fkh $$1, fki $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new hoj($$0);
   }

   @Override
   public void run() {
      if (this.e.a != null) {
         this.c.a(this.d, gkv.a(this.e.a));
      } else {
         this.b();
      }
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      fof.Q().af().i();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public ww a() {
      return b;
   }
}
