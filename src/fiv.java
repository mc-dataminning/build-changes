import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fiv extends fiz {
   private static final fbb i = new fbb(
      new aiy("recipe_book/furnace_filter_enabled"),
      new aiy("recipe_book/furnace_filter_disabled"),
      new aiy("recipe_book/furnace_filter_enabled_highlighted"),
      new aiy("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private csc j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cma $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(csh<?> $$0, List<cma> $$1) {
      cpd $$2 = $$0.b().a(this.h.r.I_());
      this.e.a($$0);
      this.e.a(csc.a($$2), $$1.get(2).f, $$1.get(2).g);
      is<csc> $$3 = $$0.b().a();
      cma $$4 = $$1.get(1);
      if ($$4.g().b()) {
         if (this.j == null) {
            this.j = csc.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.I())).map(cpd::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<csc> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         csc $$7 = $$5.next();
         if (!$$7.c()) {
            cma $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<coy> b();
}
