import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fgw extends fha {
   private static final eze i = new eze(
      new ahh("recipe_book/furnace_filter_enabled"),
      new ahh("recipe_book/furnace_filter_disabled"),
      new ahh("recipe_book/furnace_filter_enabled_highlighted"),
      new ahh("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cqh j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cke $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(cqm<?> $$0, List<cke> $$1) {
      cng $$2 = $$0.b().a(this.h.r.I_());
      this.e.a($$0);
      this.e.a(cqh.a($$2), $$1.get(2).f, $$1.get(2).g);
      iq<cqh> $$3 = $$0.b().a();
      cke $$4 = $$1.get(1);
      if ($$4.g().b()) {
         if (this.j == null) {
            this.j = cqh.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.I())).map(cng::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<cqh> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cqh $$7 = $$5.next();
         if (!$$7.c()) {
            cke $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<cnb> b();
}
