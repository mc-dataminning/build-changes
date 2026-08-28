import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvy extends dtl implements dvt {
   public static final MapCodec<dvy> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvt.a.e.fieldOf("weathering_state").forGetter(dnc::c), t()).apply($$0, dvy::new)
   );
   private final dvt.a e;

   @Override
   public MapCodec<dvy> a() {
      return d;
   }

   public dvy(dvt.a $$0, dzy.d $$1) {
      super($$1);
      this.e = $$0;
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
      return this.e;
   }
}
