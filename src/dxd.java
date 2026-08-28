import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class dxd implements dxl {
   public static final MapCodec<dxd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ja.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, dxd::new));
   public static final ys<ByteBuf, dxd> b = ys.a(ja.b, $$0 -> $$0.e, dxd::new);
   private final ja e;

   public dxd(ja $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<ewh> a(dcg $$0) {
      return Optional.of(ewh.b(this.e));
   }

   @Override
   public dxm<dxd> a() {
      return dxm.a;
   }

   public static class a implements dxm<dxd> {
      @Override
      public MapCodec<dxd> a() {
         return dxd.a;
      }

      @Override
      public ys<ByteBuf, dxd> b() {
         return dxd.b;
      }
   }
}
