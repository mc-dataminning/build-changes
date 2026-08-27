import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class drv extends drt {
   public static final Codec<drv> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dey.b.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(dey.b).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(dey.b).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, drv::new)
   );
   private final float g;
   private final float h;
   private final dey i;
   private final List<dey> j;
   private final List<dey> k;

   public drv(long $$0, dze.a $$1, float $$2, float $$3, float $$4, dey $$5, List<dey> $$6, List<dey> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected drr<?> a() {
      return drr.c;
   }

   @Override
   public dey a(art $$0, gv $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ac.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ac.a(this.k, $$0) : this.i;
      }
   }
}
