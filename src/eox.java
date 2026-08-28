import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eox extends eov {
   public static final MapCodec<eox> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  ebg.a.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  ayy.b(ebg.a.listOf()).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  ayy.b(ebg.a.listOf()).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, eox::new)
   );
   private final float g;
   private final float h;
   private final ebg i;
   private final List<ebg> j;
   private final List<ebg> k;

   public eox(long $$0, ewt.a $$1, float $$2, float $$3, float $$4, ebg $$5, List<ebg> $$6, List<ebg> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected eot<?> a() {
      return eot.c;
   }

   @Override
   public ebg a(azz $$0, iw $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ag.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ag.a(this.k, $$0) : this.i;
      }
   }
}
