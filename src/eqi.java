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

public class eqi extends epo {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eqi> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(axe.a(wu.a, "name").forGetter($$0x -> $$0x.c), axe.a(eoa.b.e, "entity").forGetter($$0x -> $$0x.d))).apply($$0, eqi::new)
   );
   private final Optional<ws> c;
   private final Optional<eoa.b> d;

   private eqi(List<erh> $$0, Optional<ws> $$1, Optional<eoa.b> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public epq b() {
      return epr.m;
   }

   @Override
   public Set<eqq<?>> a() {
      return this.d.<Set<eqq<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<ws> a(eoa $$0, @Nullable eoa.b $$1) {
      if ($$1 != null) {
         bql $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ec $$3 = $$2.de().a(2);
            return $$2x -> {
               try {
                  return wv.a($$3, $$2x, $$2, 0);
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
   public csd a(csd $$0, eoa $$1) {
      this.c.ifPresent($$2 -> $$0.b(jz.d, a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static epo.a<?> a(ws $$0) {
      return a($$1 -> new eqi($$1, Optional.of($$0), Optional.empty()));
   }

   public static epo.a<?> a(ws $$0, eoa.b $$1) {
      return a($$2 -> new eqi($$2, Optional.of($$0), Optional.of($$1)));
   }
}
