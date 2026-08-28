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

public class evc extends eug {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<evc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xf.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  est.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  evc.a.c.optionalFieldOf("target", evc.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, evc::new)
   );
   private final Optional<xd> c;
   private final Optional<est.b> d;
   private final evc.a e;

   private evc(List<ewe> $$0, Optional<xd> $$1, Optional<est.b> $$2, evc.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public eui<evc> b() {
      return euj.p;
   }

   @Override
   public Set<evm<?>> a() {
      return this.d.<Set<evm<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<xd> a(est $$0, @Nullable est.b $$1) {
      if ($$1 != null) {
         btj $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            et $$3 = $$2.dk().a(2);
            return $$2x -> {
               try {
                  return xg.a($$3, $$2x, $$2, 0);
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
   public cvl a(cvl $$0, est $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static eug.a<?> a(xd $$0, evc.a $$1) {
      return a($$2 -> new evc($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static eug.a<?> a(xd $$0, evc.a $$1, est.b $$2) {
      return a($$3 -> new evc($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements azy {
      a("custom_name"),
      b("item_name");

      public static final Codec<evc.a> c = azy.a(evc.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public kq<xd> a() {
         return switch (this) {
            case a -> kr.g;
            case b -> kr.h;
         };
      }
   }
}
