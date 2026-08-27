import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class eiz extends egp {
   public static final Codec<eiz> d = a(eiz::new);

   public eiz(egp.c $$0) {
      super($$0);
   }

   @Override
   public Optional<egp.b> a(egp.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (iw<dbc> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(avq.X)) {
            return Optional.empty();
         }
      }

      return a($$0, dvz.a.c, $$1x -> a($$1x, $$0));
   }

   private static egt a(czk $$0, dwy $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      is $$4 = is.c.a.a($$1);
      return new eiy.h($$1, $$2, $$3, $$4);
   }

   private static void a(ehh $$0, egp.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static ehe a(czk $$0, long $$1, ehe $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dwy $$3 = new dwy(new dwa(dwo.a()));
         $$3.c($$1, $$0.e, $$0.f);
         egt $$4 = $$2.c().get(0);
         egh $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         is $$8 = is.c.a.a($$3);
         is $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         egt $$10 = new eiy.h($$3, $$6, $$7, $$9);
         ehh $$11 = new ehh();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public egy<?> e() {
      return egy.j;
   }
}
