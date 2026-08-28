import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fqh extends fql {
   private static final fim i = new fim(
      new alb("recipe_book/furnace_filter_enabled"),
      new alb("recipe_book/furnace_filter_disabled"),
      new alb("recipe_book/furnace_filter_enabled_highlighted"),
      new alb("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cyn j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable crk $$0) {
      super.a($$0);
      if ($$0 != null && $$0.d < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(cys<?> $$0, List<crk> $$1) {
      cuk $$2 = $$0.b().a(this.h.r.H_());
      this.e.a($$0);
      this.e.a(cyn.a($$2), $$1.get(2).e, $$1.get(2).f);
      jr<cyn> $$3 = $$0.b().a();
      crk $$4 = $$1.get(1);
      if ($$4.g().e()) {
         if (this.j == null) {
            this.j = cyn.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.J())).map(cuk::new));
         }

         this.e.a(this.j, $$4.e, $$4.f);
      }

      Iterator<cyn> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cyn $$7 = $$5.next();
         if (!$$7.c()) {
            crk $$8 = $$1.get($$6);
            this.e.a($$7, $$8.e, $$8.f);
         }
      }
   }

   protected abstract Set<cuf> b();
}
