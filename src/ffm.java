import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class ffm extends ffq {
   private static final exu i = new exu(
      new agt("recipe_book/furnace_filter_enabled"),
      new agt("recipe_book/furnace_filter_disabled"),
      new agt("recipe_book/furnace_filter_enabled_highlighted"),
      new agt("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cpi j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cjf $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(cpn<?> $$0, List<cjf> $$1) {
      cmh $$2 = $$0.b().a(this.h.r.I_());
      this.e.a($$0);
      this.e.a(cpi.a($$2), $$1.get(2).f, $$1.get(2).g);
      io<cpi> $$3 = $$0.b().a();
      cjf $$4 = $$1.get(1);
      if ($$4.g().b()) {
         if (this.j == null) {
            this.j = cpi.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.H())).map(cmh::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<cpi> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cpi $$7 = $$5.next();
         if (!$$7.c()) {
            cjf $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<cmc> b();
}
