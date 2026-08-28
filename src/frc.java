import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class frc extends frg {
   private static final fjh i = new fjh(
      new akk("recipe_book/furnace_filter_enabled"),
      new akk("recipe_book/furnace_filter_disabled"),
      new akk("recipe_book/furnace_filter_enabled_highlighted"),
      new akk("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cyg j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cre $$0) {
      super.a($$0);
      if ($$0 != null && $$0.d < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(cyl<?> $$0, List<cre> $$1) {
      cud $$2 = $$0.b().a(this.h.r.H_());
      this.e.a($$0);
      this.e.a(cyg.a($$2), $$1.get(2).e, $$1.get(2).f);
      js<cyg> $$3 = $$0.b().a();
      cre $$4 = $$1.get(1);
      if ($$4.g().e()) {
         if (this.j == null) {
            this.j = cyg.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.J())).map(cud::new));
         }

         this.e.a(this.j, $$4.e, $$4.f);
      }

      Iterator<cyg> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cyg $$7 = $$5.next();
         if (!$$7.c()) {
            cre $$8 = $$1.get($$6);
            this.e.a($$7, $$8.e, $$8.f);
         }
      }
   }

   protected abstract Set<cty> b();
}
