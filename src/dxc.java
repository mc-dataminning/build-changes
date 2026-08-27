import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class dxc extends duz {
   public static final Codec<dxc> d = a(dxc::new);

   public dxc(duz.c $$0) {
      super($$0);
   }

   @Override
   public Optional<duz.b> a(duz.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (he<cqk> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(apk.W)) {
            return Optional.empty();
         }
      }

      return a($$0, dkj.a.c, $$1x -> a($$1x, $$0));
   }

   private static dvd a(cot $$0, dli $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      ha $$4 = ha.c.a.a($$1);
      return new dxb.h($$1, $$2, $$3, $$4);
   }

   private static void a(dvr $$0, duz.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static dvo a(cot $$0, long $$1, dvo $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dli $$3 = new dli(new dkk(dky.a()));
         $$3.c($$1, $$0.e, $$0.f);
         dvd $$4 = $$2.c().get(0);
         dur $$5 = $$4.f();
         int $$6 = $$5.g();
         int $$7 = $$5.i();
         ha $$8 = ha.c.a.a($$3);
         ha $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         dvd $$10 = new dxb.h($$3, $$6, $$7, $$9);
         dvr $$11 = new dvr();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public dvi<?> e() {
      return dvi.j;
   }
}
