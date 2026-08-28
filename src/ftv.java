import java.util.List;

public class ftv extends ftz<cqx> {
   private static final flx h = new flx(
      alc.b("recipe_book/filter_enabled"),
      alc.b("recipe_book/filter_disabled"),
      alc.b("recipe_book/filter_enabled_highlighted"),
      alc.b("recipe_book/filter_disabled_highlighted")
   );
   private static final xd i = xd.c("gui.recipebook.toggleRecipes.craftable");

   public ftv(cqx $$0) {
      super($$0);
   }

   @Override
   protected boolean a(cst $$0) {
      return this.f.m() == $$0 || this.f.n().contains($$0);
   }

   @Override
   protected void a(ftx $$0, daj<?> $$1) {
      cvp $$2 = $$1.b().a(this.g.s.F_());
      cst $$3 = this.f.m();
      $$0.a($$2, $$3);
      List<cst> $$4 = this.f.n();
      ako.a(this.f.o(), this.f.p(), $$1, $$1.b().a().a(), ($$2x, $$3x, $$4x, $$5) -> $$2x.ifPresent($$3xx -> {
            cst $$4xx = $$4.get($$3x);
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
   protected void a(fud $$0, cnz $$1, awh $$2) {
      $$0.a($$1, this.f.o(), this.f.p(), $$2);
   }
}
