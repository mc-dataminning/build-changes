import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class erk extends eqq {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<erk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  wz.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  epf.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  erk.a.c.optionalFieldOf("target", erk.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, erk::new)
   );
   private final Optional<wx> c;
   private final Optional<epf.b> d;
   private final erk.a e;

   private erk(List<esl> $$0, Optional<wx> $$1, Optional<epf.b> $$2, erk.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public eqs b() {
      return eqt.o;
   }

   @Override
   public Set<eru<?>> a() {
      return this.d.<Set<eru<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<wx> a(epf $$0, @Nullable epf.b $$1) {
      if ($$1 != null) {
         bru $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            ee $$3 = $$2.dg().a(2);
            return $$2x -> {
               try {
                  return xa.a($$3, $$2x, $$2, 0);
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
   public cto a(cto $$0, epf $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static eqq.a<?> a(wx $$0, erk.a $$1) {
      return a($$2 -> new erk($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static eqq.a<?> a(wx $$0, erk.a $$1, epf.b $$2) {
      return a($$3 -> new erk($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements ayx {
      a("custom_name"),
      b("item_name");

      public static final Codec<erk.a> c = ayx.a(erk.a::values);
      private final String d;

      private a(String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public ka<wx> a() {
         return switch (this) {
            case b -> kb.g;
            case a -> kb.f;
         };
      }
   }
}
