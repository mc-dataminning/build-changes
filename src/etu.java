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

public class etu extends eta {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<etu> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(axu.a(xg.a, "name").forGetter($$0x -> $$0x.c), axu.a(erp.b.e, "entity").forGetter($$0x -> $$0x.d))).apply($$0, etu::new)
   );
   private final Optional<xe> c;
   private final Optional<erp.b> d;

   private etu(List<euu> $$0, Optional<xe> $$1, Optional<erp.b> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public etc b() {
      return etd.o;
   }

   @Override
   public Set<eud<?>> a() {
      return this.d.<Set<eud<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<xe> a(erp $$0, @Nullable erp.b $$1) {
      if ($$1 != null) {
         brv $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            eh $$3 = $$2.dl().a(2);
            return $$2x -> {
               try {
                  return xh.a($$3, $$2x, $$2, 0);
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
   public cuh a(cuh $$0, erp $$1) {
      this.c.ifPresent($$2 -> $$0.b(ke.f, a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static eta.a<?> a(xe $$0) {
      return a($$1 -> new etu($$1, Optional.of($$0), Optional.empty()));
   }

   public static eta.a<?> a(xe $$0, erp.b $$1) {
      return a($$2 -> new etu($$2, Optional.of($$0), Optional.of($$1)));
   }
}
