import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class epv extends epo {
   public static final MapCodec<epv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, epv::new)
   );
   private final int c;

   private epv(int $$0) {
      this.c = $$0;
   }

   public static epv a(int $$0) {
      return new epv($$0);
   }

   @Override
   protected boolean a(epn $$0, azt $$1, iu $$2) {
      int $$3 = $$0.a(efn.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(efn.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public epq<?> b() {
      return epq.d;
   }
}
