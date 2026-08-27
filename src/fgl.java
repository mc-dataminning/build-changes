import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fgl extends fgp {
   private static final eyt i = new eyt(
      new ahg("recipe_book/furnace_filter_enabled"),
      new ahg("recipe_book/furnace_filter_disabled"),
      new ahg("recipe_book/furnace_filter_enabled_highlighted"),
      new ahg("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cpz j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cjw $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(cqe<?> $$0, List<cjw> $$1) {
      cmy $$2 = $$0.b().a(this.h.r.I_());
      this.e.a($$0);
      this.e.a(cpz.a($$2), $$1.get(2).f, $$1.get(2).g);
      iq<cpz> $$3 = $$0.b().a();
      cjw $$4 = $$1.get(1);
      if ($$4.g().b()) {
         if (this.j == null) {
            this.j = cpz.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.I())).map(cmy::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<cpz> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cpz $$7 = $$5.next();
         if (!$$7.c()) {
            cjw $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<cmt> b();
}
