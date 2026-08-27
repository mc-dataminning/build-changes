import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fdr extends fdv {
   private static final evz i = new evz(
      new agg("recipe_book/furnace_filter_enabled"),
      new agg("recipe_book/furnace_filter_disabled"),
      new agg("recipe_book/furnace_filter_enabled_highlighted"),
      new agg("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private coc j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable chz $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(coh<?> $$0, List<chz> $$1) {
      clb $$2 = $$0.b().a(this.h.r.H_());
      this.e.a($$0);
      this.e.a(coc.a($$2), $$1.get(2).f, $$1.get(2).g);
      il<coc> $$3 = $$0.b().a();
      chz $$4 = $$1.get(1);
      if ($$4.f().b()) {
         if (this.j == null) {
            this.j = coc.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.G())).map(clb::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<coc> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         coc $$7 = $$5.next();
         if (!$$7.c()) {
            chz $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<ckw> b();
}
