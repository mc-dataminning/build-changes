import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class ebo implements ebw {
   public static final MapCodec<ebo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ji.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, ebo::new));
   public static final yn<ByteBuf, ebo> b = yn.a(ji.b, $$0 -> $$0.e, ebo::new);
   private final ji e;

   public ebo(ji $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<faz> a(dgh $$0) {
      return Optional.of(faz.b(this.e));
   }

   @Override
   public ebx<ebo> a() {
      return ebx.a;
   }

   public static class a implements ebx<ebo> {
      @Override
      public MapCodec<ebo> a() {
         return ebo.a;
      }

      @Override
      public yn<ByteBuf, ebo> b() {
         return ebo.b;
      }
   }
}
