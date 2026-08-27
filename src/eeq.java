import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class eeq extends ecg {
   public static final Codec<eeq> d = a(eeq::new);

   public eeq(ecg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ecg.b> a(ecg.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (il<cxd> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(aud.X)) {
            return Optional.empty();
         }
      }

      return a($$0, drq.a.c, $$1x -> a($$1x, $$0));
   }

   private static eck a(cvl $$0, dsp $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      ih $$4 = ih.c.a.a($$1);
      return new eep.h($$1, $$2, $$3, $$4);
   }

   private static void a(ecy $$0, ecg.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static ecv a(cvl $$0, long $$1, ecv $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dsp $$3 = new dsp(new drr(dsf.a()));
         $$3.c($$1, $$0.e, $$0.f);
         eck $$4 = $$2.c().get(0);
         eby $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         ih $$8 = ih.c.a.a($$3);
         ih $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         eck $$10 = new eep.h($$3, $$6, $$7, $$9);
         ecy $$11 = new ecy();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public ecp<?> e() {
      return ecp.j;
   }
}
