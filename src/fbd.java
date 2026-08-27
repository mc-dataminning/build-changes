import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fbd extends fbh {
   private static final ett i = new ett(
      new aep("recipe_book/furnace_filter_enabled"),
      new aep("recipe_book/furnace_filter_disabled"),
      new aep("recipe_book/furnace_filter_enabled_highlighted"),
      new aep("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private clw j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cfu $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(clz<?> $$0, List<cfu> $$1) {
      ciw $$2 = $$0.a(this.h.s.B_());
      this.e.a($$0);
      this.e.a(clw.a($$2), $$1.get(2).f, $$1.get(2).g);
      ho<clw> $$3 = $$0.a();
      cfu $$4 = $$1.get(1);
      if ($$4.e().b()) {
         if (this.j == null) {
            this.j = clw.a(this.b().stream().filter($$0x -> $$0x.a(this.h.s.G())).map(ciw::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<clw> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         clw $$7 = $$5.next();
         if (!$$7.d()) {
            cfu $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<cir> b();
}
