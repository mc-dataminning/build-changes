import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fkr extends fkv {
   private static final fcv i = new fcv(
      new ajh("recipe_book/furnace_filter_enabled"),
      new ajh("recipe_book/furnace_filter_disabled"),
      new ajh("recipe_book/furnace_filter_enabled_highlighted"),
      new ajh("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private ctm j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cnl $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(ctr<?> $$0, List<cnl> $$1) {
      cqm $$2 = $$0.b().a(this.h.r.H_());
      this.e.a($$0);
      this.e.a(ctm.a($$2), $$1.get(2).f, $$1.get(2).g);
      iu<ctm> $$3 = $$0.b().a();
      cnl $$4 = $$1.get(1);
      if ($$4.g().b()) {
         if (this.j == null) {
            this.j = ctm.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.I())).map(cqm::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<ctm> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         ctm $$7 = $$5.next();
         if (!$$7.c()) {
            cnl $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<cqh> b();
}
