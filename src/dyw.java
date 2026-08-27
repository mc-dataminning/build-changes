import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dyw implements dza {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<dyw> a = RecordCodecBuilder.create($$0 -> $$0.group(aer.a.fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, dyw::new));
   private final aer d;

   public dyw(aer $$0) {
      this.d = $$0;
   }

   @Override
   public qr a(aru $$0, @Nullable qr $$1) {
      qr $$2 = $$1 == null ? new qr() : $$1.h();
      aer.a.encodeStart(rc.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public dzb<?> a() {
      return dzb.d;
   }
}
