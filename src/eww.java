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

public class eww extends ewa {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<eww> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xl.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  eun.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  eww.a.c.optionalFieldOf("target", eww.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, eww::new)
   );
   private final Optional<xj> c;
   private final Optional<eun.b> d;
   private final eww.a e;

   private eww(List<exy> $$0, Optional<xj> $$1, Optional<eun.b> $$2, eww.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public ewc<eww> b() {
      return ewd.p;
   }

   @Override
   public Set<exg<?>> a() {
      return this.d.<Set<exg<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<xj> a(eun $$0, @Nullable eun.b $$1) {
      if ($$1 != null) {
         bul $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ew $$3 = $$2.d($$0.d()).a(2);
            return $$2x -> {
               try {
                  return xm.a($$3, $$2x, $$2, 0);
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
   public cwm a(cwm $$0, eun $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static ewa.a<?> a(xj $$0, eww.a $$1) {
      return a($$2 -> new eww($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static ewa.a<?> a(xj $$0, eww.a $$1, eun.b $$2) {
      return a($$3 -> new eww($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements bai {
      a("custom_name"),
      b("item_name");

      public static final Codec<eww.a> c = bai.a(eww.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public kt<xj> a() {
         return switch (this) {
            case a -> ku.g;
            case b -> ku.h;
         };
      }
   }
}
