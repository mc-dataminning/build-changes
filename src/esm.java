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

public class esm extends erp {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<esm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xn.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  eqd.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  esm.a.c.optionalFieldOf("target", esm.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, esm::new)
   );
   private final Optional<xl> c;
   private final Optional<eqd.b> d;
   private final esm.a e;

   private esm(List<etn> $$0, Optional<xl> $$1, Optional<eqd.b> $$2, esm.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public err<esm> b() {
      return ers.p;
   }

   @Override
   public Set<esw<?>> a() {
      return this.d.<Set<esw<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<xl> a(eqd $$0, @Nullable eqd.b $$1) {
      if ($$1 != null) {
         bsp $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ep $$3 = $$2.dg().a(2);
            return $$2x -> {
               try {
                  return xo.a($$3, $$2x, $$2, 0);
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
   public cuk a(cuk $$0, eqd $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static erp.a<?> a(xl $$0, esm.a $$1) {
      return a($$2 -> new esm($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static erp.a<?> a(xl $$0, esm.a $$1, eqd.b $$2) {
      return a($$3 -> new esm($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements azp {
      a("custom_name"),
      b("item_name");

      public static final Codec<esm.a> c = azp.a(esm.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public kl<xl> a() {
         return switch (this) {
            case a -> km.f;
            case b -> km.g;
         };
      }
   }
}
