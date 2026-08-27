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

public class eem extends edx {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eem> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(arb.a(arb.b, "name").forGetter($$0x -> $$0x.c), arb.a(ecl.b.e, "entity").forGetter($$0x -> $$0x.d))).apply($$0, eem::new)
   );
   private final Optional<ti> c;
   private final Optional<ecl.b> d;

   private eem(List<efk> $$0, Optional<ti> $$1, Optional<ecl.b> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public edz b() {
      return eea.l;
   }

   @Override
   public Set<eet<?>> a() {
      return this.d.<Set<eet<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<ti> a(ecl $$0, @Nullable ecl.b $$1) {
      if ($$1 != null) {
         bil $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            dt $$3 = $$2.dc().a(2);
            return $$2x -> {
               try {
                  return tk.a($$3, $$2x, $$2, 0);
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
   public cja a(cja $$0, ecl $$1) {
      this.c.ifPresent($$2 -> $$0.a(a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static edx.a<?> a(ti $$0) {
      return a($$1 -> new eem($$1, Optional.of($$0), Optional.empty()));
   }

   public static edx.a<?> a(ti $$0, ecl.b $$1) {
      return a($$2 -> new eem($$2, Optional.of($$0), Optional.of($$1)));
   }
}
