import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class eby extends dzo {
   public static final Codec<eby> d = a(eby::new);

   public eby(dzo.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dzo.b> a(dzo.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (ih<cuw> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(ash.X)) {
            return Optional.empty();
         }
      }

      return a($$0, doy.a.c, $$1x -> a($$1x, $$0));
   }

   private static dzs a(cte $$0, dpx $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      ic $$4 = ic.c.a.a($$1);
      return new ebx.h($$1, $$2, $$3, $$4);
   }

   private static void a(eag $$0, dzo.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static ead a(cte $$0, long $$1, ead $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dpx $$3 = new dpx(new doz(dpn.a()));
         $$3.c($$1, $$0.e, $$0.f);
         dzs $$4 = $$2.c().get(0);
         dzg $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         ic $$8 = ic.c.a.a($$3);
         ic $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         dzs $$10 = new ebx.h($$3, $$6, $$7, $$9);
         eag $$11 = new eag();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public dzx<?> e() {
      return dzx.j;
   }
}
