import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvz extends duc implements dvt {
   public static final MapCodec<dvz> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvt.a.e.fieldOf("weathering_state").forGetter(dnc::c), dzz.a.fieldOf("base_state").forGetter($$0x -> $$0x.f), t()).apply($$0, dvz::new)
   );
   private final dvt.a h;

   @Override
   public MapCodec<dvz> a() {
      return g;
   }

   public dvz(dvt.a $$0, dzz $$1, dzy.d $$2) {
      super($$1, $$2);
      this.h = $$0;
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dzz $$0) {
      return dvt.c($$0.b()).isPresent();
   }

   public dvt.a q() {
      return this.h;
   }
}
