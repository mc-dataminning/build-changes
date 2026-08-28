public class fir extends hky {
   private static final wo a = wo.c("mco.client.incompatible.title").b(-65536);
   private static final wo b = wo.b(ab.b().c()).b(-65536);
   private static final wo c = wo.a("mco.client.unsupported.snapshot.version", b);
   private static final wo C = wo.a("mco.client.outdated.stable.version", b);
   private final fui D;
   private final fse E = new fse(this);

   public fir(fui $$0) {
      super(a);
      this.D = $$0;
   }

   @Override
   public void aR_() {
      this.E.a(a, this.p);
      this.E.c(new fpk(this.E(), this.p).b(true));
      this.E.b(fop.a(wn.k, $$0 -> this.aO_()).a(200).a());
      this.E.a($$1 -> {
         fon var10000 = this.c($$1);
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

   private wo E() {
      return ab.b().g() ? C : c;
   }
}
