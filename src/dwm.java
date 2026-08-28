import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class dwm implements dwu {
   public static final MapCodec<dwm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(iz.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, dwm::new));
   public static final zj<ByteBuf, dwm> b = zj.a(iz.b, $$0 -> $$0.e, dwm::new);
   private final iz e;

   public dwm(iz $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<evm> a(dbt $$0) {
      return Optional.of(evm.b(this.e));
   }

   @Override
   public dwv<dwm> a() {
      return dwv.a;
   }

   public static class a implements dwv<dwm> {
      @Override
      public MapCodec<dwm> a() {
         return dwm.a;
      }

      @Override
      public zj<ByteBuf, dwm> b() {
         return dwm.b;
      }
   }
}
