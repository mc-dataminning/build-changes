import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class ecf implements ecn {
   public static final MapCodec<ecf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jh.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, ecf::new));
   public static final zt<ByteBuf, ecf> b = zt.a(jh.b, $$0 -> $$0.e, ecf::new);
   private final jh e;

   public ecf(jh $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<fbs> a(dha $$0) {
      return Optional.of(fbs.b(this.e));
   }

   @Override
   public eco<ecf> a() {
      return eco.a;
   }

   public static class a implements eco<ecf> {
      @Override
      public MapCodec<ecf> a() {
         return ecf.a;
      }

      @Override
      public zt<ByteBuf, ecf> b() {
         return ecf.b;
      }
   }
}
