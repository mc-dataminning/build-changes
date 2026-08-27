import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class doy extends dow {
   public static final Codec<doy> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dcb.b.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(dcb.b).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(dcb.b).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, doy::new)
   );
   private final float g;
   private final float h;
   private final dcb i;
   private final List<dcb> j;
   private final List<dcb> k;

   public doy(long $$0, dwh.a $$1, float $$2, float $$3, float $$4, dcb $$5, List<dcb> $$6, List<dcb> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected dou<?> a() {
      return dou.c;
   }

   @Override
   public dcb a(apf $$0, gu $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ac.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ac.a(this.k, $$0) : this.i;
      }
   }
}
