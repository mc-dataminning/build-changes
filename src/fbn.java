import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fbn extends fbr {
   private static final etx i = new etx(
      new aez("recipe_book/furnace_filter_enabled"),
      new aez("recipe_book/furnace_filter_disabled"),
      new aez("recipe_book/furnace_filter_enabled_highlighted"),
      new aez("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cmm j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cgj $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(cmq<?> $$0, List<cgj> $$1) {
      cjl $$2 = $$0.b().a(this.h.r.G_());
      this.e.a($$0);
      this.e.a(cmm.a($$2), $$1.get(2).f, $$1.get(2).g);
      hn<cmm> $$3 = $$0.b().a();
      cgj $$4 = $$1.get(1);
      if ($$4.e().b()) {
         if (this.j == null) {
            this.j = cmm.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.G())).map(cjl::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<cmm> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cmm $$7 = $$5.next();
         if (!$$7.c()) {
            cgj $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<cjg> b();
}
