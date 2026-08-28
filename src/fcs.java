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

public class fcs extends fbw {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fcs> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xe.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  faj.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  fcs.a.c.optionalFieldOf("target", fcs.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, fcs::new)
   );
   private final Optional<xc> c;
   private final Optional<faj.b> d;
   private final fcs.a e;

   private fcs(List<fds> $$0, Optional<xc> $$1, Optional<faj.b> $$2, fcs.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public fby<fcs> b() {
      return fbz.p;
   }

   @Override
   public Set<bbb<?>> a() {
      return this.d.<Set<bbb<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<xc> a(faj $$0, @Nullable faj.b $$1) {
      if ($$1 != null) {
         bwv $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ek $$3 = $$2.d($$0.d()).a(2);
            return $$2x -> {
               try {
                  return xf.a($$3, $$2x, $$2, 0);
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
   public daa a(daa $$0, faj $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static fbw.a<?> a(xc $$0, fcs.a $$1) {
      return a($$2 -> new fcs($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static fbw.a<?> a(xc $$0, fcs.a $$1, faj.b $$2) {
      return a($$3 -> new fcs($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements bao {
      a("custom_name"),
      b("item_name");

      public static final Codec<fcs.a> c = bao.a(fcs.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public kk<xc> a() {
         return switch (this) {
            case a -> kl.g;
            case b -> kl.h;
         };
      }
   }
}
