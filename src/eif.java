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

public class eif extends ehq {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eif> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(atg.a(vd.a, "name").forGetter($$0x -> $$0x.c), atg.a(ege.b.e, "entity").forGetter($$0x -> $$0x.d))).apply($$0, eif::new)
   );
   private final Optional<vb> c;
   private final Optional<ege.b> d;

   private eif(List<ejd> $$0, Optional<vb> $$1, Optional<ege.b> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public ehs b() {
      return eht.l;
   }

   @Override
   public Set<eim<?>> a() {
      return this.d.<Set<eim<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<vb> a(ege $$0, @Nullable ege.b $$1) {
      if ($$1 != null) {
         blf $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ds $$3 = $$2.dd().a(2);
            return $$2x -> {
               try {
                  return ve.a($$3, $$2x, $$2, 0);
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
   public cmh a(cmh $$0, ege $$1) {
      this.c.ifPresent($$2 -> $$0.a(a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static ehq.a<?> a(vb $$0) {
      return a($$1 -> new eif($$1, Optional.of($$0), Optional.empty()));
   }

   public static ehq.a<?> a(vb $$0, ege.b $$1) {
      return a($$2 -> new eif($$2, Optional.of($$0), Optional.of($$1)));
   }
}
