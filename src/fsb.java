import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fsb extends fsf {
   private static final fka i = new fka(
      new akt("recipe_book/furnace_filter_enabled"),
      new akt("recipe_book/furnace_filter_disabled"),
      new akt("recipe_book/furnace_filter_enabled_highlighted"),
      new akt("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cyv j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cre $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(czc<?> $$0, List<cre> $$1) {
      cuh $$2 = $$0.b().a(this.h.r.I_());
      this.e.a($$0);
      this.e.a(cyv.a($$2), $$1.get(2).f, $$1.get(2).g);
      jj<cyv> $$3 = $$0.b().a();
      cre $$4 = $$1.get(1);
      if ($$4.g().d()) {
         if (this.j == null) {
            this.j = cyv.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.K())).map(cuh::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<cyv> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cyv $$7 = $$5.next();
         if (!$$7.c()) {
            cre $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<cuc> b();
}
