import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmp extends dky implements dmj {
   public static final MapCodec<dmp> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dmj.a.e.fieldOf("weathering_state").forGetter(def::c), dqh.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dmp::new)
   );
   private final dmj.a J;

   @Override
   public MapCodec<dmp> a() {
      return I;
   }

   public dmp(dmj.a $$0, dqh $$1, dqg.d $$2) {
      super($$1, $$2);
      this.J = $$0;
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
      return this.J;
   }
}
