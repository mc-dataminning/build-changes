import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dtt extends dtr {
   public static final Codec<dtt> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dgw.b.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(dgw.b).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(dgw.b).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, dtt::new)
   );
   private final float g;
   private final float h;
   private final dgw i;
   private final List<dgw> j;
   private final List<dgw> k;

   public dtt(long $$0, ebj.a $$1, float $$2, float $$3, float $$4, dgw $$5, List<dgw> $$6, List<dgw> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected dtp<?> a() {
      return dtp.c;
   }

   @Override
   public dgw a(ato $$0, ht $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ac.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ac.a(this.k, $$0) : this.i;
      }
   }
}
