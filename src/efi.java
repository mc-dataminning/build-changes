import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class efi implements efm {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<efi> a = RecordCodecBuilder.create($$0 -> $$0.group(aiy.a.fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, efi::new));
   private final aiy d;

   public efi(aiy $$0) {
      this.d = $$0;
   }

   @Override
   public sw a(awo $$0, @Nullable sw $$1) {
      sw $$2 = $$1 == null ? new sw() : $$1.h();
      aiy.a.encodeStart(tk.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public efn<?> a() {
      return efn.d;
   }
}
