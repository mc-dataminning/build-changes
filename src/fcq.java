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

public class fcq extends fbu {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fcq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xc.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  fah.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  fcq.a.c.optionalFieldOf("target", fcq.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, fcq::new)
   );
   private final Optional<xa> c;
   private final Optional<fah.b> d;
   private final fcq.a e;

   private fcq(List<fdq> $$0, Optional<xa> $$1, Optional<fah.b> $$2, fcq.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public fbw<fcq> b() {
      return fbx.p;
   }

   @Override
   public Set<baz<?>> a() {
      return this.d.<Set<baz<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<xa> a(fah $$0, @Nullable fah.b $$1) {
      if ($$1 != null) {
         bwt $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ej $$3 = $$2.d($$0.d()).a(2);
            return $$2x -> {
               try {
                  return xd.a($$3, $$2x, $$2, 0);
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
   public czy a(czy $$0, fah $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static fbu.a<?> a(xa $$0, fcq.a $$1) {
      return a($$2 -> new fcq($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static fbu.a<?> a(xa $$0, fcq.a $$1, fah.b $$2) {
      return a($$3 -> new fcq($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements bam {
      a("custom_name"),
      b("item_name");

      public static final Codec<fcq.a> c = bam.a(fcq.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public kj<xa> a() {
         return switch (this) {
            case a -> kk.g;
            case b -> kk.h;
         };
      }
   }
}
