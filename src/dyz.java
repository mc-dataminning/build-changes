import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dyz implements dzd {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dyz> a = RecordCodecBuilder.create($$0 -> $$0.group(aez.a.fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, dyz::new));
   private final aez d;

   public dyz(aez $$0) {
      this.d = $$0;
   }

   @Override
   public qw a(ash $$0, @Nullable qw $$1) {
      qw $$2 = $$1 == null ? new qw() : $$1.h();
      aez.a.encodeStart(ri.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public dze<?> a() {
      return dze.d;
   }
}
