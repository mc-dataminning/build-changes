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

public class eel extends edw {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eel> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(arj.a(tn.a, "name").forGetter($$0x -> $$0x.c), arj.a(eck.b.e, "entity").forGetter($$0x -> $$0x.d))).apply($$0, eel::new)
   );
   private final Optional<tl> c;
   private final Optional<eck.b> d;

   private eel(List<efj> $$0, Optional<tl> $$1, Optional<eck.b> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public edy b() {
      return edz.l;
   }

   @Override
   public Set<ees<?>> a() {
      return this.d.<Set<ees<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<tl> a(eck $$0, @Nullable eck.b $$1) {
      if ($$1 != null) {
         biw $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            dt $$3 = $$2.dc().a(2);
            return $$2x -> {
               try {
                  return to.a($$3, $$2x, $$2, 0);
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
   public cjl a(cjl $$0, eck $$1) {
      this.c.ifPresent($$2 -> $$0.a(a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static edw.a<?> a(tl $$0) {
      return a($$1 -> new eel($$1, Optional.of($$0), Optional.empty()));
   }

   public static edw.a<?> a(tl $$0, eck.b $$1) {
      return a($$2 -> new eel($$2, Optional.of($$0), Optional.of($$1)));
   }
}
