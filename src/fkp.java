import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fkp extends fkt {
   private static final fct i = new fct(
      new ajh("recipe_book/furnace_filter_enabled"),
      new ajh("recipe_book/furnace_filter_disabled"),
      new ajh("recipe_book/furnace_filter_enabled_highlighted"),
      new ajh("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private ctk j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cnj $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(ctp<?> $$0, List<cnj> $$1) {
      cqk $$2 = $$0.b().a(this.h.r.H_());
      this.e.a($$0);
      this.e.a(ctk.a($$2), $$1.get(2).f, $$1.get(2).g);
      iu<ctk> $$3 = $$0.b().a();
      cnj $$4 = $$1.get(1);
      if ($$4.g().b()) {
         if (this.j == null) {
            this.j = ctk.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.I())).map(cqk::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<ctk> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         ctk $$7 = $$5.next();
         if (!$$7.c()) {
            cnj $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<cqf> b();
}
