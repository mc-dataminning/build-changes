import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fpi extends fpm {
   private static final fhm i = new fhm(
      new akm("recipe_book/furnace_filter_enabled"),
      new akm("recipe_book/furnace_filter_disabled"),
      new akm("recipe_book/furnace_filter_enabled_highlighted"),
      new akm("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cxr j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cqo $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(cxw<?> $$0, List<cqo> $$1) {
      cto $$2 = $$0.b().a(this.h.r.H_());
      this.e.a($$0);
      this.e.a(cxr.a($$2), $$1.get(2).f, $$1.get(2).g);
      jg<cxr> $$3 = $$0.b().a();
      cqo $$4 = $$1.get(1);
      if ($$4.g().e()) {
         if (this.j == null) {
            this.j = cxr.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.J())).map(cto::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<cxr> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cxr $$7 = $$5.next();
         if (!$$7.c()) {
            cqo $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<ctj> b();
}
