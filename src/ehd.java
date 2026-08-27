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

public class ehd extends ego {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ehd> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(asy.a(ux.a, "name").forGetter($$0x -> $$0x.c), asy.a(efc.b.e, "entity").forGetter($$0x -> $$0x.d))).apply($$0, ehd::new)
   );
   private final Optional<uv> c;
   private final Optional<efc.b> d;

   private ehd(List<eib> $$0, Optional<uv> $$1, Optional<efc.b> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public egq b() {
      return egr.l;
   }

   @Override
   public Set<ehk<?>> a() {
      return this.d.<Set<ehk<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<uv> a(efc $$0, @Nullable efc.b $$1) {
      if ($$1 != null) {
         bkv $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            du $$3 = $$2.de().a(2);
            return $$2x -> {
               try {
                  return uy.a($$3, $$2x, $$2, 0);
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
   public clo a(clo $$0, efc $$1) {
      this.c.ifPresent($$2 -> $$0.a(a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static ego.a<?> a(uv $$0) {
      return a($$1 -> new ehd($$1, Optional.of($$0), Optional.empty()));
   }

   public static ego.a<?> a(uv $$0, efc.b $$1) {
      return a($$2 -> new ehd($$2, Optional.of($$0), Optional.of($$1)));
   }
}
