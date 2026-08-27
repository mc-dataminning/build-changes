import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dzh implements dzl {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dzh> a = RecordCodecBuilder.create($$0 -> $$0.group(aey.a.fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, dzh::new));
   private final aey d;

   public dzh(aey $$0) {
      this.d = $$0;
   }

   @Override
   public qy a(ase $$0, @Nullable qy $$1) {
      qy $$2 = $$1 == null ? new qy() : $$1.h();
      aey.a.encodeStart(rk.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public dzm<?> a() {
      return dzm.d;
   }
}
