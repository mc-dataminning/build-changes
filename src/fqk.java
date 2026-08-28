import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fqk extends fqo {
   private static final fip i = new fip(
      new ale("recipe_book/furnace_filter_enabled"),
      new ale("recipe_book/furnace_filter_disabled"),
      new ale("recipe_book/furnace_filter_enabled_highlighted"),
      new ale("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cyq j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable crn $$0) {
      super.a($$0);
      if ($$0 != null && $$0.d < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(cyv<?> $$0, List<crn> $$1) {
      cun $$2 = $$0.b().a(this.h.r.H_());
      this.e.a($$0);
      this.e.a(cyq.a($$2), $$1.get(2).e, $$1.get(2).f);
      jr<cyq> $$3 = $$0.b().a();
      crn $$4 = $$1.get(1);
      if ($$4.g().e()) {
         if (this.j == null) {
            this.j = cyq.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.J())).map(cun::new));
         }

         this.e.a(this.j, $$4.e, $$4.f);
      }

      Iterator<cyq> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cyq $$7 = $$5.next();
         if (!$$7.c()) {
            crn $$8 = $$1.get($$6);
            this.e.a($$7, $$8.e, $$8.f);
         }
      }
   }

   protected abstract Set<cui> b();
}
