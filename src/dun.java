import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dun extends dsu implements duh {
   public static final MapCodec<dun> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(duh.a.e.fieldOf("weathering_state").forGetter(dlw::c), dym.a.fieldOf("base_state").forGetter($$0x -> $$0x.f), t()).apply($$0, dun::new)
   );
   private final duh.a h;

   @Override
   public MapCodec<dun> a() {
      return g;
   }

   public dun(duh.a $$0, dym $$1, dyl.d $$2) {
      super($$1, $$2);
      this.h = $$0;
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dym $$0) {
      return duh.c($$0.b()).isPresent();
   }

   public duh.a q() {
      return this.h;
   }
}
