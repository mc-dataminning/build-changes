import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fej extends fen {
   private static final ewr i = new ewr(
      new agm("recipe_book/furnace_filter_enabled"),
      new agm("recipe_book/furnace_filter_disabled"),
      new agm("recipe_book/furnace_filter_enabled_highlighted"),
      new agm("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private coq j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cim $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(cov<?> $$0, List<cim> $$1) {
      clo $$2 = $$0.b().a(this.h.r.I_());
      this.e.a($$0);
      this.e.a(coq.a($$2), $$1.get(2).f, $$1.get(2).g);
      ip<coq> $$3 = $$0.b().a();
      cim $$4 = $$1.get(1);
      if ($$4.f().b()) {
         if (this.j == null) {
            this.j = coq.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.H())).map(clo::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<coq> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         coq $$7 = $$5.next();
         if (!$$7.c()) {
            cim $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<clj> b();
}
