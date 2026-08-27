import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eeh extends eef {
   public static final MapCodec<eeh> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  drb.b.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(drb.b).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(drb.b).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, eeh::new)
   );
   private final float g;
   private final float h;
   private final drb i;
   private final List<drb> j;
   private final List<drb> k;

   public eeh(long $$0, elx.a $$1, float $$2, float $$3, float $$4, drb $$5, List<drb> $$6, List<drb> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected eed<?> a() {
      return eed.c;
   }

   @Override
   public drb a(ayk $$0, io $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ac.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ac.a(this.k, $$0) : this.i;
      }
   }
}
