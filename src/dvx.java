import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dvx extends dvv {
   public static final Codec<dvx> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dja.b.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(dja.b).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(dja.b).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, dvx::new)
   );
   private final float g;
   private final float h;
   private final dja i;
   private final List<dja> j;
   private final List<dja> k;

   public dvx(long $$0, edn.a $$1, float $$2, float $$3, float $$4, dja $$5, List<dja> $$6, List<dja> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected dvt<?> a() {
      return dvt.c;
   }

   @Override
   public dja a(aup $$0, hx $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ac.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ac.a(this.k, $$0) : this.i;
      }
   }
}
