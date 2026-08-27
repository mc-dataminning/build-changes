import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class egy extends egj {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<egy> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(asu.a(ut.a, "name").forGetter($$0x -> $$0x.c), asu.a(eex.b.e, "entity").forGetter($$0x -> $$0x.d))).apply($$0, egy::new)
   );
   private final Optional<ur> c;
   private final Optional<eex.b> d;

   private egy(List<ehw> $$0, Optional<ur> $$1, Optional<eex.b> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public egl b() {
      return egm.l;
   }

   @Override
   public Set<ehf<?>> a() {
      return this.d.<Set<ehf<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<ur> a(eex $$0, @Nullable eex.b $$1) {
      if ($$1 != null) {
         bkq $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            du $$3 = $$2.de().a(2);
            return $$2x -> {
               try {
                  return uu.a($$3, $$2x, $$2, 0);
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
   public clj a(clj $$0, eex $$1) {
      this.c.ifPresent($$2 -> $$0.a(a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static egj.a<?> a(ur $$0) {
      return a($$1 -> new egy($$1, Optional.of($$0), Optional.empty()));
   }

   public static egj.a<?> a(ur $$0, eex.b $$1) {
      return a($$2 -> new egy($$2, Optional.of($$0), Optional.of($$1)));
   }
}
