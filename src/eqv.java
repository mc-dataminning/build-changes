import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eqv extends eqo {
   public static final MapCodec<eqv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, eqv::new)
   );
   private final int c;

   private eqv(int $$0) {
      this.c = $$0;
   }

   public static eqv a(int $$0) {
      return new eqv($$0);
   }

   @Override
   protected boolean a(eqn $$0, azv $$1, iv $$2) {
      int $$3 = $$0.a(egn.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(egn.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public eqq<?> b() {
      return eqq.d;
   }
}
