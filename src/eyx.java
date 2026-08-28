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

public class eyx extends eyb {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<eyx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xx.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  ewo.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  eyx.a.c.optionalFieldOf("target", eyx.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, eyx::new)
   );
   private final Optional<xv> c;
   private final Optional<ewo.b> d;
   private final eyx.a e;

   private eyx(List<ezx> $$0, Optional<xv> $$1, Optional<ewo.b> $$2, eyx.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public eyd<eyx> b() {
      return eye.p;
   }

   @Override
   public Set<bbn<?>> a() {
      return this.d.<Set<bbn<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<xv> a(ewo $$0, @Nullable ewo.b $$1) {
      if ($$1 != null) {
         bvj $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ew $$3 = $$2.d($$0.d()).a(2);
            return $$2x -> {
               try {
                  return xy.a($$3, $$2x, $$2, 0);
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
   public cxo a(cxo $$0, ewo $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static eyb.a<?> a(xv $$0, eyx.a $$1) {
      return a($$2 -> new eyx($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static eyb.a<?> a(xv $$0, eyx.a $$1, ewo.b $$2) {
      return a($$3 -> new eyx($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements bba {
      a("custom_name"),
      b("item_name");

      public static final Codec<eyx.a> c = bba.a(eyx.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public kt<xv> a() {
         return switch (this) {
            case a -> ku.g;
            case b -> ku.h;
         };
      }
   }
}
