import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class eiq extends egg {
   public static final Codec<eiq> d = a(eiq::new);

   public eiq(egg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<egg.b> a(egg.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (iv<dat> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(avn.X)) {
            return Optional.empty();
         }
      }

      return a($$0, dvq.a.c, $$1x -> a($$1x, $$0));
   }

   private static egk a(czb $$0, dwp $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      ir $$4 = ir.c.a.a($$1);
      return new eip.h($$1, $$2, $$3, $$4);
   }

   private static void a(egy $$0, egg.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static egv a(czb $$0, long $$1, egv $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dwp $$3 = new dwp(new dvr(dwf.a()));
         $$3.c($$1, $$0.e, $$0.f);
         egk $$4 = $$2.c().get(0);
         efy $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         ir $$8 = ir.c.a.a($$3);
         ir $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         egk $$10 = new eip.h($$3, $$6, $$7, $$9);
         egy $$11 = new egy();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public egp<?> e() {
      return egp.j;
   }
}
