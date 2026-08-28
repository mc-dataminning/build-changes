import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dre extends djm implements drd {
   public static final MapCodec<dre> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drd.a.e.fieldOf("weathering_state").forGetter(dre::q), t()).apply($$0, dre::new)
   );
   private final drd.a e;

   @Override
   protected MapCodec<dre> a() {
      return d;
   }

   public dre(drd.a $$0, dvc.d $$1) {
      super($$1);
      this.e = $$0;
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
      return this.e;
   }
}
