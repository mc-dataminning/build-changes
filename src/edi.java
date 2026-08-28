import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class edi implements edq {
   public static final MapCodec<edi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jj.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, edi::new));
   public static final yt<ByteBuf, edi> b = yt.a(jj.b, $$0 -> $$0.e, edi::new);
   private final jj e;

   public edi(jj $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<fcu> a(dhp $$0) {
      return Optional.of(fcu.b(this.e));
   }

   @Override
   public edr<edi> a() {
      return edr.a;
   }

   public static class a implements edr<edi> {
      @Override
      public MapCodec<edi> a() {
         return edi.a;
      }

      @Override
      public yt<ByteBuf, edi> b() {
         return edi.b;
      }
   }
}
