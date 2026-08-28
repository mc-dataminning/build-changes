import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class frw extends fsa {
   private static final fjz i = new fjz(
      akr.b("recipe_book/furnace_filter_enabled"),
      akr.b("recipe_book/furnace_filter_disabled"),
      akr.b("recipe_book/furnace_filter_enabled_highlighted"),
      akr.b("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cyw j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable crq $$0) {
      super.a($$0);
      if ($$0 != null && $$0.d < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(czb<?> $$0, List<crq> $$1) {
      cuq $$2 = $$0.b().a(this.h.r.H_());
      this.e.a($$0);
      this.e.a(cyw.a($$2), $$1.get(2).e, $$1.get(2).f);
      jv<cyw> $$3 = $$0.b().a();
      crq $$4 = $$1.get(1);
      if ($$4.g().e()) {
         if (this.j == null) {
            this.j = cyw.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.J())).map(cuq::new));
         }

         this.e.a(this.j, $$4.e, $$4.f);
      }

      Iterator<cyw> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cyw $$7 = $$5.next();
         if (!$$7.c()) {
            crq $$8 = $$1.get($$6);
            this.e.a($$7, $$8.e, $$8.f);
         }
      }
   }

   protected abstract Set<cul> b();
}
