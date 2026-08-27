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

public class eld extends eko {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eld> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(avq.a(vs.a, "name").forGetter($$0x -> $$0x.c), avq.a(ejc.b.e, "entity").forGetter($$0x -> $$0x.d))).apply($$0, eld::new)
   );
   private final Optional<vq> c;
   private final Optional<ejc.b> d;

   private eld(List<emb> $$0, Optional<vq> $$1, Optional<ejc.b> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public ekq b() {
      return ekr.l;
   }

   @Override
   public Set<elk<?>> a() {
      return this.d.<Set<elk<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<vq> a(ejc $$0, @Nullable ejc.b $$1) {
      if ($$1 != null) {
         bnq $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            du $$3 = $$2.dd().a(2);
            return $$2x -> {
               try {
                  return vt.a($$3, $$2x, $$2, 0);
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
   public cpd a(cpd $$0, ejc $$1) {
      this.c.ifPresent($$2 -> $$0.a(a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static eko.a<?> a(vq $$0) {
      return a($$1 -> new eld($$1, Optional.of($$0), Optional.empty()));
   }

   public static eko.a<?> a(vq $$0, ejc.b $$1) {
      return a($$2 -> new eld($$2, Optional.of($$0), Optional.of($$1)));
   }
}
