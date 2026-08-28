import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class eoc extends elr {
   public static final MapCodec<eoc> d = a(eoc::new);

   public eoc(elr.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elr.b> a(elr.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jp<dfw> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(awy.X)) {
            return Optional.empty();
         }
      }

      return a($$0, eaz.a.c, $$1x -> a($$1x, $$0));
   }

   private static elv a(deb $$0, eby $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      jl $$4 = jl.c.a.a($$1);
      return new eob.h($$1, $$2, $$3, $$4);
   }

   private static void a(emj $$0, elr.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static emg a(deb $$0, long $$1, emg $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         eby $$3 = new eby(new eba(ebo.a()));
         $$3.c($$1, $$0.e, $$0.f);
         elv $$4 = $$2.c().get(0);
         elj $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         jl $$8 = jl.c.a.a($$3);
         jl $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         elv $$10 = new eob.h($$3, $$6, $$7, $$9);
         emj $$11 = new emj();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public ema<?> e() {
      return ema.j;
   }
}
