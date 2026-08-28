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

public class fbx extends fbb {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fbx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xa.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  ezo.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  fbx.a.c.optionalFieldOf("target", fbx.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, fbx::new)
   );
   private final Optional<wy> c;
   private final Optional<ezo.b> d;
   private final fbx.a e;

   private fbx(List<fcx> $$0, Optional<wy> $$1, Optional<ezo.b> $$2, fbx.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public fbd<fbx> b() {
      return fbe.p;
   }

   @Override
   public Set<bax<?>> a() {
      return this.d.<Set<bax<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<wy> a(ezo $$0, @Nullable ezo.b $$1) {
      if ($$1 != null) {
         bwi $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ej $$3 = $$2.d($$0.d()).a(2);
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
   public czk a(czk $$0, ezo $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static fbb.a<?> a(wy $$0, fbx.a $$1) {
      return a($$2 -> new fbx($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static fbb.a<?> a(wy $$0, fbx.a $$1, ezo.b $$2) {
      return a($$3 -> new fbx($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements bak {
      a("custom_name"),
      b("item_name");

      public static final Codec<fbx.a> c = bak.a(fbx.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public kj<wy> a() {
         return switch (this) {
            case a -> kk.g;
            case b -> kk.h;
         };
      }
   }
}
