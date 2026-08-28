import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class eyo extends exv {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<eyo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fao.a.fieldOf("damage").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.d)))
            .apply($$0, eyo::new)
   );
   private final fan c;
   private final boolean d;

   private eyo(List<ezr> $$0, fan $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public exx<eyo> b() {
      return exy.n;
   }

   @Override
   public Set<bbd<?>> a() {
      return this.c.a();
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      if ($$0.m()) {
         int $$2 = $$0.p();
         float $$3 = this.d ? 1.0F - (float)$$0.o() / (float)$$2 : 0.0F;
         float $$4 = 1.0F - azu.a(this.c.b($$1) + $$3, 0.0F, 1.0F);
         $$0.b(azu.d($$4 * (float)$$2));
      } else {
         b.warn("Couldn't set damage of loot item {}", $$0);
      }

      return $$0;
   }

   public static exv.a<?> a(fan $$0) {
      return a($$1 -> new eyo($$1, $$0, false));
   }

   public static exv.a<?> a(fan $$0, boolean $$1) {
      return a($$2 -> new eyo($$2, $$0, $$1));
   }
}
