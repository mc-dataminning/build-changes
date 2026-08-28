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

public class eua extends ete {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<eua> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xb.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  err.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  eua.a.c.optionalFieldOf("target", eua.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, eua::new)
   );
   private final Optional<wz> c;
   private final Optional<err.b> d;
   private final eua.a e;

   private eua(List<evc> $$0, Optional<wz> $$1, Optional<err.b> $$2, eua.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public etg<eua> b() {
      return eth.p;
   }

   @Override
   public Set<euk<?>> a() {
      return this.d.<Set<euk<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<wz> a(err $$0, @Nullable err.b $$1) {
      if ($$1 != null) {
         bsr $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            et $$3 = $$2.dg().a(2);
            return $$2x -> {
               try {
                  return xc.a($$3, $$2x, $$2, 0);
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
   public cuq a(cuq $$0, err $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static ete.a<?> a(wz $$0, eua.a $$1) {
      return a($$2 -> new eua($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static ete.a<?> a(wz $$0, eua.a $$1, err.b $$2) {
      return a($$3 -> new eua($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements azk {
      a("custom_name"),
      b("item_name");

      public static final Codec<eua.a> c = azk.a(eua.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public kp<wz> a() {
         return switch (this) {
            case a -> kq.g;
            case b -> kq.h;
         };
      }
   }
}
