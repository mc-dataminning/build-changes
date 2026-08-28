import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class end extends enb {
   public static final MapCodec<end> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dzo.a.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  ays.b(dzo.a.listOf()).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  ays.b(dzo.a.listOf()).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, end::new)
   );
   private final float g;
   private final float h;
   private final dzo i;
   private final List<dzo> j;
   private final List<dzo> k;

   public end(long $$0, euy.a $$1, float $$2, float $$3, float $$4, dzo $$5, List<dzo> $$6, List<dzo> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected emz<?> a() {
      return emz.c;
   }

   @Override
   public dzo a(azt $$0, iu $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return af.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? af.a(this.k, $$0) : this.i;
      }
   }
}
