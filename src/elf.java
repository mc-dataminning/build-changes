import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class elf extends eld {
   public static final MapCodec<elf> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dxu.a.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(dxu.a).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(dxu.a).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, elf::new)
   );
   private final float g;
   private final float h;
   private final dxu i;
   private final List<dxu> j;
   private final List<dxu> k;

   public elf(long $$0, esz.a $$1, float $$2, float $$3, float $$4, dxu $$5, List<dxu> $$6, List<dxu> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected elb<?> a() {
      return elb.c;
   }

   @Override
   public dxu a(bam $$0, jh $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ae.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ae.a(this.k, $$0) : this.i;
      }
   }
}
