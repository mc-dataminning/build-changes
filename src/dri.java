import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dri extends dpb implements drd {
   public static final MapCodec<dri> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drd.a.e.fieldOf("weathering_state").forGetter(diz::c), t()).apply($$0, dri::new)
   );
   private final drd.a g;

   @Override
   public MapCodec<dri> a() {
      return f;
   }

   public dri(drd.a $$0, dvc.d $$1) {
      super($$1);
      this.g = $$0;
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dvd $$0) {
      return drd.c($$0.b()).isPresent();
   }

   public drd.a q() {
      return this.g;
   }
}
