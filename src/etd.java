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

public class etd extends esh {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<etd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ww.a.optionalFieldOf("name").forGetter($$0x -> $$0x.c),
                  equ.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d),
                  etd.a.c.optionalFieldOf("target", etd.a.a).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, etd::new)
   );
   private final Optional<wu> c;
   private final Optional<equ.b> d;
   private final etd.a e;

   private etd(List<euf> $$0, Optional<wu> $$1, Optional<equ.b> $$2, etd.a $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public esj<etd> b() {
      return esk.p;
   }

   @Override
   public Set<etn<?>> a() {
      return this.d.<Set<etn<?>>>map($$0 -> Set.of($$0.a())).orElse(Set.of());
   }

   public static UnaryOperator<wu> a(equ $$0, @Nullable equ.b $$1) {
      if ($$1 != null) {
         bsg $$2 = $$0.c($$1.a());
         if ($$2 != null) {
            eq $$3 = $$2.dh().a(2);
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
   public cuc a(cuc $$0, equ $$1) {
      this.c.ifPresent($$2 -> $$0.b(this.e.a(), a($$1, this.d.orElse(null)).apply($$2)));
      return $$0;
   }

   public static esh.a<?> a(wu $$0, etd.a $$1) {
      return a($$2 -> new etd($$2, Optional.of($$0), Optional.empty(), $$1));
   }

   public static esh.a<?> a(wu $$0, etd.a $$1, equ.b $$2) {
      return a($$3 -> new etd($$3, Optional.of($$0), Optional.of($$2), $$1));
   }

   public static enum a implements azc {
      a("custom_name"),
      b("item_name");

      public static final Codec<etd.a> c = azc.a(etd.a::values);
      private final String d;

      private a(final String $$0) {
         this.d = $$0;
      }

      @Override
      public String c() {
         return this.d;
      }

      public km<wu> a() {
         return switch (this) {
            case a -> kn.g;
            case b -> kn.h;
         };
      }
   }
}
