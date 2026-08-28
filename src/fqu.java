import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fqu extends fqy {
   private static final fiz i = new fiz(
      new akk("recipe_book/furnace_filter_enabled"),
      new akk("recipe_book/furnace_filter_disabled"),
      new akk("recipe_book/furnace_filter_enabled_highlighted"),
      new akk("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cyd j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cra $$0) {
      super.a($$0);
      if ($$0 != null && $$0.d < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(cyi<?> $$0, List<cra> $$1) {
      cua $$2 = $$0.b().a(this.h.r.H_());
      this.e.a($$0);
      this.e.a(cyd.a($$2), $$1.get(2).e, $$1.get(2).f);
      js<cyd> $$3 = $$0.b().a();
      cra $$4 = $$1.get(1);
      if ($$4.g().e()) {
         if (this.j == null) {
            this.j = cyd.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.J())).map(cua::new));
         }

         this.e.a(this.j, $$4.e, $$4.f);
      }

      Iterator<cyd> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cyd $$7 = $$5.next();
         if (!$$7.c()) {
            cra $$8 = $$1.get($$6);
            this.e.a($$7, $$8.e, $$8.f);
         }
      }
   }

   protected abstract Set<ctv> b();
}
