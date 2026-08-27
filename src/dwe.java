import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dwe extends dwc {
   public static final Codec<dwe> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  djh.b.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(djh.b).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(djh.b).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, dwe::new)
   );
   private final float g;
   private final float h;
   private final djh i;
   private final List<djh> j;
   private final List<djh> k;

   public dwe(long $$0, edu.a $$1, float $$2, float $$3, float $$4, djh $$5, List<djh> $$6, List<djh> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected dwa<?> a() {
      return dwa.c;
   }

   @Override
   public djh a(auv $$0, hx $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ac.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ac.a(this.k, $$0) : this.i;
      }
   }
}
