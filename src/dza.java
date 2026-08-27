import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dza implements dze {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dza> a = RecordCodecBuilder.create($$0 -> $$0.group(aeu.a.fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, dza::new));
   private final aeu d;

   public dza(aeu $$0) {
      this.d = $$0;
   }

   @Override
   public qu a(arx $$0, @Nullable qu $$1) {
      qu $$2 = $$1 == null ? new qu() : $$1.h();
      aeu.a.encodeStart(rf.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public dzf<?> a() {
      return dzf.d;
   }
}
