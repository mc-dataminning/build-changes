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

public class etf extends esj {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<etf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ww.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  eqw.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  etf.a.c.optionalFieldOf("target", etf.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, etf::new)
   );
   private final Optional<wu> c;
   private final Optional<eqw.b> d;
   private final etf.a e;

   private etf(List<euh> $$0, Optional<wu> $$1, Optional<eqw.b> $$2, etf.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public esl<etf> b() {
      return esm.p;
   }

   @Override
   public Set<etp<?>> a() {
      return this.d.<Set<etp<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<wu> a(eqw $$0, @Nullable eqw.b $$1) {
      if ($$1 != null) {
         bsh $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            eq $$3 = $$2.di().a(2);
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
   public cud a(cud $$0, eqw $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static esj.a<?> a(wu $$0, etf.a $$1) {
      return a($$2 -> new etf($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static esj.a<?> a(wu $$0, etf.a $$1, eqw.b $$2) {
      return a($$3 -> new etf($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements azc {
      a("custom_name"),
      b("item_name");

      public static final Codec<etf.a> c = azc.a(etf.a::values);
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
