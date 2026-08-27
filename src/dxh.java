import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dxh extends dvi {
   public static final bfm<crf.c> d = bfm.a(
      new crf.c(biu.i, 10, 2, 3), new crf.c(biu.bs, 5, 4, 4), new crf.c(biu.bl, 8, 5, 5), new crf.c(biu.aJ, 2, 5, 5), new crf.c(biu.al, 3, 4, 4)
   );
   public static final Codec<dxh> e = a(dxh::new);

   public dxh(dvi.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvi.b> a(dvi.a $$0) {
      cpc $$1 = $$0.h();
      gw $$2 = new gw($$1.d(), 64, $$1.e());
      return Optional.of(new dvi.b($$2, (Consumer<dwa>)($$1x -> a($$1x, $$0))));
   }

   private static void a(dwa $$0, dvi.a $$1) {
      dxg.q $$2 = new dxg.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<dvm> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         dvm $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public dvr<?> e() {
      return dvr.d;
   }
}
