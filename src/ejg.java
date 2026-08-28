import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ejg extends eje {
   public static final MapCodec<ejg> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dvv.a.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(dvv.a).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(dvv.a).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, ejg::new)
   );
   private final float g;
   private final float h;
   private final dvv i;
   private final List<dvv> j;
   private final List<dvv> k;

   public ejg(long $$0, eqy.a $$1, float $$2, float $$3, float $$4, dvv $$5, List<dvv> $$6, List<dvv> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected ejc<?> a() {
      return ejc.c;
   }

   @Override
   public dvv a(azu $$0, jh $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ae.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ae.a(this.k, $$0) : this.i;
      }
   }
}
