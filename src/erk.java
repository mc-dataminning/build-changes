import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class erk extends ert {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<jm<czz>> c = lp.f.r().listOf().xmap(jm::a, $$0 -> $$0.a().toList());
   public static final MapCodec<erk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(c.optionalFieldOf("enchantments").forGetter($$0x -> $$0x.d)).apply($$0, erk::new)
   );
   private final Optional<jm<czz>> d;

   erk(List<etr> $$0, Optional<jm<czz>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public erv<erk> b() {
      return erw.h;
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      azg $$2 = $$1.b();
      Optional<ji<czz>> $$3 = this.d
         .<ji<czz>>flatMap($$1x -> $$1x.a($$2))
         .or(
            () -> {
               boolean $$3x = $$0.a(cur.qP);
               List<ji.c<czz>> $$4 = lp.f
                  .h()
                  .filter($$1xx -> ((czz)$$1xx.a()).a($$1.d().J()))
                  .filter($$0xx -> ((czz)$$0xx.a()).l())
                  .filter($$2xx -> $$3x || ((czz)$$2xx.a()).b($$0))
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

   private static cuo a(cuo $$0, czz $$1, azg $$2) {
      int $$3 = ayy.a($$2, $$1.f(), $$1.g());
      if ($$0.a(cur.qP)) {
         $$0 = new cuo(cur.uw);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static erk.a c() {
      return new erk.a();
   }

   public static ert.a<?> d() {
      return a($$0 -> new erk($$0, Optional.empty()));
   }

   public static class a extends ert.a<erk.a> {
      private final List<ji<czz>> a = new ArrayList<>();

      protected erk.a a() {
         return this;
      }

      public erk.a a(czz $$0) {
         this.a.add($$0.m());
         return this;
      }

      @Override
      public eru b() {
         return new erk(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(jm.a(this.a)));
      }
   }
}
