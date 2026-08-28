import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class esj extends erp {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<esj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(euj.a.fieldOf("damage").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.d)))
            .apply($$0, esj::new)
   );
   private final eui c;
   private final boolean d;

   private esj(List<etn> $$0, eui $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public err<esj> b() {
      return ers.n;
   }

   @Override
   public Set<esw<?>> a() {
      return this.c.a();
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      if ($$0.l()) {
         int $$2 = $$0.o();
         float $$3 = this.d ? 1.0F - (float)$$0.n() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - ayu.a(this.c.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(ayu.d($$4 * (float)$$2));
      } else {
         b.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static erp.a<?> a(eui $$0) {
      return a($$1 -> new esj($$1, $$0, false));
   }

   public static erp.a<?> a(eui $$0, boolean $$1) {
      return a($$2 -> new esj($$2, $$0, $$1));
   }
}
