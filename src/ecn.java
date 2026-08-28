import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class ecn implements ecv {
   public static final MapCodec<ecn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jh.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, ecn::new));
   public static final zt<ByteBuf, ecn> b = zt.a(jh.b, $$0 -> $$0.e, ecn::new);
   private final jh e;

   public ecn(jh $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<fby> a(dhi $$0) {
      return Optional.of(fby.b(this.e));
   }

   @Override
   public ecw<ecn> a() {
      return ecw.a;
   }

   public static class a implements ecw<ecn> {
      @Override
      public MapCodec<ecn> a() {
         return ecn.a;
      }

      @Override
      public zt<ByteBuf, ecn> b() {
         return ecn.b;
      }
   }
}
