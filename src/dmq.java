import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmq extends dlr implements dmj {
   public static final MapCodec<dmq> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqw.a.fieldOf("block_set_type").forGetter(dlr::k), dmj.a.e.fieldOf("weathering_state").forGetter(dmq::s), u()).apply($$0, dmq::new)
   );
   private final dmj.a n;

   @Override
   public MapCodec<dmq> a() {
      return m;
   }

   protected dmq(dqw $$0, dmj.a $$1, dqg.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dqh $$0) {
      return dmj.c($$0.b()).isPresent();
   }

   public dmj.a s() {
      return this.n;
   }
}
