import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class enx implements eob {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<enx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aks.a(li.aU).fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, enx::new)
   );
   private final aks<eru> d;

   public enx(aks<eru> $$0) {
      this.d = $$0;
   }

   @Override
   public uk a(ayt $$0, @Nullable uk $$1) {
      uk $$2 = $$1 == null ? new uk() : $$1.h();
      aks.a(li.aU).encodeStart(uy.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public eoc<?> a() {
      return eoc.d;
   }
}
