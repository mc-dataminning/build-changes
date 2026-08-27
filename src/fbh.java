import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fbh extends fbl {
   private static final ets i = new ets(
      new aer("recipe_book/furnace_filter_enabled"),
      new aer("recipe_book/furnace_filter_disabled"),
      new aer("recipe_book/furnace_filter_enabled_highlighted"),
      new aer("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cly j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cfw $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(cmb<?> $$0, List<cfw> $$1) {
      ciy $$2 = $$0.a(this.h.u.B_());
      this.e.a($$0);
      this.e.a(cly.a($$2), $$1.get(2).f, $$1.get(2).g);
      hn<cly> $$3 = $$0.a();
      cfw $$4 = $$1.get(1);
      if ($$4.e().b()) {
         if (this.j == null) {
            this.j = cly.a(this.b().stream().filter($$0x -> $$0x.a(this.h.u.G())).map(ciy::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<cly> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cly $$7 = $$5.next();
         if (!$$7.d()) {
            cfw $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<cit> b();
}
