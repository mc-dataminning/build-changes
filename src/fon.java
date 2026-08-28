public class fon extends foq {
   private static final wy b = wy.c("mco.connect.connecting");
   private final hqb c;
   private final flu d;
   private final flv e;

   public fon(fys $$0, flu $$1, flv $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new hqb($$0);
   }

   @Override
   public void run() {
      if (this.e.a != null) {
         this.c.a(this.d, gmi.a(this.e.a));
      } else {
         this.b();
      }
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      fpt.Q().af().i();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public wy a() {
      return b;
   }
}
