import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class emm implements emq {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<emm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ald.a(lq.aU).fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, emm::new)
   );
   private final ald<eql> d;

   public emm(ald<eql> $$0) {
      this.d = $$0;
   }

   @Override
   public ur a(azf $$0, @Nullable ur $$1) {
      ur $$2 = $$1 == null ? new ur() : $$1.h();
      ald.a(lq.aU).encodeStart(vf.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public emr<?> a() {
      return emr.d;
   }
}
