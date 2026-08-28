import java.util.List;
import java.util.Optional;
import java.util.SequencedSet;
import javax.annotation.Nullable;

public class ftm extends ftp<cqs> {
   private static final fln h = new fln(
      alb.b("recipe_book/furnace_filter_enabled"),
      alb.b("recipe_book/furnace_filter_disabled"),
      alb.b("recipe_book/furnace_filter_enabled_highlighted"),
      alb.b("recipe_book/furnace_filter_disabled_highlighted")
   );
   private final xd i;
   @Nullable
   private List<cvl> j;

   public ftm(cqs $$0, xd $$1) {
      super($$0);
      this.i = $$1;
   }

   @Override
   protected void a() {
      this.e.a(h);
   }

   @Override
   protected boolean a(csn $$0) {
      return switch ($$0.d) {
         case 0, 1, 2 -> true;
         default -> false;
      };
   }

   @Override
   protected void a(ftn $$0, czv<?> $$1) {
      gax $$2 = this.g.s;
      cvl $$3 = $$1.b().a($$2.F_());
      csn $$4 = this.f.l();
      $$0.a($$3, $$4);
      List<Optional<czs.a>> $$5 = $$1.b().a().a();
      if (!$$5.isEmpty()) {
         $$5.getFirst().ifPresent($$1x -> {
            csn $$2x = this.f.k.get(0);
            $$0.a($$1x.a(), $$2x);
         });
      }

      csn $$6 = this.f.k.get(1);
      if ($$6.g().f()) {
         if ($$5.size() > 1) {
            $$5.get(1).ifPresent($$2x -> $$0.a($$2x.a(), $$6));
         } else {
            if (this.j == null) {
               this.j = this.a($$2.L()).stream().map(cvl::new).toList();
            }

            $$0.a(this.j, $$6);
         }
      }
   }

   private SequencedSet<cvg> a(dsb $$0) {
      return $$0.a();
   }

   @Override
   protected xd b() {
      return this.i;
   }

   @Override
   protected void a(ftt $$0, cnu $$1, awg $$2) {
      $$0.a($$1, 1, 1, $$2);
   }
}
