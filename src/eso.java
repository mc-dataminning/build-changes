import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class eso extends eru {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<eso> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(euo.a.fieldOf("damage").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.d)))
            .apply($$0, eso::new)
   );
   private final eun c;
   private final boolean d;

   private eso(List<ets> $$0, eun $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public erw<eso> b() {
      return erx.n;
   }

   @Override
   public Set<etb<?>> a() {
      return this.c.a();
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      if ($$0.l()) {
         int $$2 = $$0.o();
         float $$3 = this.d ? 1.0F - (float)$$0.n() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - ayz.a(this.c.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(ayz.d($$4 * (float)$$2));
      } else {
         b.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static eru.a<?> a(eun $$0) {
      return a($$1 -> new eso($$1, $$0, false));
   }

   public static eru.a<?> a(eun $$0, boolean $$1) {
      return a($$2 -> new eso($$2, $$0, $$1));
   }
}
