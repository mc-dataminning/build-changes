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

public class fdc extends fcg {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fdc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xi.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  fat.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  fdc.a.c.optionalFieldOf("target", fdc.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, fdc::new)
   );
   private final Optional<xg> c;
   private final Optional<fat.b> d;
   private final fdc.a e;

   private fdc(List<fec> $$0, Optional<xg> $$1, Optional<fat.b> $$2, fdc.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public fci<fdc> b() {
      return fcj.p;
   }

   @Override
   public Set<bbk<?>> a() {
      return this.d.<Set<bbk<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<xg> a(fat $$0, @Nullable fat.b $$1) {
      if ($$1 != null) {
         bxe $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ek $$3 = $$2.d($$0.d()).a(2);
            return $$2x -> {
               try {
                  return xj.a($$3, $$2x, $$2, 0);
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
   public dak a(dak $$0, fat $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static fcg.a<?> a(xg $$0, fdc.a $$1) {
      return a($$2 -> new fdc($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static fcg.a<?> a(xg $$0, fdc.a $$1, fat.b $$2) {
      return a($$3 -> new fdc($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements bax {
      a("custom_name"),
      b("item_name");

      public static final Codec<fdc.a> c = bax.a(fdc.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public kk<xg> a() {
         return switch (this) {
            case a -> kl.g;
            case b -> kl.h;
         };
      }
   }
}
