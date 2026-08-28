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

public class evu extends euy {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<evu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xg.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  etl.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  evu.a.c.optionalFieldOf("target", evu.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, evu::new)
   );
   private final Optional<xe> c;
   private final Optional<etl.b> d;
   private final evu.a e;

   private evu(List<eww> $$0, Optional<xe> $$1, Optional<etl.b> $$2, evu.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public eva<evu> b() {
      return evb.p;
   }

   @Override
   public Set<ewe<?>> a() {
      return this.d.<Set<ewe<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<xe> a(etl $$0, @Nullable etl.b $$1) {
      if ($$1 != null) {
         btr $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            eu $$3 = $$2.dk().a(2);
            return $$2x -> {
               try {
                  return xh.a($$3, $$2x, $$2, 0);
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
   public cvs a(cvs $$0, etl $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static euy.a<?> a(xe $$0, evu.a $$1) {
      return a($$2 -> new evu($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static euy.a<?> a(xe $$0, evu.a $$1, etl.b $$2) {
      return a($$3 -> new evu($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements bab {
      a("custom_name"),
      b("item_name");

      public static final Codec<evu.a> c = bab.a(evu.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public kr<xe> a() {
         return switch (this) {
            case a -> ks.g;
            case b -> ks.h;
         };
      }
   }
}
