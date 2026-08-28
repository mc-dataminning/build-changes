import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class eev implements efd {
   public static final MapCodec<eev> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(iu.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, eev::new));
   public static final yw<ByteBuf, eev> b = yw.a(iu.b, $$0 -> $$0.e, eev::new);
   private final iu e;

   public eev(iu $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<fei> a(div $$0) {
      return Optional.of(fei.b(this.e));
   }

   @Override
   public efe<eev> a() {
      return efe.a;
   }

   public static class a implements efe<eev> {
      @Override
      public MapCodec<eev> a() {
         return eev.a;
      }

      @Override
      public yw<ByteBuf, eev> b() {
         return eev.b;
      }
   }
}
