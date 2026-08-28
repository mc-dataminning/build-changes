import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;

public class dpp extends dov {
   public static final MapCodec<dpp> a = b(dpp::new);
   private static final wy b = wy.c("container.grindstone_title");
   private final Function<dzz, ffc> d;

   @Override
   public MapCodec<dpp> a() {
      return a;
   }

   protected dpp(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(e, ja.c).b(c, eak.b));
      this.d = this.b();
   }

   private Function<dzz, ffc> b() {
      ffc $$0 = fez.a(dma.a(2.0, 6.0, 7.0, 4.0, 10.0, 16.0), dma.a(2.0, 5.0, 3.0, 4.0, 11.0, 9.0));
      ffc $$1 = fez.a($$0, h.z);
      ffc $$2 = fez.a(dma.a(8.0, 2.0, 14.0, 0.0, 12.0), $$0, $$1);
      Map<eak, Map<ja, ffc>> $$3 = fez.e($$2);
      return this.a($$1x -> $$3.get($$1x.c(c)).get($$1x.c(e)));
   }

   private ffc o(dzz $$0) {
      return this.d.apply($$0);
   }

   @Override
   protected ffc b(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return this.o($$0);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return this.o($$0);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      return true;
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.aD);
      }

      return bub.a;
   }

   @Override
   protected bud b(dzz $$0, div $$1, iu $$2) {
      return new buj(($$2x, $$3, $$4) -> new cvq($$2x, $$3, cvd.a($$1, $$2)), b);
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(e, c);
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }
}
