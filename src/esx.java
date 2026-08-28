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

public class esx extends esb {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<esx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ww.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  eqo.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  esx.a.c.optionalFieldOf("target", esx.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, esx::new)
   );
   private final Optional<wu> c;
   private final Optional<eqo.b> d;
   private final esx.a e;

   private esx(List<etz> $$0, Optional<wu> $$1, Optional<eqo.b> $$2, esx.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public esd<esx> b() {
      return ese.p;
   }

   @Override
   public Set<eth<?>> a() {
      return this.d.<Set<eth<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<wu> a(eqo $$0, @Nullable eqo.b $$1) {
      if ($$1 != null) {
         bsd $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            eq $$3 = $$2.dg().a(2);
            return $$2x -> {
               try {
                  return wx.a($$3, $$2x, $$2, 0);
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
   public cua a(cua $$0, eqo $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static esb.a<?> a(wu $$0, esx.a $$1) {
      return a($$2 -> new esx($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static esb.a<?> a(wu $$0, esx.a $$1, eqo.b $$2) {
      return a($$3 -> new esx($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements ayz {
      a("custom_name"),
      b("item_name");

      public static final Codec<esx.a> c = ayz.a(esx.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public km<wu> a() {
         return switch (this) {
            case a -> kn.g;
            case b -> kn.h;
         };
      }
   }
}
