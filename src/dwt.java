import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class dwt implements dxb {
   public static final MapCodec<dwt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(iz.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, dwt::new));
   public static final zn<ByteBuf, dwt> b = zn.a(iz.b, $$0 -> $$0.e, dwt::new);
   private final iz e;

   public dwt(iz $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<evt> a(dca $$0) {
      return Optional.of(evt.b(this.e));
   }

   @Override
   public dxc<dwt> a() {
      return dxc.a;
   }

   public static class a implements dxc<dwt> {
      @Override
      public MapCodec<dwt> a() {
         return dwt.a;
      }

      @Override
      public zn<ByteBuf, dwt> b() {
         return dwt.b;
      }
   }
}
