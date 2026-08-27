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

public class erm extends eqs {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<erm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  wz.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  eph.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  erm.a.c.optionalFieldOf("target", erm.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, erm::new)
   );
   private final Optional<wx> c;
   private final Optional<eph.b> d;
   private final erm.a e;

   private erm(List<esn> $$0, Optional<wx> $$1, Optional<eph.b> $$2, erm.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public equ b() {
      return eqv.o;
   }

   @Override
   public Set<erw<?>> a() {
      return this.d.<Set<erw<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<wx> a(eph $$0, @Nullable eph.b $$1) {
      if ($$1 != null) {
         brw $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ee $$3 = $$2.dg().a(2);
            return $$2x -> {
               try {
                  return xa.a($$3, $$2x, $$2, 0);
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
   public ctq a(ctq $$0, eph $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static eqs.a<?> a(wx $$0, erm.a $$1) {
      return a($$2 -> new erm($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static eqs.a<?> a(wx $$0, erm.a $$1, eph.b $$2) {
      return a($$3 -> new erm($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements ayz {
      a("custom_name"),
      b("item_name");

      public static final Codec<erm.a> c = ayz.a(erm.a::values);
      private final String d;

      private a(String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public ka<wx> a() {
         return switch (this) {
            case a -> kb.f;
            case b -> kb.g;
         };
      }
   }
}
