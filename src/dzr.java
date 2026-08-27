import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class dzr extends dxh {
   public static final Codec<dzr> d = a(dzr::new);

   public dzr(dxh.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dxh.b> a(dxh.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (ib<csy> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(arf.W)) {
            return Optional.empty();
         }
      }

      return a($$0, dmr.a.c, $$1x -> a($$1x, $$0));
   }

   private static dxl a(crh $$0, dnq $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      hx $$4 = hx.c.a.a($$1);
      return new dzq.h($$1, $$2, $$3, $$4);
   }

   private static void a(dxz $$0, dxh.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static dxw a(crh $$0, long $$1, dxw $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dnq $$3 = new dnq(new dms(dng.a()));
         $$3.c($$1, $$0.e, $$0.f);
         dxl $$4 = $$2.c().get(0);
         dwz $$5 = $$4.f();
         int $$6 = $$5.g();
         int $$7 = $$5.i();
         hx $$8 = hx.c.a.a($$3);
         hx $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         dxl $$10 = new dzq.h($$3, $$6, $$7, $$9);
         dxz $$11 = new dxz();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public dxq<?> e() {
      return dxq.j;
   }
}
