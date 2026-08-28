import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class efp implements efx {
   public static final MapCodec<efp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(iv.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, efp::new));
   public static final yw<ByteBuf, efp> b = yw.a(iv.b, $$0 -> $$0.e, efp::new);
   private final iv e;

   public efp(iv $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<ffc> a(djm $$0) {
      return Optional.of(ffc.b(this.e));
   }

   @Override
   public efy<efp> a() {
      return efy.a;
   }

   public static class a implements efy<efp> {
      @Override
      public MapCodec<efp> a() {
         return efp.a;
      }

      @Override
      public yw<ByteBuf, efp> b() {
         return efp.b;
      }
   }
}
