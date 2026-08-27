import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dsb extends drz {
   public static final Codec<dsb> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dfe.b.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(dfe.b).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(dfe.b).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, dsb::new)
   );
   private final float g;
   private final float h;
   private final dfe i;
   private final List<dfe> j;
   private final List<dfe> k;

   public dsb(long $$0, dzk.a $$1, float $$2, float $$3, float $$4, dfe $$5, List<dfe> $$6, List<dfe> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected drx<?> a() {
      return drx.c;
   }

   @Override
   public dfe a(arx $$0, gw $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ac.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ac.a(this.k, $$0) : this.i;
      }
   }
}
