import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eph extends epf {
   public static final MapCodec<eph> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  ebq.a.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  azg.b(ebq.a.listOf()).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  azg.b(ebq.a.listOf()).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, eph::new)
   );
   private final float g;
   private final float h;
   private final ebq i;
   private final List<ebq> j;
   private final List<ebq> k;

   public eph(long $$0, exd.a $$1, float $$2, float $$3, float $$4, ebq $$5, List<ebq> $$6, List<ebq> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected epd<?> a() {
      return epd.c;
   }

   @Override
   public ebq a(bai $$0, iw $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ag.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ag.a(this.k, $$0) : this.i;
      }
   }
}
