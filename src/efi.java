import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class efi extends efg {
   public static final MapCodec<efi> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dsc.b.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(dsc.b).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(dsc.b).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, efi::new)
   );
   private final float g;
   private final float h;
   private final dsc i;
   private final List<dsc> j;
   private final List<dsc> k;

   public efi(long $$0, emy.a $$1, float $$2, float $$3, float $$4, dsc $$5, List<dsc> $$6, List<dsc> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected efe<?> a() {
      return efe.c;
   }

   @Override
   public dsc a(azh $$0, iz $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ac.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ac.a(this.k, $$0) : this.i;
      }
   }
}
