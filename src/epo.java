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

public class epo extends eox {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<epo> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(awu.a(wk.a, "name").forGetter($$0x -> $$0x.c), awu.a(enk.b.e, "entity").forGetter($$0x -> $$0x.d))).apply($$0, epo::new)
   );
   private final Optional<wi> c;
   private final Optional<enk.b> d;

   private epo(List<eql> $$0, Optional<wi> $$1, Optional<enk.b> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eoz b() {
      return epa.m;
   }

   @Override
   public Set<epu<?>> a() {
      return this.d.<Set<epu<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<wi> a(enk $$0, @Nullable enk.b $$1) {
      if ($$1 != null) {
         bqa $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            dv $$3 = $$2.dd().a(2);
            return $$2x -> {
               try {
                  return wl.a($$3, $$2x, $$2, 0);
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
   public crs a(crs $$0, enk $$1) {
      this.c.ifPresent($$2 -> $$0.b(jr.d, a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static eox.a<?> a(wi $$0) {
      return a($$1 -> new epo($$1, Optional.of($$0), Optional.empty()));
   }

   public static eox.a<?> a(wi $$0, enk.b $$1) {
      return a($$2 -> new epo($$2, Optional.of($$0), Optional.of($$1)));
   }
}
