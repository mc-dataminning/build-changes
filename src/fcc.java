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

public class fcc extends fbg {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fcc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xa.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  ezt.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  fcc.a.c.optionalFieldOf("target", fcc.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, fcc::new)
   );
   private final Optional<wy> c;
   private final Optional<ezt.b> d;
   private final fcc.a e;

   private fcc(List<fdc> $$0, Optional<wy> $$1, Optional<ezt.b> $$2, fcc.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public fbi<fcc> b() {
      return fbj.p;
   }

   @Override
   public Set<bax<?>> a() {
      return this.d.<Set<bax<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<wy> a(ezt $$0, @Nullable ezt.b $$1) {
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
   public czn a(czn $$0, ezt $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static fbg.a<?> a(wy $$0, fcc.a $$1) {
      return a($$2 -> new fcc($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static fbg.a<?> a(wy $$0, fcc.a $$1, ezt.b $$2) {
      return a($$3 -> new fcc($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements bak {
      a("custom_name"),
      b("item_name");

      public static final Codec<fcc.a> c = bak.a(fcc.a::values);
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
