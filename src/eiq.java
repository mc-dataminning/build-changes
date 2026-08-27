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

public class eiq extends eib {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eiq> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(atq.a(vf.a, "name").forGetter($$0x -> $$0x.c), atq.a(egp.b.e, "entity").forGetter($$0x -> $$0x.d))).apply($$0, eiq::new)
   );
   private final Optional<vd> c;
   private final Optional<egp.b> d;

   private eiq(List<ejo> $$0, Optional<vd> $$1, Optional<egp.b> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eid b() {
      return eie.l;
   }

   @Override
   public Set<eix<?>> a() {
      return this.d.<Set<eix<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<vd> a(egp $$0, @Nullable egp.b $$1) {
      if ($$1 != null) {
         blp $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ds $$3 = $$2.dd().a(2);
            return $$2x -> {
               try {
                  return vg.a($$3, $$2x, $$2, 0);
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
   public cmr a(cmr $$0, egp $$1) {
      this.c.ifPresent($$2 -> $$0.a(a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static eib.a<?> a(vd $$0) {
      return a($$1 -> new eiq($$1, Optional.of($$0), Optional.empty()));
   }

   public static eib.a<?> a(vd $$0, egp.b $$1) {
      return a($$2 -> new eiq($$2, Optional.of($$0), Optional.of($$1)));
   }
}
