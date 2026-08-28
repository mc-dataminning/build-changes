import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class est extends erw {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<est> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xr.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  eqk.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  est.a.c.optionalFieldOf("target", est.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, est::new)
   );
   private final Optional<xp> c;
   private final Optional<eqk.b> d;
   private final est.a e;

   private est(List<etu> $$0, Optional<xp> $$1, Optional<eqk.b> $$2, est.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public ery<est> b() {
      return erz.p;
   }

   @Override
   public Set<etd<?>> a() {
      return this.d.<Set<etd<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<xp> a(eqk $$0, @Nullable eqk.b $$1) {
      if ($$1 != null) {
         bsw $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ep $$3 = $$2.dg().a(2);
            return $$2x -> {
               try {
                  return xs.a($$3, $$2x, $$2, 0);
               } catch (CommandSyntaxException var4) {
                  b.warn("Failed to resolve text component", var4);
                  return $$2x;
               }
            };
         }
      }

      return $$0x -> $$0x;
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static erw.a<?> a(xp $$0, est.a $$1) {
      return a($$2 -> new est($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static erw.a<?> a(xp $$0, est.a $$1, eqk.b $$2) {
      return a($$3 -> new est($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements azu {
      a("custom_name"),
      b("item_name");

      public static final Codec<est.a> c = azu.a(est.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public kl<xp> a() {
         return switch (this) {
            case a -> km.g;
            case b -> km.h;
         };
      }
   }
}
