public class fpy extends fqb {
   private static final xa b = xa.c("mco.connect.connecting");
   private final hrk c;
   private final fne d;
   private final fnf e;

   public fpy(gad $$0, fne $$1, fnf $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new hrk($$0);
   }

   @Override
   public void run() {
      if (this.e.a != null) {
         this.c.a(this.d, gnt.a(this.e.a));
      } else {
         this.b();
      }
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      frd.Q().af().i();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public xa a() {
      return b;
   }
}
