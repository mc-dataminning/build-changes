import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class erm extends erv {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<jm<dab>> c = lp.f.r().listOf().xmap(jm::a, $$0 -> $$0.a().toList());
   public static final MapCodec<erm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(c.optionalFieldOf("enchantments").forGetter($$0x -> $$0x.d)).apply($$0, erm::new)
   );
   private final Optional<jm<dab>> d;

   erm(List<ett> $$0, Optional<jm<dab>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public erx<erm> b() {
      return ery.h;
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      azh $$2 = $$1.b();
      Optional<ji<dab>> $$3 = this.d
         .<ji<dab>>flatMap($$1x -> $$1x.a($$2))
         .or(
            () -> {
               boolean $$3x = $$0.a(cut.qP);
               List<ji.c<dab>> $$4 = lp.f
                  .h()
                  .filter($$1xx -> ((dab)$$1xx.a()).a($$1.d().J()))
                  .filter($$0xx -> ((dab)$$0xx.a()).l())
                  .filter($$2xx -> $$3x || ((dab)$$2xx.a()).b($$0))
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

   private static cuq a(cuq $$0, dab $$1, azh $$2) {
      int $$3 = ayz.a($$2, $$1.f(), $$1.g());
      if ($$0.a(cut.qP)) {
         $$0 = new cuq(cut.uw);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static erm.a c() {
      return new erm.a();
   }

   public static erv.a<?> d() {
      return a($$0 -> new erm($$0, Optional.empty()));
   }

   public static class a extends erv.a<erm.a> {
      private final List<ji<dab>> a = new ArrayList<>();

      protected erm.a a() {
         return this;
      }

      public erm.a a(dab $$0) {
         this.a.add($$0.m());
         return this;
      }

      @Override
      public erw b() {
         return new erm(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(jm.a(this.a)));
      }
   }
}
