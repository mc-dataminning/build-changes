import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fbs extends fbw {
   private static final euc i = new euc(
      new aex("recipe_book/furnace_filter_enabled"),
      new aex("recipe_book/furnace_filter_disabled"),
      new aex("recipe_book/furnace_filter_enabled_highlighted"),
      new aex("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cmg j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cgd $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(cmk<?> $$0, List<cgd> $$1) {
      cjf $$2 = $$0.b().a(this.h.r.G_());
      this.e.a($$0);
      this.e.a(cmg.a($$2), $$1.get(2).f, $$1.get(2).g);
      hp<cmg> $$3 = $$0.b().a();
      cgd $$4 = $$1.get(1);
      if ($$4.e().b()) {
         if (this.j == null) {
            this.j = cmg.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.G())).map(cjf::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<cmg> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cmg $$7 = $$5.next();
         if (!$$7.c()) {
            cgd $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<cja> b();
}
