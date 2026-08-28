import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqz extends dqa implements dqs {
   public static final MapCodec<dqz> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvh.a.fieldOf("block_set_type").forGetter(dqa::l), dqs.a.e.fieldOf("weathering_state").forGetter(dqz::m), t()).apply($$0, dqz::new)
   );
   private final dqs.a n;

   @Override
   public MapCodec<dqz> a() {
      return m;
   }

   protected dqz(dvh $$0, dqs.a $$1, dur.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dus $$0) {
      return dqs.c($$0.b()).isPresent();
   }

   public dqs.a m() {
      return this.n;
   }
}
