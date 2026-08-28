import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class ecm implements ecu {
   public static final MapCodec<ecm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jh.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, ecm::new));
   public static final zt<ByteBuf, ecm> b = zt.a(jh.b, $$0 -> $$0.e, ecm::new);
   private final jh e;

   public ecm(jh $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<fbx> a(dhh $$0) {
      return Optional.of(fbx.b(this.e));
   }

   @Override
   public ecv<ecm> a() {
      return ecv.a;
   }

   public static class a implements ecv<ecm> {
      @Override
      public MapCodec<ecm> a() {
         return ecm.a;
      }

      @Override
      public zt<ByteBuf, ecm> b() {
         return ecm.b;
      }
   }
}
