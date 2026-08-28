import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class eyu extends eyb {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<eyu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fau.a.fieldOf("damage").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.d)))
            .apply($$0, eyu::new)
   );
   private final fat c;
   private final boolean d;

   private eyu(List<ezx> $$0, fat $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eyd<eyu> b() {
      return eye.n;
   }

   @Override
   public Set<bbn<?>> a() {
      return this.c.a();
   }

   @Override
   public cxo a(cxo $$0, ewo $$1) {
      if ($$0.m()) {
         int $$2 = $$0.p();
         float $$3 = this.d ? 1.0F - (float)$$0.o() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - bae.a(this.c.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(bae.d($$4 * (float)$$2));
      } else {
         b.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static eyb.a<?> a(fat $$0) {
      return a($$1 -> new eyu($$1, $$0, false));
   }

   public static eyb.a<?> a(fat $$0, boolean $$1) {
      return a($$2 -> new eyu($$2, $$0, $$1));
   }
}
