import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class duf extends dud {
   public static final Codec<duf> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dhi.b.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(dhi.b).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(dhi.b).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, duf::new)
   );
   private final float g;
   private final float h;
   private final dhi i;
   private final List<dhi> j;
   private final List<dhi> k;

   public duf(long $$0, ebv.a $$1, float $$2, float $$3, float $$4, dhi $$5, List<dhi> $$6, List<dhi> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected dub<?> a() {
      return dub.c;
   }

   @Override
   public dhi a(ats $$0, ht $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ac.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ac.a(this.k, $$0) : this.i;
      }
   }
}
