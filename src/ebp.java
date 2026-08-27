import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class ebp extends dzf {
   public static final Codec<ebp> d = a(ebp::new);

   public ebp(dzf.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dzf.b> a(dzf.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (ih<cun> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(asf.X)) {
            return Optional.empty();
         }
      }

      return a($$0, dop.a.c, $$1x -> a($$1x, $$0));
   }

   private static dzj a(csv $$0, dpo $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      ic $$4 = ic.c.a.a($$1);
      return new ebo.h($$1, $$2, $$3, $$4);
   }

   private static void a(dzx $$0, dzf.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static dzu a(csv $$0, long $$1, dzu $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dpo $$3 = new dpo(new doq(dpe.a()));
         $$3.c($$1, $$0.e, $$0.f);
         dzj $$4 = $$2.c().get(0);
         dyx $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         ic $$8 = ic.c.a.a($$3);
         ic $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         dzj $$10 = new ebo.h($$3, $$6, $$7, $$9);
         dzx $$11 = new dzx();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public dzo<?> e() {
      return dzo.j;
   }
}
