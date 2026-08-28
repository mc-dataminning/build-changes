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

public class ewf extends evj {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<ewf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xj.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  etw.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  ewf.a.c.optionalFieldOf("target", ewf.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, ewf::new)
   );
   private final Optional<xh> c;
   private final Optional<etw.b> d;
   private final ewf.a e;

   private ewf(List<exh> $$0, Optional<xh> $$1, Optional<etw.b> $$2, ewf.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public evl<ewf> b() {
      return evm.p;
   }

   @Override
   public Set<ewp<?>> a() {
      return this.d.<Set<ewp<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<xh> a(etw $$0, @Nullable etw.b $$1) {
      if ($$1 != null) {
         btz $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ev $$3 = $$2.dp().a(2);
            return $$2x -> {
               try {
                  return xk.a($$3, $$2x, $$2, 0);
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
   public cvx a(cvx $$0, etw $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static evj.a<?> a(xh $$0, ewf.a $$1) {
      return a($$2 -> new ewf($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static evj.a<?> a(xh $$0, ewf.a $$1, etw.b $$2) {
      return a($$3 -> new ewf($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements baf {
      a("custom_name"),
      b("item_name");

      public static final Codec<ewf.a> c = baf.a(ewf.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public ks<xh> a() {
         return switch (this) {
            case a -> kt.g;
            case b -> kt.h;
         };
      }
   }
}
