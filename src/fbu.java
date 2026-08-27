import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fbu extends fby {
   private static final eue i = new eue(
      new aey("recipe_book/furnace_filter_enabled"),
      new aey("recipe_book/furnace_filter_disabled"),
      new aey("recipe_book/furnace_filter_enabled_highlighted"),
      new aey("recipe_book/furnace_filter_disabled_highlighted")
   );
   @Nullable
   private cmi j;

   @Override
   protected void a() {
      this.f.a(i);
   }

   @Override
   public void a(@Nullable cgf $$0) {
      super.a($$0);
      if ($$0 != null && $$0.e < this.g.p()) {
         this.e.a();
      }
   }

   @Override
   public void a(cmm<?> $$0, List<cgf> $$1) {
      cjh $$2 = $$0.b().a(this.h.r.G_());
      this.e.a($$0);
      this.e.a(cmi.a($$2), $$1.get(2).f, $$1.get(2).g);
      hp<cmi> $$3 = $$0.b().a();
      cgf $$4 = $$1.get(1);
      if ($$4.e().b()) {
         if (this.j == null) {
            this.j = cmi.a(this.b().stream().filter($$0x -> $$0x.a(this.h.r.G())).map(cjh::new));
         }

         this.e.a(this.j, $$4.f, $$4.g);
      }

      Iterator<cmi> $$5 = $$3.iterator();

      for (int $$6 = 0; $$6 < 2; $$6++) {
         if (!$$5.hasNext()) {
            return;
         }

         cmi $$7 = $$5.next();
         if (!$$7.c()) {
            cgf $$8 = $$1.get($$6);
            this.e.a($$7, $$8.f, $$8.g);
         }
      }
   }

   protected abstract Set<cjc> b();
}
