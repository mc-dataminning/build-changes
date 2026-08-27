import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dzf implements dzj {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dzf> a = RecordCodecBuilder.create($$0 -> $$0.group(aew.a.fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, dzf::new));
   private final aew d;

   public dzf(aew $$0) {
      this.d = $$0;
   }

   @Override
   public qw a(asc $$0, @Nullable qw $$1) {
      qw $$2 = $$1 == null ? new qw() : $$1.h();
      aew.a.encodeStart(ri.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public dzk<?> a() {
      return dzk.d;
   }
}
