import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ekj extends ekh {
   public static final MapCodec<ekj> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dwy.a.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  ayi.b(dwy.a.listOf()).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  ayi.b(dwy.a.listOf()).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, ekj::new)
   );
   private final float g;
   private final float h;
   private final dwy i;
   private final List<dwy> j;
   private final List<dwy> k;

   public ekj(long $$0, esd.a $$1, float $$2, float $$3, float $$4, dwy $$5, List<dwy> $$6, List<dwy> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected ekf<?> a() {
      return ekf.c;
   }

   @Override
   public dwy a(azh $$0, ji $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return af.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? af.a(this.k, $$0) : this.i;
      }
   }
}
