import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class emz extends eko {
   public static final MapCodec<emz> d = a(emz::new);

   public emz(eko.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eko.b> a(eko.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jn<det> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(awr.X)) {
            return Optional.empty();
         }
      }

      return a($$0, dzw.a.c, $$1x -> a($$1x, $$0));
   }

   private static eks a(dcy $$0, eav $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      jj $$4 = jj.c.a.a($$1);
      return new emy.h($$1, $$2, $$3, $$4);
   }

   private static void a(elg $$0, eko.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static eld a(dcy $$0, long $$1, eld $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         eav $$3 = new eav(new dzx(eal.a()));
         $$3.c($$1, $$0.e, $$0.f);
         eks $$4 = $$2.c().get(0);
         ekg $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         jj $$8 = jj.c.a.a($$3);
         jj $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         eks $$10 = new emy.h($$3, $$6, $$7, $$9);
         elg $$11 = new elg();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public ekx<?> e() {
      return ekx.j;
   }
}
