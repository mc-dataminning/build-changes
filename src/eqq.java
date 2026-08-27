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

public class eqq extends epw {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<eqq> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and($$0.group(axh.a(ww.a, "name").forGetter($$0x -> $$0x.c), axh.a(eol.b.e, "entity").forGetter($$0x -> $$0x.d))).apply($$0, eqq::new)
   );
   private final Optional<wu> c;
   private final Optional<eol.b> d;

   private eqq(List<erq> $$0, Optional<wu> $$1, Optional<eol.b> $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public epy b() {
      return epz.o;
   }

   @Override
   public Set<eqz<?>> a() {
      return this.d.<Set<eqz<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<wu> a(eol $$0, @Nullable eol.b $$1) {
      if ($$1 != null) {
         brh $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ed $$3 = $$2.de().a(2);
            return $$2x -> {
               try {
                  return wx.a($$3, $$2x, $$2, 0);
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
   public csz a(csz $$0, eol $$1) {
      this.c.ifPresent($$2 -> $$0.b(ka.f, a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static epw.a<?> a(wu $$0) {
      return a($$1 -> new eqq($$1, Optional.of($$0), Optional.empty()));
   }

   public static epw.a<?> a(wu $$0, eol.b $$1) {
      return a($$2 -> new eqq($$2, Optional.of($$0), Optional.of($$1)));
   }
}
