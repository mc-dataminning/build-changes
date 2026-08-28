import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esq implements esu {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<esq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aly.a(mb.bg).fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, esq::new)
   );
   private final aly<ewu> d;

   public esq(aly<ewu> $$0) {
      this.d = $$0;
   }

   @Override
   public ux a(bam $$0, @Nullable ux $$1) {
      ux $$2 = $$1 == null ? new ux() : $$1.i();
      aly.a(mb.bg).encodeStart(vl.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public esv<?> a() {
      return esv.d;
   }
}
