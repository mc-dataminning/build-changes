import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dsa extends dry {
   public static final Codec<dsa> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dfd.b.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(dfd.b).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(dfd.b).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, dsa::new)
   );
   private final float g;
   private final float h;
   private final dfd i;
   private final List<dfd> j;
   private final List<dfd> k;

   public dsa(long $$0, dzj.a $$1, float $$2, float $$3, float $$4, dfd $$5, List<dfd> $$6, List<dfd> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected drw<?> a() {
      return drw.c;
   }

   @Override
   public dfd a(ash $$0, gw $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ac.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ac.a(this.k, $$0) : this.i;
      }
   }
}
