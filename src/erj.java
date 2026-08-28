import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class erj extends ers {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<jm<czy>> c = lp.f.r().listOf().xmap(jm::a, $$0 -> $$0.a().toList());
   public static final MapCodec<erj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(c.optionalFieldOf("enchantments").forGetter($$0x -> $$0x.d)).apply($$0, erj::new)
   );
   private final Optional<jm<czy>> d;

   erj(List<etq> $$0, Optional<jm<czy>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public eru<erj> b() {
      return erv.h;
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      azf $$2 = $$1.b();
      Optional<ji<czy>> $$3 = this.d
         .<ji<czy>>flatMap($$1x -> $$1x.a($$2))
         .or(
            () -> {
               boolean $$3x = $$0.a(cuq.qP);
               List<ji.c<czy>> $$4 = lp.f
                  .h()
                  .filter($$1xx -> ((czy)$$1xx.a()).a($$1.d().J()))
                  .filter($$0xx -> ((czy)$$0xx.a()).l())
                  .filter($$2xx -> $$3x || ((czy)$$2xx.a()).b($$0))
                  .toList();
               return ac.b($$4, $$2);
            }
         );
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static cun a(cun $$0, czy $$1, azf $$2) {
      int $$3 = ayx.a($$2, $$1.f(), $$1.g());
      if ($$0.a(cuq.qP)) {
         $$0 = new cun(cuq.uw);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static erj.a c() {
      return new erj.a();
   }

   public static ers.a<?> d() {
      return a($$0 -> new erj($$0, Optional.empty()));
   }

   public static class a extends ers.a<erj.a> {
      private final List<ji<czy>> a = new ArrayList<>();

      protected erj.a a() {
         return this;
      }

      public erj.a a(czy $$0) {
         this.a.add($$0.m());
         return this;
      }

      @Override
      public ert b() {
         return new erj(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(jm.a(this.a)));
      }
   }
}
