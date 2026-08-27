import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fgd extends fgh {
   private static final eyl i = new eyl(
      new ahd("recipe_book/furnace_filter_enabled"),
      new ahd("recipe_book/furnace_filter_disabled"),
      new ahd("recipe_book/furnace_filter_enabled_highlighted"),
      new ahd("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cps j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cjp $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(cpx<?> $$0, List<cjp> $$1) {
      cmr $$2 = $$0.b().a(this.h.r.I_());
      this.e.a($$0);
      this.e.a(cps.a($$2), $$1.get(2).f, $$1.get(2).g);
      iq<cps> $$3 = $$0.b().a();
      cjp $$4 = $$1.get(1);
      if ($$4.g().b()) {
         if (this.j == null) {
            this.j = cps.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.I())).map(cmr::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<cps> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cps $$7 = $$5.next();
         if (!$$7.c()) {
            cjp $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<cmm> b();
}
