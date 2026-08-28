import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ekz extends ekx {
   public static final MapCodec<ekz> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dxo.a.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(dxo.a).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(dxo.a).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, ekz::new)
   );
   private final float g;
   private final float h;
   private final dxo i;
   private final List<dxo> j;
   private final List<dxo> k;

   public ekz(long $$0, est.a $$1, float $$2, float $$3, float $$4, dxo $$5, List<dxo> $$6, List<dxo> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected ekv<?> a() {
      return ekv.c;
   }

   @Override
   public dxo a(bac $$0, jh $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ae.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ae.a(this.k, $$0) : this.i;
      }
   }
}
