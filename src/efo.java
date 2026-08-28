import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class efo extends efm {
   public static final MapCodec<efo> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dsh.b.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(dsh.b).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(dsh.b).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, efo::new)
   );
   private final float g;
   private final float h;
   private final dsh i;
   private final List<dsh> j;
   private final List<dsh> k;

   public efo(long $$0, ene.a $$1, float $$2, float $$3, float $$4, dsh $$5, List<dsh> $$6, List<dsh> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected efk<?> a() {
      return efk.c;
   }

   @Override
   public dsh a(aym $$0, ja $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ac.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ac.a(this.k, $$0) : this.i;
      }
   }
}
