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

public class egm extends efx {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<egm> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(asq.a(ut.a, "name").forGetter($$0x -> $$0x.c), asq.a(eel.b.e, "entity").forGetter($$0x -> $$0x.d))).apply($$0, egm::new)
   );
   private final Optional<ur> c;
   private final Optional<eel.b> d;

   private egm(List<ehk> $$0, Optional<ur> $$1, Optional<eel.b> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public efz b() {
      return ega.l;
   }

   @Override
   public Set<egt<?>> a() {
      return this.d.<Set<egt<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<ur> a(eel $$0, @Nullable eel.b $$1) {
      if ($$1 != null) {
         bki $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            du $$3 = $$2.dc().a(2);
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
   public clb a(clb $$0, eel $$1) {
      this.c.ifPresent($$2 -> $$0.a(a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static efx.a<?> a(ur $$0) {
      return a($$1 -> new egm($$1, Optional.of($$0), Optional.empty()));
   }

   public static efx.a<?> a(ur $$0, eel.b $$1) {
      return a($$2 -> new egm($$2, Optional.of($$0), Optional.of($$1)));
   }
}
