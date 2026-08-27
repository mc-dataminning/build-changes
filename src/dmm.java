import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmm extends dde implements dmj {
   public static final MapCodec<dmm> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dmj.a.e.fieldOf("weathering_state").forGetter(def::c), u()).apply($$0, dmm::new)
   );
   private final dmj.a e;

   @Override
   public MapCodec<dmm> a() {
      return d;
   }

   public dmm(dmj.a $$0, dqg.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dqh $$0) {
      return dmj.c($$0.b()).isPresent();
   }

   public dmj.a k() {
      return this.e;
   }
}
