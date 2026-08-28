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

public class etu extends esy {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<etu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xa.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  erl.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  etu.a.c.optionalFieldOf("target", etu.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, etu::new)
   );
   private final Optional<wy> c;
   private final Optional<erl.b> d;
   private final etu.a e;

   private etu(List<euw> $$0, Optional<wy> $$1, Optional<erl.b> $$2, etu.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public eta<etu> b() {
      return etb.p;
   }

   @Override
   public Set<eue<?>> a() {
      return this.d.<Set<eue<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<wy> a(erl $$0, @Nullable erl.b $$1) {
      if ($$1 != null) {
         bsq $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            et $$3 = $$2.dh().a(2);
            return $$2x -> {
               try {
                  return xb.a($$3, $$2x, $$2, 0);
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
   public cuo a(cuo $$0, erl $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static esy.a<?> a(wy $$0, etu.a $$1) {
      return a($$2 -> new etu($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static esy.a<?> a(wy $$0, etu.a $$1, erl.b $$2) {
      return a($$3 -> new etu($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements azj {
      a("custom_name"),
      b("item_name");

      public static final Codec<etu.a> c = azj.a(etu.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public kp<wy> a() {
         return switch (this) {
            case a -> kq.g;
            case b -> kq.h;
         };
      }
   }
}
