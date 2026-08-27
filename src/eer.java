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

public class eer extends eec {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eer> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(arg.a(arg.b, "name").forGetter($$0x -> $$0x.c), arg.a(ecq.b.e, "entity").forGetter($$0x -> $$0x.d))).apply($$0, eer::new)
   );
   private final Optional<tl> c;
   private final Optional<ecq.b> d;

   private eer(List<efp> $$0, Optional<tl> $$1, Optional<ecq.b> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eee b() {
      return eef.l;
   }

   @Override
   public Set<eey<?>> a() {
      return this.d.<Set<eey<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<tl> a(ecq $$0, @Nullable ecq.b $$1) {
      if ($$1 != null) {
         biq $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            dt $$3 = $$2.dd().a(2);
            return $$2x -> {
               try {
                  return tn.a($$3, $$2x, $$2, 0);
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
   public cjf a(cjf $$0, ecq $$1) {
      this.c.ifPresent($$2 -> $$0.a(a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static eec.a<?> a(tl $$0) {
      return a($$1 -> new eer($$1, Optional.of($$0), Optional.empty()));
   }

   public static eec.a<?> a(tl $$0, ecq.b $$1) {
      return a($$2 -> new eer($$2, Optional.of($$0), Optional.of($$1)));
   }
}
