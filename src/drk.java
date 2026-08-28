import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drk extends dql implements drd {
   public static final MapCodec<drk> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvs.a.fieldOf("block_set_type").forGetter(dql::q), drd.a.e.fieldOf("weathering_state").forGetter(drk::r), t()).apply($$0, drk::new)
   );
   private final drd.a n;

   @Override
   public MapCodec<drk> a() {
      return m;
   }

   protected drk(dvs $$0, drd.a $$1, dvc.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dvd $$0) {
      return drd.c($$0.b()).isPresent();
   }

   public drd.a r() {
      return this.n;
   }
}
