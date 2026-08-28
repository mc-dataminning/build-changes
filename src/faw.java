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

public class faw extends faa {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<faw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  wy.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  eyn.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  faw.a.c.optionalFieldOf("target", faw.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, faw::new)
   );
   private final Optional<ww> c;
   private final Optional<eyn.b> d;
   private final faw.a e;

   private faw(List<fbw> $$0, Optional<ww> $$1, Optional<eyn.b> $$2, faw.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public fac<faw> b() {
      return fad.p;
   }

   @Override
   public Set<bav<?>> a() {
      return this.d.<Set<bav<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<ww> a(eyn $$0, @Nullable eyn.b $$1) {
      if ($$1 != null) {
         bwa $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ei $$3 = $$2.d($$0.d()).a(2);
            return $$2x -> {
               try {
                  return wz.a($$3, $$2x, $$2, 0);
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
   public cys a(cys $$0, eyn $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static faa.a<?> a(ww $$0, faw.a $$1) {
      return a($$2 -> new faw($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static faa.a<?> a(ww $$0, faw.a $$1, eyn.b $$2) {
      return a($$3 -> new faw($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements bai {
      a("custom_name"),
      b("item_name");

      public static final Codec<faw.a> c = bai.a(faw.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public ki<ww> a() {
         return switch (this) {
            case a -> kj.g;
            case b -> kj.h;
         };
      }
   }
}
