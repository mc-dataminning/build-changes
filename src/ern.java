import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class ern extends erw {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<jm<dac>> c = lp.f.r().listOf().xmap(jm::a, $$0 -> $$0.a().toList());
   public static final MapCodec<ern> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(c.optionalFieldOf("enchantments").forGetter($$0x -> $$0x.d)).apply($$0, ern::new)
   );
   private final Optional<jm<dac>> d;

   ern(List<etu> $$0, Optional<jm<dac>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public ery<ern> b() {
      return erz.h;
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      azh $$2 = $$1.b();
      Optional<ji<dac>> $$3 = this.d
         .<ji<dac>>flatMap($$1x -> $$1x.a($$2))
         .or(
            () -> {
               boolean $$3x = $$0.a(cuu.qP);
               List<ji.c<dac>> $$4 = lp.f
                  .h()
                  .filter($$1xx -> ((dac)$$1xx.a()).a($$1.d().J()))
                  .filter($$0xx -> ((dac)$$0xx.a()).l())
                  .filter($$2xx -> $$3x || ((dac)$$2xx.a()).b($$0))
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

   private static cur a(cur $$0, dac $$1, azh $$2) {
      int $$3 = ayz.a($$2, $$1.f(), $$1.g());
      if ($$0.a(cuu.qP)) {
         $$0 = new cur(cuu.uw);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static ern.a c() {
      return new ern.a();
   }

   public static erw.a<?> d() {
      return a($$0 -> new ern($$0, Optional.empty()));
   }

   public static class a extends erw.a<ern.a> {
      private final List<ji<dac>> a = new ArrayList<>();

      protected ern.a a() {
         return this;
      }

      public ern.a a(dac $$0) {
         this.a.add($$0.m());
         return this;
      }

      @Override
      public erx b() {
         return new ern(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(jm.a(this.a)));
      }
   }
}
