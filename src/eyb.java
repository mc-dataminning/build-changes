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

public class eyb extends exf {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<eyb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  wr.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  evs.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  eyb.a.c.optionalFieldOf("target", eyb.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, eyb::new)
   );
   private final Optional<wp> c;
   private final Optional<evs.b> d;
   private final eyb.a e;

   private eyb(List<ezb> $$0, Optional<wp> $$1, Optional<evs.b> $$2, eyb.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public exh<eyb> b() {
      return exi.p;
   }

   @Override
   public Set<bai<?>> a() {
      return this.d.<Set<bai<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<wp> a(evs $$0, @Nullable evs.b $$1) {
      if ($$1 != null) {
         bum $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ex $$3 = $$2.d($$0.d()).a(2);
            return $$2x -> {
               try {
                  return ws.a($$3, $$2x, $$2, 0);
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
   public cwq a(cwq $$0, evs $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static exf.a<?> a(wp $$0, eyb.a $$1) {
      return a($$2 -> new eyb($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static exf.a<?> a(wp $$0, eyb.a $$1, evs.b $$2) {
      return a($$3 -> new eyb($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements azv {
      a("custom_name"),
      b("item_name");

      public static final Codec<eyb.a> c = azv.a(eyb.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public ku<wp> a() {
         return switch (this) {
            case a -> kv.g;
            case b -> kv.h;
         };
      }
   }
}
