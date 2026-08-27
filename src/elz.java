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

public class elz extends elk {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<elz> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(avu.a(vu.a, "name").forGetter($$0x -> $$0x.c), avu.a(ejy.b.e, "entity").forGetter($$0x -> $$0x.d))).apply($$0, elz::new)
   );
   private final Optional<vs> c;
   private final Optional<ejy.b> d;

   private elz(List<emx> $$0, Optional<vs> $$1, Optional<ejy.b> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public elm b() {
      return eln.l;
   }

   @Override
   public Set<emg<?>> a() {
      return this.d.<Set<emg<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<vs> a(ejy $$0, @Nullable ejy.b $$1) {
      if ($$1 != null) {
         bof $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            du $$3 = $$2.da().a(2);
            return $$2x -> {
               try {
                  return vv.a($$3, $$2x, $$2, 0);
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
   public cpq a(cpq $$0, ejy $$1) {
      this.c.ifPresent($$2 -> $$0.a(a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static elk.a<?> a(vs $$0) {
      return a($$1 -> new elz($$1, Optional.of($$0), Optional.empty()));
   }

   public static elk.a<?> a(vs $$0, ejy.b $$1) {
      return a($$2 -> new elz($$2, Optional.of($$0), Optional.of($$1)));
   }
}
