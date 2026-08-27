import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ecs implements ecw {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ecs> a = RecordCodecBuilder.create($$0 -> $$0.group(agt.a.fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, ecs::new));
   private final agt d;

   public ecs(agt $$0) {
      this.d = $$0;
   }

   @Override
   public sj a(auf $$0, @Nullable sj $$1) {
      sj $$2 = $$1 == null ? new sj() : $$1.h();
      agt.a.encodeStart(sx.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public ecx<?> a() {
      return ecx.d;
   }
}
