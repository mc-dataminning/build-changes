import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fpi extends fpm {
   private static final fhn i = new fhn(
      new akn("recipe_book/furnace_filter_enabled"),
      new akn("recipe_book/furnace_filter_disabled"),
      new akn("recipe_book/furnace_filter_enabled_highlighted"),
      new akn("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cxt j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cqq $$0) {
      super.a($$0);
      if ($$0 != null && $$0.d < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(cxy<?> $$0, List<cqq> $$1) {
      ctq $$2 = $$0.b().a(this.h.r.H_());
      this.e.a($$0);
      this.e.a(cxt.a($$2), $$1.get(2).e, $$1.get(2).f);
      jg<cxt> $$3 = $$0.b().a();
      cqq $$4 = $$1.get(1);
      if ($$4.g().e()) {
         if (this.j == null) {
            this.j = cxt.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.J())).map(ctq::new));
         }

         this.e.a(this.j, $$4.e, $$4.f);
      }

      Iterator<cxt> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cxt $$7 = $$5.next();
         if (!$$7.c()) {
            cqq $$8 = $$1.get($$6);
            this.e.a($$7, $$8.e, $$8.f);
         }
      }
   }

   protected abstract Set<ctl> b();
}
