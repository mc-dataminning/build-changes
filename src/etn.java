import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class etn extends euh {
   public static final MapCodec<etn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jt.a(mg.i).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, etn::new)
   );
   private final Optional<ji<dlu>> b;
   private final float c;

   public etn(ji<dlu> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public etn(float $$0) {
      this(Optional.empty(), $$0);
   }

   private etn(Optional<ji<dlu>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public euk.d a(dis $$0, iu $$1, iu $$2, euk.d $$3, euk.d $$4, eug $$5) {
      azt $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected euj<?> a() {
      return euj.f;
   }
}
