import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eoi extends eog {
   public static final MapCodec<eoi> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  eat.a.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  ayu.b(eat.a.listOf()).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  ayu.b(eat.a.listOf()).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, eoi::new)
   );
   private final float g;
   private final float h;
   private final eat i;
   private final List<eat> j;
   private final List<eat> k;

   public eoi(long $$0, ewd.a $$1, float $$2, float $$3, float $$4, eat $$5, List<eat> $$6, List<eat> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected eoe<?> a() {
      return eoe.c;
   }

   @Override
   public eat a(azv $$0, iv $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ag.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ag.a(this.k, $$0) : this.i;
      }
   }
}
