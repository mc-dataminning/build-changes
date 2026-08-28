import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class euz extends eug {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<euz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(exb.a.fieldOf("damage").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.d)))
            .apply($$0, euz::new)
   );
   private final exa c;
   private final boolean d;

   private euz(List<ewe> $$0, exa $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eui<euz> b() {
      return euj.n;
   }

   @Override
   public Set<evm<?>> a() {
      return this.c.a();
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      if ($$0.m()) {
         int $$2 = $$0.p();
         float $$3 = this.d ? 1.0F - (float)$$0.o() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - azc.a(this.c.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(azc.d($$4 * (float)$$2));
      } else {
         b.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static eug.a<?> a(exa $$0) {
      return a($$1 -> new euz($$1, $$0, false));
   }

   public static eug.a<?> a(exa $$0, boolean $$1) {
      return a($$2 -> new euz($$2, $$0, $$1));
   }
}
