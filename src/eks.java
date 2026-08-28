import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class eks extends eii {
   public static final MapCodec<eks> d = a(eks::new);

   public eks(eii.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eii.b> a(eii.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (ji<dcv> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(awn.X)) {
            return Optional.empty();
         }
      }

      return a($$0, dxs.a.c, $$1x -> a($$1x, $$0));
   }

   private static eim a(dbd $$0, dyr $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      je $$4 = je.c.a.a($$1);
      return new ekr.h($$1, $$2, $$3, $$4);
   }

   private static void a(eja $$0, eii.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static eix a(dbd $$0, long $$1, eix $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dyr $$3 = new dyr(new dxt(dyh.a()));
         $$3.c($$1, $$0.e, $$0.f);
         eim $$4 = $$2.c().get(0);
         eia $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         je $$8 = je.c.a.a($$3);
         je $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         eim $$10 = new ekr.h($$3, $$6, $$7, $$9);
         eja $$11 = new eja();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public eir<?> e() {
      return eir.j;
   }
}
