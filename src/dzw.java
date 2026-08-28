import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class dzw implements eae {
   public static final MapCodec<dzw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jg.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, dzw::new));
   public static final zf<ByteBuf, dzw> b = zf.a(jg.b, $$0 -> $$0.e, dzw::new);
   private final jg e;

   public dzw(jg $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<ezh> a(dev $$0) {
      return Optional.of(ezh.b(this.e));
   }

   @Override
   public eaf<dzw> a() {
      return eaf.a;
   }

   public static class a implements eaf<dzw> {
      @Override
      public MapCodec<dzw> a() {
         return dzw.a;
      }

      @Override
      public zf<ByteBuf, dzw> b() {
         return dzw.b;
      }
   }
}
