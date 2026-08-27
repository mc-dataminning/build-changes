import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fng extends fnk {
   private static final ffl i = new ffl(
      new ajv("recipe_book/furnace_filter_enabled"),
      new ajv("recipe_book/furnace_filter_disabled"),
      new ajv("recipe_book/furnace_filter_enabled_highlighted"),
      new ajv("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cvp j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cos $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(cvu<?> $$0, List<cos> $$1) {
      crs $$2 = $$0.b().a(this.h.r.H_());
      this.e.a($$0);
      this.e.a(cvp.a($$2), $$1.get(2).f, $$1.get(2).g);
      iw<cvp> $$3 = $$0.b().a();
      cos $$4 = $$1.get(1);
      if ($$4.g().d()) {
         if (this.j == null) {
            this.j = cvp.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.J())).map(crs::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<cvp> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cvp $$7 = $$5.next();
         if (!$$7.c()) {
            cos $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<crn> b();
}
