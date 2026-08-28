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

public class esp extends ers {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<esp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xq.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  eqg.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  esp.a.c.optionalFieldOf("target", esp.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, esp::new)
   );
   private final Optional<xo> c;
   private final Optional<eqg.b> d;
   private final esp.a e;

   private esp(List<etq> $$0, Optional<xo> $$1, Optional<eqg.b> $$2, esp.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public eru<esp> b() {
      return erv.p;
   }

   @Override
   public Set<esz<?>> a() {
      return this.d.<Set<esz<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<xo> a(eqg $$0, @Nullable eqg.b $$1) {
      if ($$1 != null) {
         bss $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ep $$3 = $$2.dg().a(2);
            return $$2x -> {
               try {
                  return xr.a($$3, $$2x, $$2, 0);
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
   public cun a(cun $$0, eqg $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static ers.a<?> a(xo $$0, esp.a $$1) {
      return a($$2 -> new esp($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static ers.a<?> a(xo $$0, esp.a $$1, eqg.b $$2) {
      return a($$3 -> new esp($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements azs {
      a("custom_name"),
      b("item_name");

      public static final Codec<esp.a> c = azs.a(esp.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public kl<xo> a() {
         return switch (this) {
            case a -> km.f;
            case b -> km.g;
         };
      }
   }
}
