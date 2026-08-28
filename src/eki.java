import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eki extends ekg {
   public static final MapCodec<eki> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dwx.a.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  ayi.b(dwx.a.listOf()).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  ayi.b(dwx.a.listOf()).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, eki::new)
   );
   private final float g;
   private final float h;
   private final dwx i;
   private final List<dwx> j;
   private final List<dwx> k;

   public eki(long $$0, esc.a $$1, float $$2, float $$3, float $$4, dwx $$5, List<dwx> $$6, List<dwx> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected eke<?> a() {
      return eke.c;
   }

   @Override
   public dwx a(azh $$0, ji $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return af.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? af.a(this.k, $$0) : this.i;
      }
   }
}
