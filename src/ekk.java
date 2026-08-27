import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ekk implements eko {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ekk> a = RecordCodecBuilder.create($$0 -> $$0.group(akf.a.fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, ekk::new));
   private final akf d;

   public ekk(akf $$0) {
      this.d = $$0;
   }

   @Override
   public ty a(ayd $$0, @Nullable ty $$1) {
      ty $$2 = $$1 == null ? new ty() : $$1.h();
      akf.a.encodeStart(um.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public ekp<?> a() {
      return ekp.d;
   }
}
