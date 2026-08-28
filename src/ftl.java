import java.util.List;

public class ftl extends ftp<cqr> {
   private static final fln h = new fln(
      alb.b("recipe_book/filter_enabled"),
      alb.b("recipe_book/filter_disabled"),
      alb.b("recipe_book/filter_enabled_highlighted"),
      alb.b("recipe_book/filter_disabled_highlighted")
   );
   private static final xd i = xd.c("gui.recipebook.toggleRecipes.craftable");

   public ftl(cqr $$0) {
      super($$0);
   }

   @Override
   protected boolean a(csn $$0) {
      return this.f.m() == $$0 || this.f.n().contains($$0);
   }

   @Override
   protected void a(ftn $$0, czv<?> $$1) {
      cvl $$2 = $$1.b().a(this.g.s.F_());
      csn $$3 = this.f.m();
      $$0.a($$2, $$3);
      List<csn> $$4 = this.f.n();
      ako.a(this.f.o(), this.f.p(), $$1, $$1.b().a().a(), ($$2x, $$3x, $$4x, $$5) -> $$2x.ifPresent($$3xx -> {
            csn $$4xx = $$4.get($$3x);
            $$0.a($$3xx.a(), $$4xx);
         }));
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected xd b() {
      return i;
   }

   @Override
   protected void a(ftt $$0, cnu $$1, awg $$2) {
      $$0.a($$1, this.f.o(), this.f.p(), $$2);
   }
}
