import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class frq extends fru {
   private static final fjt i = new fjt(
      akq.b("recipe_book/furnace_filter_enabled"),
      akq.b("recipe_book/furnace_filter_disabled"),
      akq.b("recipe_book/furnace_filter_enabled_highlighted"),
      akq.b("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cyu j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cro $$0) {
      super.a($$0);
      if ($$0 != null && $$0.d < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(cyz<?> $$0, List<cro> $$1) {
      cuo $$2 = $$0.b().a(this.h.r.H_());
      this.e.a($$0);
      this.e.a(cyu.a($$2), $$1.get(2).e, $$1.get(2).f);
      jv<cyu> $$3 = $$0.b().a();
      cro $$4 = $$1.get(1);
      if ($$4.g().e()) {
         if (this.j == null) {
            this.j = cyu.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.J())).map(cuo::new));
         }

         this.e.a(this.j, $$4.e, $$4.f);
      }

      Iterator<cyu> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cyu $$7 = $$5.next();
         if (!$$7.c()) {
            cro $$8 = $$1.get($$6);
            this.e.a($$7, $$8.e, $$8.f);
         }
      }
   }

   protected abstract Set<cuj> b();
}
