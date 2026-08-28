public class fkd extends fkg {
   private static final wp b = wp.c("mco.connect.connecting");
   private final hlb c;
   private final fhk d;
   private final fhl e;

   public fkd(fuk $$0, fhk $$1, fhl $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new hlb($$0);
   }

   @Override
   public void run() {
      if (this.e.a != null) {
         this.c.a(this.d, ghq.a(this.e.a));
      } else {
         this.b();
      }
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      fli.Q().af().i();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public wp a() {
      return b;
   }
}
