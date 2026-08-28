import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqw extends dpx implements dqp {
   public static final MapCodec<dqw> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvd.a.fieldOf("block_set_type").forGetter(dpx::l), dqp.a.e.fieldOf("weathering_state").forGetter(dqw::m), u()).apply($$0, dqw::new)
   );
   private final dqp.a n;

   @Override
   public MapCodec<dqw> a() {
      return m;
   }

   protected dqw(dvd $$0, dqp.a $$1, dun.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(duo $$0) {
      return dqp.c($$0.b()).isPresent();
   }

   public dqp.a m() {
      return this.n;
   }
}
