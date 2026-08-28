import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class ecg implements eco {
   public static final MapCodec<ecg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jh.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, ecg::new));
   public static final zi<ByteBuf, ecg> b = zi.a(jh.b, $$0 -> $$0.e, ecg::new);
   private final jh e;

   public ecg(jh $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<fbr> a(dgz $$0) {
      return Optional.of(fbr.b(this.e));
   }

   @Override
   public ecp<ecg> a() {
      return ecp.a;
   }

   public static class a implements ecp<ecg> {
      @Override
      public MapCodec<ecg> a() {
         return ecg.a;
      }

      @Override
      public zi<ByteBuf, ecg> b() {
         return ecg.b;
      }
   }
}
