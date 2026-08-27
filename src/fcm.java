import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fcm extends fcq {
   private static final euw i = new euw(
      new afw("recipe_book/furnace_filter_enabled"),
      new afw("recipe_book/furnace_filter_disabled"),
      new afw("recipe_book/furnace_filter_enabled_highlighted"),
      new afw("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cnk j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable chh $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(cno<?> $$0, List<chh> $$1) {
      ckj $$2 = $$0.b().a(this.h.r.H_());
      this.e.a($$0);
      this.e.a(cnk.a($$2), $$1.get(2).f, $$1.get(2).g);
      il<cnk> $$3 = $$0.b().a();
      chh $$4 = $$1.get(1);
      if ($$4.e().b()) {
         if (this.j == null) {
            this.j = cnk.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.G())).map(ckj::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<cnk> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cnk $$7 = $$5.next();
         if (!$$7.c()) {
            chh $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<cke> b();
}
