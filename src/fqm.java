import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fqm extends fqq {
   private static final fir i = new fir(
      new alf("recipe_book/furnace_filter_enabled"),
      new alf("recipe_book/furnace_filter_disabled"),
      new alf("recipe_book/furnace_filter_enabled_highlighted"),
      new alf("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cys j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable crp $$0) {
      super.a($$0);
      if ($$0 != null && $$0.d < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(cyx<?> $$0, List<crp> $$1) {
      cup $$2 = $$0.b().a(this.h.r.H_());
      this.e.a($$0);
      this.e.a(cys.a($$2), $$1.get(2).e, $$1.get(2).f);
      jr<cys> $$3 = $$0.b().a();
      crp $$4 = $$1.get(1);
      if ($$4.g().e()) {
         if (this.j == null) {
            this.j = cys.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.J())).map(cup::new));
         }

         this.e.a(this.j, $$4.e, $$4.f);
      }

      Iterator<cys> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cys $$7 = $$5.next();
         if (!$$7.c()) {
            crp $$8 = $$1.get($$6);
            this.e.a($$7, $$8.e, $$8.f);
         }
      }
   }

   protected abstract Set<cuk> b();
}
