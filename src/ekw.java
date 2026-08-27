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

public class ekw extends ekh {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ekw> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(avp.a(vs.a, "name").forGetter($$0x -> $$0x.c), avp.a(eiv.b.e, "entity").forGetter($$0x -> $$0x.d))).apply($$0, ekw::new)
   );
   private final Optional<vq> c;
   private final Optional<eiv.b> d;

   private ekw(List<elu> $$0, Optional<vq> $$1, Optional<eiv.b> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public ekj b() {
      return ekk.l;
   }

   @Override
   public Set<eld<?>> a() {
      return this.d.<Set<eld<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<vq> a(eiv $$0, @Nullable eiv.b $$1) {
      if ($$1 != null) {
         bno $$2 = $$0.c($$1.a());
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
   public coz a(coz $$0, eiv $$1) {
      this.c.ifPresent($$2 -> $$0.a(a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static ekh.a<?> a(vq $$0) {
      return a($$1 -> new ekw($$1, Optional.of($$0), Optional.empty()));
   }

   public static ekh.a<?> a(vq $$0, eiv.b $$1) {
      return a($$2 -> new ekw($$2, Optional.of($$0), Optional.of($$1)));
   }
}
