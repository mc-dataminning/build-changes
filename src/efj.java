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

public class efj extends eeu {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<efj> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(asg.a(uk.a, "name").forGetter($$0x -> $$0x.c), asg.a(edi.b.e, "entity").forGetter($$0x -> $$0x.d))).apply($$0, efj::new)
   );
   private final Optional<ui> c;
   private final Optional<edi.b> d;

   private efj(List<egh> $$0, Optional<ui> $$1, Optional<edi.b> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eew b() {
      return eex.l;
   }

   @Override
   public Set<efq<?>> a() {
      return this.d.<Set<efq<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<ui> a(edi $$0, @Nullable edi.b $$1) {
      if ($$1 != null) {
         bjt $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            du $$3 = $$2.dc().a(2);
            return $$2x -> {
               try {
                  return ul.a($$3, $$2x, $$2, 0);
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
   public ckj a(ckj $$0, edi $$1) {
      this.c.ifPresent($$2 -> $$0.a(a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static eeu.a<?> a(ui $$0) {
      return a($$1 -> new efj($$1, Optional.of($$0), Optional.empty()));
   }

   public static eeu.a<?> a(ui $$0, edi.b $$1) {
      return a($$2 -> new efj($$2, Optional.of($$0), Optional.of($$1)));
   }
}
