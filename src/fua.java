import java.util.List;
import java.util.Optional;
import java.util.SequencedSet;
import javax.annotation.Nullable;

public class fua extends fud<crb> {
   private static final fmb h = new fmb(
      ale.b("recipe_book/furnace_filter_enabled"),
      ale.b("recipe_book/furnace_filter_disabled"),
      ale.b("recipe_book/furnace_filter_enabled_highlighted"),
      ale.b("recipe_book/furnace_filter_disabled_highlighted")
   );
   private final xe i;
   @Nullable
   private List<cvs> j;

   public fua(crb $$0, xe $$1) {
      super($$0);
      this.i = $$1;
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected boolean a(csw $$0) {
      return switch ($$0.d) {
         case 0, 1, 2 -> true;
         default -> false;
      };
   }

   @Override
   protected void a(fub $$0, dam<?> $$1) {
      gbm $$2 = this.g.s;
      cvs $$3 = $$1.b().a($$2.G_());
      csw $$4 = this.f.l();
      $$0.a($$3, $$4);
      List<Optional<daj.a>> $$5 = $$1.b().a().a();
      if (!$$5.isEmpty()) {
         $$5.getFirst().ifPresent($$1x -> {
            csw $$2x = this.f.k.get(0);
            $$0.a($$1x.a(), $$2x);
         });
      }

      csw $$6 = this.f.k.get(1);
      if ($$6.g().f()) {
         if ($$5.size() > 1) {
            $$5.get(1).ifPresent($$2x -> $$0.a($$2x.a(), $$6));
         } else {
            if (this.j == null) {
               this.j = this.a($$2.L()).stream().map(cvs::new).toList();
            }

            $$0.a(this.j, $$6);
         }
      }
   }

   private SequencedSet<cvn> a(dss $$0) {
      return $$0.a();
   }

   @Override
   protected xe b() {
      return this.i;
   }

   @Override
   protected void a(fuh $$0, coc $$1, awj $$2) {
      $$0.a($$1, 1, 1, $$2);
   }
}
