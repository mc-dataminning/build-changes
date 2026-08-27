import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fee extends fei {
   private static final ewm i = new ewm(
      new agi("recipe_book/furnace_filter_enabled"),
      new agi("recipe_book/furnace_filter_disabled"),
      new agi("recipe_book/furnace_filter_enabled_highlighted"),
      new agi("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cok j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cih $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(coq<?> $$0, List<cih> $$1) {
      clj $$2 = $$0.b().a(this.h.r.H_());
      this.e.a($$0);
      this.e.a(cok.a($$2), $$1.get(2).f, $$1.get(2).g);
      il<cok> $$3 = $$0.b().a();
      cih $$4 = $$1.get(1);
      if ($$4.f().b()) {
         if (this.j == null) {
            this.j = cok.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.H())).map(clj::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<cok> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cok $$7 = $$5.next();
         if (!$$7.c()) {
            cih $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<cle> b();
}
