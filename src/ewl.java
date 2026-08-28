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

public class ewl extends evp {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<ewl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xk.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  euc.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  ewl.a.c.optionalFieldOf("target", ewl.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, ewl::new)
   );
   private final Optional<xi> c;
   private final Optional<euc.b> d;
   private final ewl.a e;

   private ewl(List<exn> $$0, Optional<xi> $$1, Optional<euc.b> $$2, ewl.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public evr<ewl> b() {
      return evs.p;
   }

   @Override
   public Set<ewv<?>> a() {
      return this.d.<Set<ewv<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<xi> a(euc $$0, @Nullable euc.b $$1) {
      if ($$1 != null) {
         bue $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ew $$3 = $$2.dp().a(2);
            return $$2x -> {
               try {
                  return xl.a($$3, $$2x, $$2, 0);
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
   public cwb a(cwb $$0, euc $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static evp.a<?> a(xi $$0, ewl.a $$1) {
      return a($$2 -> new ewl($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static evp.a<?> a(xi $$0, ewl.a $$1, euc.b $$2) {
      return a($$3 -> new ewl($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements bag {
      a("custom_name"),
      b("item_name");

      public static final Codec<ewl.a> c = bag.a(ewl.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public kt<xi> a() {
         return switch (this) {
            case a -> ku.g;
            case b -> ku.h;
         };
      }
   }
}
