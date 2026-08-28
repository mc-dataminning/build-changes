import java.util.List;

public class ftz extends fud<cra> {
   private static final fmb h = new fmb(
      ale.b("recipe_book/filter_enabled"),
      ale.b("recipe_book/filter_disabled"),
      ale.b("recipe_book/filter_enabled_highlighted"),
      ale.b("recipe_book/filter_disabled_highlighted")
   );
   private static final xe i = xe.c("gui.recipebook.toggleRecipes.craftable");

   public ftz(cra $$0) {
      super($$0);
   }

   @Override
   protected boolean a(csw $$0) {
      return this.f.m() == $$0 || this.f.n().contains($$0);
   }

   @Override
   protected void a(fub $$0, dam<?> $$1) {
      cvs $$2 = $$1.b().a(this.g.s.G_());
      csw $$3 = this.f.m();
      $$0.a($$2, $$3);
      List<csw> $$4 = this.f.n();
      akp.a(this.f.o(), this.f.p(), $$1, $$1.b().a().a(), ($$2x, $$3x, $$4x, $$5) -> $$2x.ifPresent($$3xx -> {
            csw $$4xx = $$4.get($$3x);
            $$0.a($$3xx.a(), $$4xx);
         }));
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected xe b() {
      return i;
   }

   @Override
   protected void a(fuh $$0, coc $$1, awj $$2) {
      $$0.a($$1, this.f.o(), this.f.p(), $$2);
   }
}
