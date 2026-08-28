import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class epx implements eqb {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<epx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alg.a(ly.bd).fieldOf("loot_table").forGetter($$0x -> $$0x.d)).apply($$0, epx::new)
   );
   private final alg<eub> d;

   public epx(alg<eub> $$0) {
      this.d = $$0;
   }

   @Override
   public uj a(azr $$0, @Nullable uj $$1) {
      uj $$2 = $$1 == null ? new uj() : $$1.i();
      alg.a(ly.bd).encodeStart(ux.a, this.d).resultOrPartial(b::error).ifPresent($$1x -> $$2.a("LootTable", $$1x));
      $$2.a("LootTableSeed", $$0.g());
      return $$2;
   }

   @Override
   public eqc<?> a() {
      return eqc.d;
   }
}
