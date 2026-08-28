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

public class ewp extends evt {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<ewp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xn.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  eug.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  ewp.a.c.optionalFieldOf("target", ewp.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, ewp::new)
   );
   private final Optional<xl> c;
   private final Optional<eug.b> d;
   private final ewp.a e;

   private ewp(List<exr> $$0, Optional<xl> $$1, Optional<eug.b> $$2, ewp.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public evv<ewp> b() {
      return evw.p;
   }

   @Override
   public Set<ewz<?>> a() {
      return this.d.<Set<ewz<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<xl> a(eug $$0, @Nullable eug.b $$1) {
      if ($$1 != null) {
         bui $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ew $$3 = $$2.dq().a(2);
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
   public cwf a(cwf $$0, eug $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static evt.a<?> a(xl $$0, ewp.a $$1) {
      return a($$2 -> new ewp($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static evt.a<?> a(xl $$0, ewp.a $$1, eug.b $$2) {
      return a($$3 -> new ewp($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements baj {
      a("custom_name"),
      b("item_name");

      public static final Codec<ewp.a> c = baj.a(ewp.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public kt<xl> a() {
         return switch (this) {
            case a -> ku.g;
            case b -> ku.h;
         };
      }
   }
}
