import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fbn extends fbr {
   private static final etx i = new etx(
      new aeu("recipe_book/furnace_filter_enabled"),
      new aeu("recipe_book/furnace_filter_disabled"),
      new aeu("recipe_book/furnace_filter_enabled_highlighted"),
      new aeu("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cmb j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cfy $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(cmf<?> $$0, List<cfy> $$1) {
      cja $$2 = $$0.b().a(this.h.r.B_());
      this.e.a($$0);
      this.e.a(cmb.a($$2), $$1.get(2).f, $$1.get(2).g);
      hp<cmb> $$3 = $$0.b().a();
      cfy $$4 = $$1.get(1);
      if ($$4.e().b()) {
         if (this.j == null) {
            this.j = cmb.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.G())).map(cja::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<cmb> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cmb $$7 = $$5.next();
         if (!$$7.c()) {
            cfy $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<civ> b();
}
