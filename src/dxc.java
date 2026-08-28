import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class dxc implements dxk {
   public static final MapCodec<dxc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ja.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, dxc::new));
   public static final ys<ByteBuf, dxc> b = ys.a(ja.b, $$0 -> $$0.e, dxc::new);
   private final ja e;

   public dxc(ja $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<ewf> a(dcf $$0) {
      return Optional.of(ewf.b(this.e));
   }

   @Override
   public dxl<dxc> a() {
      return dxl.a;
   }

   public static class a implements dxl<dxc> {
      @Override
      public MapCodec<dxc> a() {
         return dxc.a;
      }

      @Override
      public ys<ByteBuf, dxc> b() {
         return dxc.b;
      }
   }
}
