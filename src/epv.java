import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class epv extends epx {
   public static final MapCodec<epv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvo.a.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, epv::new)
   );
   private final dvo b;
   private final float d;

   public epv(dvo $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dvo $$0, azv $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected epy<?> a() {
      return epy.f;
   }
}
