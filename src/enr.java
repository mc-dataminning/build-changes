import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class enr implements env {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<enr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akp.a(lu.bc).fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, enr::new)
   );
   private final akp<erq> d;

   public enr(akp<erq> $$0) {
      this.d = $$0;
   }

   @Override
   public ua a(ayv $$0, @Nullable ua $$1) {
      ua $$2 = $$1 == null ? new ua() : $$1.i();
      akp.a(lu.bc).encodeStart(uo.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public enw<?> a() {
      return enw.d;
   }
}
