import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fgk extends fgo {
   private static final eys i = new eys(
      new ahg("recipe_book/furnace_filter_enabled"),
      new ahg("recipe_book/furnace_filter_disabled"),
      new ahg("recipe_book/furnace_filter_enabled_highlighted"),
      new ahg("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cpy j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cjv $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(cqd<?> $$0, List<cjv> $$1) {
      cmx $$2 = $$0.b().a(this.h.r.I_());
      this.e.a($$0);
      this.e.a(cpy.a($$2), $$1.get(2).f, $$1.get(2).g);
      iq<cpy> $$3 = $$0.b().a();
      cjv $$4 = $$1.get(1);
      if ($$4.g().b()) {
         if (this.j == null) {
            this.j = cpy.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.I())).map(cmx::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<cpy> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cpy $$7 = $$5.next();
         if (!$$7.c()) {
            cjv $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<cms> b();
}
