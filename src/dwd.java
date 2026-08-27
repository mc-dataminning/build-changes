import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dwd extends dwb {
   public static final Codec<dwd> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  djg.b.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(djg.b).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(djg.b).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, dwd::new)
   );
   private final float g;
   private final float h;
   private final djg i;
   private final List<djg> j;
   private final List<djg> k;

   public dwd(long $$0, edt.a $$1, float $$2, float $$3, float $$4, djg $$5, List<djg> $$6, List<djg> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected dvz<?> a() {
      return dvz.c;
   }

   @Override
   public djg a(auu $$0, hx $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ac.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ac.a(this.k, $$0) : this.i;
      }
   }
}
