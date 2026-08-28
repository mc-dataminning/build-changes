import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class eug extends eva {
   public static final MapCodec<eug> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jt.a(mg.i).optionalFieldOf("rottable_blocks").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("integrity").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eug::new)
   );
   private final Optional<ji<dmf>> b;
   private final float c;

   public eug(ji<dmf> $$0, float $$1) {
      this(Optional.of($$0), $$1);
   }

   public eug(float $$0) {
      this(Optional.empty(), $$0);
   }

   private eug(Optional<ji<dmf>> $$0, float $$1) {
      this.c = $$1;
      this.b = $$0;
   }

   @Nullable
   @Override
   public evd.d a(djd $$0, iu $$1, iu $$2, evd.d $$3, evd.d $$4, euz $$5) {
      azv $$6 = $$5.b($$4.a());
      return (!this.b.isPresent() || $$3.b().a(this.b.get())) && !($$6.i() <= this.c) ? null : $$4;
   }

   @Override
   protected evc<?> a() {
      return evc.f;
   }
}
