import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fbi extends fbm {
   private static final ets i = new ets(
      new aer("recipe_book/furnace_filter_enabled"),
      new aer("recipe_book/furnace_filter_disabled"),
      new aer("recipe_book/furnace_filter_enabled_highlighted"),
      new aer("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private clx j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cfv $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(cma<?> $$0, List<cfv> $$1) {
      cix $$2 = $$0.a(this.h.r.B_());
      this.e.a($$0);
      this.e.a(clx.a($$2), $$1.get(2).f, $$1.get(2).g);
      hn<clx> $$3 = $$0.a();
      cfv $$4 = $$1.get(1);
      if ($$4.e().b()) {
         if (this.j == null) {
            this.j = clx.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.G())).map(cix::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<clx> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         clx $$7 = $$5.next();
         if (!$$7.d()) {
            cfv $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<cis> b();
}
