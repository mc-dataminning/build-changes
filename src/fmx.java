import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fmx extends fnb {
   private static final ffc i = new ffc(
      new ajt("recipe_book/furnace_filter_enabled"),
      new ajt("recipe_book/furnace_filter_disabled"),
      new ajt("recipe_book/furnace_filter_enabled_highlighted"),
      new ajt("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cvg j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cok $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(cvl<?> $$0, List<cok> $$1) {
      crj $$2 = $$0.b().a(this.h.r.H_());
      this.e.a($$0);
      this.e.a(cvg.a($$2), $$1.get(2).f, $$1.get(2).g);
      iu<cvg> $$3 = $$0.b().a();
      cok $$4 = $$1.get(1);
      if ($$4.g().d()) {
         if (this.j == null) {
            this.j = cvg.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.J())).map(crj::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<cvg> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cvg $$7 = $$5.next();
         if (!$$7.c()) {
            cok $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<cre> b();
}
