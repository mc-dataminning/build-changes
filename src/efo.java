import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class efo extends ede {
   public static final Codec<efo> d = a(efo::new);

   public efo(ede.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ede.b> a(ede.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (il<cya> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(aum.X)) {
            return Optional.empty();
         }
      }

      return a($$0, dso.a.c, $$1x -> a($$1x, $$0));
   }

   private static edi a(cwi $$0, dtn $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      ih $$4 = ih.c.a.a($$1);
      return new efn.h($$1, $$2, $$3, $$4);
   }

   private static void a(edw $$0, ede.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static edt a(cwi $$0, long $$1, edt $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dtn $$3 = new dtn(new dsp(dtd.a()));
         $$3.c($$1, $$0.e, $$0.f);
         edi $$4 = $$2.c().get(0);
         ecw $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         ih $$8 = ih.c.a.a($$3);
         ih $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         edi $$10 = new efn.h($$3, $$6, $$7, $$9);
         edw $$11 = new edw();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public edn<?> e() {
      return edn.j;
   }
}
