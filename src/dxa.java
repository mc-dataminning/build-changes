import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class dxa extends dux {
   public static final Codec<dxa> d = a(dxa::new);

   public dxa(dux.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dux.b> a(dux.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (hf<cqi> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(api.W)) {
            return Optional.empty();
         }
      }

      return a($$0, dkh.a.c, $$1x -> a($$1x, $$0));
   }

   private static dvb a(cor $$0, dlg $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      hb $$4 = hb.c.a.a($$1);
      return new dwz.h($$1, $$2, $$3, $$4);
   }

   private static void a(dvp $$0, dux.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static dvm a(cor $$0, long $$1, dvm $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dlg $$3 = new dlg(new dki(dkw.a()));
         $$3.c($$1, $$0.e, $$0.f);
         dvb $$4 = $$2.c().get(0);
         dup $$5 = $$4.f();
         int $$6 = $$5.g();
         int $$7 = $$5.i();
         hb $$8 = hb.c.a.a($$3);
         hb $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         dvb $$10 = new dwz.h($$3, $$6, $$7, $$9);
         dvp $$11 = new dvp();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public dvg<?> e() {
      return dvg.j;
   }
}
