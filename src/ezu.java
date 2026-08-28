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

public class ezu extends eyy {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<ezu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  wx.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  exl.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  ezu.a.c.optionalFieldOf("target", ezu.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, ezu::new)
   );
   private final Optional<wv> c;
   private final Optional<exl.b> d;
   private final ezu.a e;

   private ezu(List<fau> $$0, Optional<wv> $$1, Optional<exl.b> $$2, ezu.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public eza<ezu> b() {
      return ezb.p;
   }

   @Override
   public Set<bat<?>> a() {
      return this.d.<Set<bat<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<wv> a(exl $$0, @Nullable exl.b $$1) {
      if ($$1 != null) {
         bvs $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ex $$3 = $$2.d($$0.d()).a(2);
            return $$2x -> {
               try {
                  return wy.a($$3, $$2x, $$2, 0);
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
   public cxy a(cxy $$0, exl $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static eyy.a<?> a(wv $$0, ezu.a $$1) {
      return a($$2 -> new ezu($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static eyy.a<?> a(wv $$0, ezu.a $$1, exl.b $$2) {
      return a($$3 -> new ezu($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements bag {
      a("custom_name"),
      b("item_name");

      public static final Codec<ezu.a> c = bag.a(ezu.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public kw<wv> a() {
         return switch (this) {
            case a -> kx.g;
            case b -> kx.h;
         };
      }
   }
}
