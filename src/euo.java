import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class euo extends esd {
   public static final MapCodec<euo> d = a(euo::new);

   public euo(esd.c $$0) {
      super($$0);
   }

   @Override
   public Optional<esd.b> a(esd.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jg<dlc> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(axf.X)) {
            return Optional.empty();
         }
      }

      return a($$0, ehf.a.c, $$1x -> a($$1x, $$0));
   }

   private static esh a(dje $$0, eie $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      jc $$4 = jc.c.a.a($$1);
      return new eun.h($$1, $$2, $$3, $$4);
   }

   private static void a(esv $$0, esd.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static ess a(dje $$0, long $$1, ess $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         eie $$3 = new eie(new ehg(ehu.a()));
         $$3.c($$1, $$0.h, $$0.i);
         esh $$4 = $$2.c().get(0);
         erv $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         jc $$8 = jc.c.a.a($$3);
         jc $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         esh $$10 = new eun.h($$3, $$6, $$7, $$9);
         esv $$11 = new esv();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public esm<?> e() {
      return esm.j;
   }
}
