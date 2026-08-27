public class etg extends etk {
   private static final vb b = vb.c("mco.connect.connecting");
   private final gji c;
   private final eqk d;
   private final eql e;

   public etg(fcc $$0, eqk $$1, eql $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new gji($$0);
   }

   @Override
   public void run() {
      this.c.a(this.d, fof.a(this.e.a));
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      euk.N().ab().a();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public vb a() {
      return b;
   }
}
