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

public class emx extends emi {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<emx> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(awe.a(vw.a, "name").forGetter($$0x -> $$0x.c), awe.a(ekw.b.e, "entity").forGetter($$0x -> $$0x.d))).apply($$0, emx::new)
   );
   private final Optional<vu> c;
   private final Optional<ekw.b> d;

   private emx(List<env> $$0, Optional<vu> $$1, Optional<ekw.b> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public emk b() {
      return eml.l;
   }

   @Override
   public Set<ene<?>> a() {
      return this.d.<Set<ene<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<vu> a(ekw $$0, @Nullable ekw.b $$1) {
      if ($$1 != null) {
         box $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            du $$3 = $$2.dd().a(2);
            return $$2x -> {
               try {
                  return vx.a($$3, $$2x, $$2, 0);
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
   public cqm a(cqm $$0, ekw $$1) {
      this.c.ifPresent($$2 -> $$0.a(a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static emi.a<?> a(vu $$0) {
      return a($$1 -> new emx($$1, Optional.of($$0), Optional.empty()));
   }

   public static emi.a<?> a(vu $$0, ekw.b $$1) {
      return a($$2 -> new emx($$2, Optional.of($$0), Optional.of($$1)));
   }
}
