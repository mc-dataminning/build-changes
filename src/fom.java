import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fom extends foq {
   private static final fgr i = new fgr(
      new akh("recipe_book/furnace_filter_enabled"),
      new akh("recipe_book/furnace_filter_disabled"),
      new akh("recipe_book/furnace_filter_enabled_highlighted"),
      new akh("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cxa j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cpz $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(cxf<?> $$0, List<cpz> $$1) {
      csz $$2 = $$0.b().a(this.h.r.H_());
      this.e.a($$0);
      this.e.a(cxa.a($$2), $$1.get(2).f, $$1.get(2).g);
      jf<cxa> $$3 = $$0.b().a();
      cpz $$4 = $$1.get(1);
      if ($$4.g().d()) {
         if (this.j == null) {
            this.j = cxa.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.J())).map(csz::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<cxa> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cxa $$7 = $$5.next();
         if (!$$7.c()) {
            cpz $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<csu> b();
}
