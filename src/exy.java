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

public class exy extends exc {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<exy> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  wq.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  evp.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  exy.a.c.optionalFieldOf("target", exy.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, exy::new)
   );
   private final Optional<wo> c;
   private final Optional<evp.b> d;
   private final exy.a e;

   private exy(List<eyy> $$0, Optional<wo> $$1, Optional<evp.b> $$2, exy.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public exe<exy> b() {
      return exf.p;
   }

   @Override
   public Set<bah<?>> a() {
      return this.d.<Set<bah<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<wo> a(evp $$0, @Nullable evp.b $$1) {
      if ($$1 != null) {
         buj $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ex $$3 = $$2.d($$0.d()).a(2);
            return $$2x -> {
               try {
                  return wr.a($$3, $$2x, $$2, 0);
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
   public cwn a(cwn $$0, evp $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static exc.a<?> a(wo $$0, exy.a $$1) {
      return a($$2 -> new exy($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static exc.a<?> a(wo $$0, exy.a $$1, evp.b $$2) {
      return a($$3 -> new exy($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements azu {
      a("custom_name"),
      b("item_name");

      public static final Codec<exy.a> c = azu.a(exy.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public ku<wo> a() {
         return switch (this) {
            case a -> kv.g;
            case b -> kv.h;
         };
      }
   }
}
