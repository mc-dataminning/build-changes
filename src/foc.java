import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class foc extends fog {
   private static final fgh i = new fgh(
      new akf("recipe_book/furnace_filter_enabled"),
      new akf("recipe_book/furnace_filter_disabled"),
      new akf("recipe_book/furnace_filter_enabled_highlighted"),
      new akf("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cwd j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cpd $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(cwi<?> $$0, List<cpd> $$1) {
      csd $$2 = $$0.b().a(this.h.r.H_());
      this.e.a($$0);
      this.e.a(cwd.a($$2), $$1.get(2).f, $$1.get(2).g);
      je<cwd> $$3 = $$0.b().a();
      cpd $$4 = $$1.get(1);
      if ($$4.g().d()) {
         if (this.j == null) {
            this.j = cwd.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.J())).map(csd::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<cwd> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cwd $$7 = $$5.next();
         if (!$$7.c()) {
            cpd $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<cry> b();
}
