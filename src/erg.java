import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class erg extends erp {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<jm<czv>> c = lp.f.r().listOf().xmap(jm::a, $$0 -> $$0.a().toList());
   public static final MapCodec<erg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(c.optionalFieldOf("enchantments").forGetter($$0x -> $$0x.d)).apply($$0, erg::new)
   );
   private final Optional<jm<czv>> d;

   erg(List<etn> $$0, Optional<jm<czv>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public err<erg> b() {
      return ers.h;
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      azc $$2 = $$1.b();
      Optional<ji<czv>> $$3 = this.d
         .<ji<czv>>flatMap($$1x -> $$1x.a($$2))
         .or(
            () -> {
               boolean $$3x = $$0.a(cun.qP);
               List<ji.c<czv>> $$4 = lp.f
                  .h()
                  .filter($$1xx -> ((czv)$$1xx.a()).a($$1.d().J()))
                  .filter($$0xx -> ((czv)$$0xx.a()).l())
                  .filter($$2xx -> $$3x || ((czv)$$2xx.a()).b($$0))
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

   private static cuk a(cuk $$0, czv $$1, azc $$2) {
      int $$3 = ayu.a($$2, $$1.f(), $$1.g());
      if ($$0.a(cun.qP)) {
         $$0 = new cuk(cun.uw);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static erg.a c() {
      return new erg.a();
   }

   public static erp.a<?> d() {
      return a($$0 -> new erg($$0, Optional.empty()));
   }

   public static class a extends erp.a<erg.a> {
      private final List<ji<czv>> a = new ArrayList<>();

      protected erg.a a() {
         return this;
      }

      public erg.a a(czv $$0) {
         this.a.add($$0.m());
         return this;
      }

      @Override
      public erq b() {
         return new erg(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(jm.a(this.a)));
      }
   }
}
