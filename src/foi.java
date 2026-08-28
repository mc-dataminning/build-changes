public class foi extends fol {
   private static final wy b = wy.c("mco.connect.connecting");
   private final hpu c;
   private final flp d;
   private final flq e;

   public foi(fyn $$0, flp $$1, flq $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new hpu($$0);
   }

   @Override
   public void run() {
      if (this.e.a != null) {
         this.c.a(this.d, gmd.a(this.e.a));
      } else {
         this.b();
      }
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      fpo.Q().af().i();
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
