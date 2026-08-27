import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dml extends dfk implements dmj {
   public static final MapCodec<dml> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqw.a.fieldOf("block_set_type").forGetter(dfk::b), dmj.a.e.fieldOf("weathering_state").forGetter(dml::k), u()).apply($$0, dml::new)
   );
   private final dmj.a m;

   @Override
   public MapCodec<dml> a() {
      return l;
   }

   protected dml(dqw $$0, dmj.a $$1, dqg.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$0.c(dfk.f) == drd.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(dqh $$0) {
      return dmj.c($$0.b()).isPresent();
   }

   public dmj.a k() {
      return this.m;
   }
}
