import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class eoi extends elx {
   public static final MapCodec<eoi> d = a(eoi::new);

   public eoi(elx.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elx.b> a(elx.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jq<dgc> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(awz.X)) {
            return Optional.empty();
         }
      }

      return a($$0, ebf.a.c, $$1x -> a($$1x, $$0));
   }

   private static emb a(deh $$0, ece $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      jm $$4 = jm.c.a.a($$1);
      return new eoh.h($$1, $$2, $$3, $$4);
   }

   private static void a(emp $$0, elx.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static emm a(deh $$0, long $$1, emm $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         ece $$3 = new ece(new ebg(ebu.a()));
         $$3.c($$1, $$0.g, $$0.h);
         emb $$4 = $$2.c().get(0);
         elp $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         jm $$8 = jm.c.a.a($$3);
         jm $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         emb $$10 = new eoh.h($$3, $$6, $$7, $$9);
         emp $$11 = new emp();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public emg<?> e() {
      return emg.j;
   }
}
