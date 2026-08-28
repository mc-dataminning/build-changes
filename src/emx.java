import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emx extends emq {
   public static final MapCodec<emx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, emx::new)
   );
   private final int c;

   private emx(int $$0) {
      this.c = $$0;
   }

   public static emx a(int $$0) {
      return new emx($$0);
   }

   @Override
   protected boolean a(emp $$0, azg $$1, ji $$2) {
      int $$3 = $$0.a(ecq.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(ecq.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public ems<?> b() {
      return ems.d;
   }
}
