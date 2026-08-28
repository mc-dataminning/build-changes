import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class ela extends eiq {
   public static final MapCodec<ela> d = a(ela::new);

   public ela(eiq.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eiq.b> a(eiq.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jj<ddd> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(avt.X)) {
            return Optional.empty();
         }
      }

      return a($$0, dxz.a.c, $$1x -> a($$1x, $$0));
   }

   private static eiu a(dbk $$0, dyy $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      jf $$4 = jf.c.a.a($$1);
      return new ekz.h($$1, $$2, $$3, $$4);
   }

   private static void a(eji $$0, eiq.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static ejf a(dbk $$0, long $$1, ejf $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dyy $$3 = new dyy(new dya(dyo.a()));
         $$3.c($$1, $$0.e, $$0.f);
         eiu $$4 = $$2.c().get(0);
         eii $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         jf $$8 = jf.c.a.a($$3);
         jf $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         eiu $$10 = new ekz.h($$3, $$6, $$7, $$9);
         eji $$11 = new eji();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public eiz<?> e() {
      return eiz.j;
   }
}
