import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esj implements esn {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<esj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alo.a(mb.bg).fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, esj::new)
   );
   private final alo<ewn> d;

   public esj(alo<ewn> $$0) {
      this.d = $$0;
   }

   @Override
   public um a(bac $$0, @Nullable um $$1) {
      um $$2 = $$1 == null ? new um() : $$1.i();
      alo.a(mb.bg).encodeStart(va.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public eso<?> a() {
      return eso.d;
   }
}
