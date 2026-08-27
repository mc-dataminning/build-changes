import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class dxf extends dvc {
   public static final Codec<dxf> d = a(dxf::new);

   public dxf(dvc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvc.b> a(dvc.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (he<cqz> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(apu.W)) {
            return Optional.empty();
         }
      }

      return a($$0, dkm.a.c, $$1x -> a($$1x, $$0));
   }

   private static dvg a(cpi $$0, dll $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      ha $$4 = ha.c.a.a($$1);
      return new dxe.h($$1, $$2, $$3, $$4);
   }

   private static void a(dvu $$0, dvc.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static dvr a(cpi $$0, long $$1, dvr $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dll $$3 = new dll(new dkn(dlb.a()));
         $$3.c($$1, $$0.e, $$0.f);
         dvg $$4 = $$2.c().get(0);
         duu $$5 = $$4.f();
         int $$6 = $$5.g();
         int $$7 = $$5.i();
         ha $$8 = ha.c.a.a($$3);
         ha $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         dvg $$10 = new dxe.h($$3, $$6, $$7, $$9);
         dvu $$11 = new dvu();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public dvl<?> e() {
      return dvl.j;
   }
}
