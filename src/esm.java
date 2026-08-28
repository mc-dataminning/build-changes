import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class esm extends ers {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<esm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eum.a.fieldOf("damage").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.d)))
            .apply($$0, esm::new)
   );
   private final eul c;
   private final boolean d;

   private esm(List<etq> $$0, eul $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eru<esm> b() {
      return erv.n;
   }

   @Override
   public Set<esz<?>> a() {
      return this.c.a();
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      if ($$0.l()) {
         int $$2 = $$0.o();
         float $$3 = this.d ? 1.0F - (float)$$0.n() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - ayx.a(this.c.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(ayx.d($$4 * (float)$$2));
      } else {
         b.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static ers.a<?> a(eul $$0) {
      return a($$1 -> new esm($$1, $$0, false));
   }

   public static ers.a<?> a(eul $$0, boolean $$1) {
      return a($$2 -> new esm($$2, $$0, $$1));
   }
}
