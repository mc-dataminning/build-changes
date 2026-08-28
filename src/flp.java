public class flp extends hol {
   private static final ww a = ww.c("mco.client.incompatible.title").b(-65536);
   private static final ww b = ww.b(ab.b().c()).b(-65536);
   private static final ww c = ww.a("mco.client.unsupported.snapshot.version", b);
   private static final ww C = ww.a("mco.client.outdated.stable.version", b);
   private final fxi D;
   private final fve E = new fve(this);

   public flp(fxi $$0) {
      super(a);
      this.D = $$0;
   }

   @Override
   public void aN_() {
      this.E.a(a, this.p);
      this.E.c(new fsk(this.E(), this.p).b(true));
      this.E.b(frq.a(wv.k, $$0 -> this.aK_()).a(200).a());
      this.E.a($$1 -> {
         fro var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.E.a();
   }

   @Override
   public void aK_() {
      this.m.a(this.D);
   }

   private ww E() {
      return ab.b().g() ? C : c;
   }
}
