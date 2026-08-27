import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ejl implements ejp {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ejl> a = RecordCodecBuilder.create($$0 -> $$0.group(ajt.a.fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, ejl::new));
   private final ajt d;

   public ejl(ajt $$0) {
      this.d = $$0;
   }

   @Override
   public tm a(axr $$0, @Nullable tm $$1) {
      tm $$2 = $$1 == null ? new tm() : $$1.h();
      ajt.a.encodeStart(ua.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public ejq<?> a() {
      return ejq.d;
   }
}
