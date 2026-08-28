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

public class eyr extends exv {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<eyr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xm.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  ewi.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  eyr.a.c.optionalFieldOf("target", eyr.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, eyr::new)
   );
   private final Optional<xk> c;
   private final Optional<ewi.b> d;
   private final eyr.a e;

   private eyr(List<ezr> $$0, Optional<xk> $$1, Optional<ewi.b> $$2, eyr.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public exx<eyr> b() {
      return exy.p;
   }

   @Override
   public Set<bbd<?>> a() {
      return this.d.<Set<bbd<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<xk> a(ewi $$0, @Nullable ewi.b $$1) {
      if ($$1 != null) {
         bvb $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ew $$3 = $$2.d($$0.d()).a(2);
            return $$2x -> {
               try {
                  return xn.a($$3, $$2x, $$2, 0);
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
   public cxg a(cxg $$0, ewi $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static exv.a<?> a(xk $$0, eyr.a $$1) {
      return a($$2 -> new eyr($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static exv.a<?> a(xk $$0, eyr.a $$1, ewi.b $$2) {
      return a($$3 -> new eyr($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements baq {
      a("custom_name"),
      b("item_name");

      public static final Codec<eyr.a> c = baq.a(eyr.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public kt<xk> a() {
         return switch (this) {
            case a -> ku.g;
            case b -> ku.h;
         };
      }
   }
}
