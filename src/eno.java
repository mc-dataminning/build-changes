import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eno extends enm {
   public static final MapCodec<eno> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dzz.a.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  ayu.b(dzz.a.listOf()).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  ayu.b(dzz.a.listOf()).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, eno::new)
   );
   private final float g;
   private final float h;
   private final dzz i;
   private final List<dzz> j;
   private final List<dzz> k;

   public eno(long $$0, evj.a $$1, float $$2, float $$3, float $$4, dzz $$5, List<dzz> $$6, List<dzz> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected enk<?> a() {
      return enk.c;
   }

   @Override
   public dzz a(azv $$0, iu $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return af.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? af.a(this.k, $$0) : this.i;
      }
   }
}
