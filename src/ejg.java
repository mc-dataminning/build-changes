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

public class ejg extends eir {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ejg> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(atx.a(vi.a, "name").forGetter($$0x -> $$0x.c), atx.a(ehf.b.e, "entity").forGetter($$0x -> $$0x.d))).apply($$0, ejg::new)
   );
   private final Optional<vg> c;
   private final Optional<ehf.b> d;

   private ejg(List<eke> $$0, Optional<vg> $$1, Optional<ehf.b> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eit b() {
      return eiu.l;
   }

   @Override
   public Set<ejn<?>> a() {
      return this.d.<Set<ejn<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<vg> a(ehf $$0, @Nullable ehf.b $$1) {
      if ($$1 != null) {
         blw $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ds $$3 = $$2.dd().a(2);
            return $$2x -> {
               try {
                  return vj.a($$3, $$2x, $$2, 0);
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
   public cng a(cng $$0, ehf $$1) {
      this.c.ifPresent($$2 -> $$0.a(a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static eir.a<?> a(vg $$0) {
      return a($$1 -> new ejg($$1, Optional.of($$0), Optional.empty()));
   }

   public static eir.a<?> a(vg $$0, ehf.b $$1) {
      return a($$2 -> new ejg($$2, Optional.of($$0), Optional.of($$1)));
   }
}
