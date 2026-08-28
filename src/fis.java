public class fis extends hld {
   private static final wp a = wp.c("mco.client.incompatible.title").b(-65536);
   private static final wp b = wp.b(ab.b().c()).b(-65536);
   private static final wp c = wp.a("mco.client.unsupported.snapshot.version", b);
   private static final wp C = wp.a("mco.client.outdated.stable.version", b);
   private final fuk D;
   private final fsg E = new fsg(this);

   public fis(fuk $$0) {
      super(a);
      this.D = $$0;
   }

   @Override
   public void aR_() {
      this.E.a(a, this.p);
      this.E.c(new fpm(this.E(), this.p).b(true));
      this.E.b(fos.a(wo.k, $$0 -> this.aO_()).a(200).a());
      this.E.a($$1 -> {
         fop var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.E.a();
   }

   @Override
   public void aO_() {
      this.m.a(this.D);
   }

   private wp E() {
      return ab.b().g() ? C : c;
   }
}
