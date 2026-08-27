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

public class eiw extends eih {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eiw> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(atv.a(vh.a, "name").forGetter($$0x -> $$0x.c), atv.a(egv.b.e, "entity").forGetter($$0x -> $$0x.d))).apply($$0, eiw::new)
   );
   private final Optional<vf> c;
   private final Optional<egv.b> d;

   private eiw(List<eju> $$0, Optional<vf> $$1, Optional<egv.b> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eij b() {
      return eik.l;
   }

   @Override
   public Set<ejd<?>> a() {
      return this.d.<Set<ejd<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<vf> a(egv $$0, @Nullable egv.b $$1) {
      if ($$1 != null) {
         blu $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ds $$3 = $$2.dd().a(2);
            return $$2x -> {
               try {
                  return vi.a($$3, $$2x, $$2, 0);
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
   public cmx a(cmx $$0, egv $$1) {
      this.c.ifPresent($$2 -> $$0.a(a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static eih.a<?> a(vf $$0) {
      return a($$1 -> new eiw($$1, Optional.of($$0), Optional.empty()));
   }

   public static eih.a<?> a(vf $$0, egv.b $$1) {
      return a($$2 -> new eiw($$2, Optional.of($$0), Optional.of($$1)));
   }
}
