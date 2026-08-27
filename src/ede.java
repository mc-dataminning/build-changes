import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ede extends edc {
   public static final Codec<ede> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dpy.b.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(dpy.b).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(dpy.b).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, ede::new)
   );
   private final float g;
   private final float h;
   private final dpy i;
   private final List<dpy> j;
   private final List<dpy> k;

   public ede(long $$0, eku.a $$1, float $$2, float $$3, float $$4, dpy $$5, List<dpy> $$6, List<dpy> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected eda<?> a() {
      return eda.c;
   }

   @Override
   public dpy a(ayd $$0, im $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ac.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ac.a(this.k, $$0) : this.i;
      }
   }
}
