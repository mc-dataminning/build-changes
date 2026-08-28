import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class dyt implements dzb {
   public static final MapCodec<dyt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(je.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, dyt::new));
   public static final zb<ByteBuf, dyt> b = zb.a(je.b, $$0 -> $$0.e, dyt::new);
   private final je e;

   public dyt(je $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<eye> a(dds $$0) {
      return Optional.of(eye.b(this.e));
   }

   @Override
   public dzc<dyt> a() {
      return dzc.a;
   }

   public static class a implements dzc<dyt> {
      @Override
      public MapCodec<dyt> a() {
         return dyt.a;
      }

      @Override
      public zb<ByteBuf, dyt> b() {
         return dyt.b;
      }
   }
}
