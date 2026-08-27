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

public class epf extends eoo {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<epf> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(aws.a(wi.a, "name").forGetter($$0x -> $$0x.c), aws.a(enb.b.e, "entity").forGetter($$0x -> $$0x.d))).apply($$0, epf::new)
   );
   private final Optional<wg> c;
   private final Optional<enb.b> d;

   private epf(List<eqc> $$0, Optional<wg> $$1, Optional<enb.b> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eoq b() {
      return eor.m;
   }

   @Override
   public Set<epl<?>> a() {
      return this.d.<Set<epl<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<wg> a(enb $$0, @Nullable enb.b $$1) {
      if ($$1 != null) {
         bpv $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            du $$3 = $$2.dd().a(2);
            return $$2x -> {
               try {
                  return wj.a($$3, $$2x, $$2, 0);
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
   public crj a(crj $$0, enb $$1) {
      this.c.ifPresent($$2 -> $$0.b(jp.d, a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static eoo.a<?> a(wg $$0) {
      return a($$1 -> new epf($$1, Optional.of($$0), Optional.empty()));
   }

   public static eoo.a<?> a(wg $$0, enb.b $$1) {
      return a($$2 -> new epf($$2, Optional.of($$0), Optional.of($$1)));
   }
}
