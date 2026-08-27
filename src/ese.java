public class ese extends esi {
   private static final uv b = uv.c("mco.connect.connecting");
   private final ght c;
   private final epi d;
   private final epj e;

   public ese(faz $$0, epi $$1, epj $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new ght($$0);
   }

   @Override
   public void run() {
      this.c.a(this.d, fna.a(this.e.a));
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      eti.N().ab().a();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public uv a() {
      return b;
   }
}
