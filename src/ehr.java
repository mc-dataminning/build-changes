import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class ehr extends efh {
   public static final Codec<ehr> d = a(ehr::new);

   public ehr(efh.c $$0) {
      super($$0);
   }

   @Override
   public Optional<efh.b> a(efh.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (il<czw> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(avb.X)) {
            return Optional.empty();
         }
      }

      return a($$0, dur.a.c, $$1x -> a($$1x, $$0));
   }

   private static efl a(cye $$0, dvq $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      ih $$4 = ih.c.a.a($$1);
      return new ehq.h($$1, $$2, $$3, $$4);
   }

   private static void a(efz $$0, efh.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static efw a(cye $$0, long $$1, efw $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dvq $$3 = new dvq(new dus(dvg.a()));
         $$3.c($$1, $$0.e, $$0.f);
         efl $$4 = $$2.c().get(0);
         eez $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         ih $$8 = ih.c.a.a($$3);
         ih $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         efl $$10 = new ehq.h($$3, $$6, $$7, $$9);
         efz $$11 = new efz();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public efq<?> e() {
      return efq.j;
   }
}
