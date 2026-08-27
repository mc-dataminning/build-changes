import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dwm extends dwk {
   public static final Codec<dwm> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  djp.b.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(djp.b).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(djp.b).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, dwm::new)
   );
   private final float g;
   private final float h;
   private final djp i;
   private final List<djp> j;
   private final List<djp> k;

   public dwm(long $$0, eec.a $$1, float $$2, float $$3, float $$4, djp $$5, List<djp> $$6, List<djp> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected dwi<?> a() {
      return dwi.c;
   }

   @Override
   public djp a(auw $$0, hx $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ac.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ac.a(this.k, $$0) : this.i;
      }
   }
}
