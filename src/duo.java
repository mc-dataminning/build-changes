import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duo extends dtp implements duh {
   public static final MapCodec<duo> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dzb.a.fieldOf("block_set_type").forGetter(dtp::q), duh.a.e.fieldOf("weathering_state").forGetter(duo::r), t()).apply($$0, duo::new)
   );
   private final duh.a h;

   @Override
   public MapCodec<duo> a() {
      return g;
   }

   protected duo(dzb $$0, duh.a $$1, dyl.d $$2) {
      super($$0, $$2);
      this.h = $$1;
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dym $$0) {
      return duh.c($$0.b()).isPresent();
   }

   public duh.a r() {
      return this.h;
   }
}
