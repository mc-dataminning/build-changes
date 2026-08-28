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

public class ess extends erv {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<ess> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xr.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  eqj.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  ess.a.c.optionalFieldOf("target", ess.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, ess::new)
   );
   private final Optional<xp> c;
   private final Optional<eqj.b> d;
   private final ess.a e;

   private ess(List<ett> $$0, Optional<xp> $$1, Optional<eqj.b> $$2, ess.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public erx<ess> b() {
      return ery.p;
   }

   @Override
   public Set<etc<?>> a() {
      return this.d.<Set<etc<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<xp> a(eqj $$0, @Nullable eqj.b $$1) {
      if ($$1 != null) {
         bsv $$2 = $$0.c($$1.a());
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
   public cuq a(cuq $$0, eqj $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static erv.a<?> a(xp $$0, ess.a $$1) {
      return a($$2 -> new ess($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static erv.a<?> a(xp $$0, ess.a $$1, eqj.b $$2) {
      return a($$3 -> new ess($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements azu {
      a("custom_name"),
      b("item_name");

      public static final Codec<ess.a> c = azu.a(ess.a::values);
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
