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

public class evq extends euu {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<evq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xf.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  eth.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  evq.a.c.optionalFieldOf("target", evq.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, evq::new)
   );
   private final Optional<xd> c;
   private final Optional<eth.b> d;
   private final evq.a e;

   private evq(List<ews> $$0, Optional<xd> $$1, Optional<eth.b> $$2, evq.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public euw<evq> b() {
      return eux.p;
   }

   @Override
   public Set<ewa<?>> a() {
      return this.d.<Set<ewa<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<xd> a(eth $$0, @Nullable eth.b $$1) {
      if ($$1 != null) {
         bto $$2 = $$0.c($$1.a());
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
   public cvp a(cvp $$0, eth $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static euu.a<?> a(xd $$0, evq.a $$1) {
      return a($$2 -> new evq($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static euu.a<?> a(xd $$0, evq.a $$1, eth.b $$2) {
      return a($$3 -> new evq($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements azz {
      a("custom_name"),
      b("item_name");

      public static final Codec<evq.a> c = azz.a(evq.a::values);
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
