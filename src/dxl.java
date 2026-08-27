import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class dxl extends dvi {
   public static final Codec<dxl> d = a(dxl::new);

   public dxl(dvi.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvi.b> a(dvi.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (hg<cqt> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(aps.W)) {
            return Optional.empty();
         }
      }

      return a($$0, dks.a.c, $$1x -> a($$1x, $$0));
   }

   private static dvm a(cpc $$0, dlr $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      hc $$4 = hc.c.a.a($$1);
      return new dxk.h($$1, $$2, $$3, $$4);
   }

   private static void a(dwa $$0, dvi.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static dvx a(cpc $$0, long $$1, dvx $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dlr $$3 = new dlr(new dkt(dlh.a()));
         $$3.c($$1, $$0.e, $$0.f);
         dvm $$4 = $$2.c().get(0);
         dva $$5 = $$4.f();
         int $$6 = $$5.g();
         int $$7 = $$5.i();
         hc $$8 = hc.c.a.a($$3);
         hc $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         dvm $$10 = new dxk.h($$3, $$6, $$7, $$9);
         dwa $$11 = new dwa();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public dvr<?> e() {
      return dvr.j;
   }
}
