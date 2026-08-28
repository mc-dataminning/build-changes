import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class ett extends eri {
   public static final MapCodec<ett> d = a(ett::new);

   public ett(eri.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eri.b> a(eri.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jf<dkk> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(axb.X)) {
            return Optional.empty();
         }
      }

      return a($$0, egn.a.c, $$1x -> a($$1x, $$0));
   }

   private static erm a(dio $$0, ehm $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      jb $$4 = jb.c.a.a($$1);
      return new ets.h($$1, $$2, $$3, $$4);
   }

   private static void a(esa $$0, eri.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static erx a(dio $$0, long $$1, erx $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         ehm $$3 = new ehm(new ego(ehc.a()));
         $$3.c($$1, $$0.h, $$0.i);
         erm $$4 = $$2.c().get(0);
         era $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         jb $$8 = jb.c.a.a($$3);
         jb $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         erm $$10 = new ets.h($$3, $$6, $$7, $$9);
         esa $$11 = new esa();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public err<?> e() {
      return err.j;
   }
}
