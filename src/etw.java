public class etw extends eua {
   private static final vd b = vd.c("mco.connect.connecting");
   private final gjz c;
   private final era d;
   private final erb e;

   public etw(fct $$0, era $$1, erb $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new gjz($$0);
   }

   @Override
   public void run() {
      this.c.a(this.d, fox.a(this.e.a));
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      eva.N().ab().a();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public vd a() {
      return b;
   }
}
