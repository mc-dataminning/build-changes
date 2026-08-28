import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class dww implements dxe {
   public static final MapCodec<dww> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ja.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, dww::new));
   public static final ys<ByteBuf, dww> b = ys.a(ja.b, $$0 -> $$0.e, dww::new);
   private final ja e;

   public dww(ja $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<evz> a(dcd $$0) {
      return Optional.of(evz.b(this.e));
   }

   @Override
   public dxf<dww> a() {
      return dxf.a;
   }

   public static class a implements dxf<dww> {
      @Override
      public MapCodec<dww> a() {
         return dww.a;
      }

      @Override
      public ys<ByteBuf, dww> b() {
         return dww.b;
      }
   }
}
