import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fjr extends fjv {
   private static final fbx i = new fbx(
      new ajc("recipe_book/furnace_filter_enabled"),
      new ajc("recipe_book/furnace_filter_disabled"),
      new ajc("recipe_book/furnace_filter_enabled_highlighted"),
      new ajc("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private csp j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cmp $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(csu<?> $$0, List<cmp> $$1) {
      cpq $$2 = $$0.b().a(this.h.r.I_());
      this.e.a($$0);
      this.e.a(csp.a($$2), $$1.get(2).f, $$1.get(2).g);
      iu<csp> $$3 = $$0.b().a();
      cmp $$4 = $$1.get(1);
      if ($$4.g().b()) {
         if (this.j == null) {
            this.j = csp.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.I())).map(cpq::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<csp> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         csp $$7 = $$5.next();
         if (!$$7.c()) {
            cmp $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<cpl> b();
}
