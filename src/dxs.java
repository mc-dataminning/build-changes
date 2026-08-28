import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class dxs implements dya {
   public static final MapCodec<dxs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jd.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, dxs::new));
   public static final yw<ByteBuf, dxs> b = yw.a(jd.b, $$0 -> $$0.e, dxs::new);
   private final jd e;

   public dxs(jd $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<eww> a(dcu $$0) {
      return Optional.of(eww.b(this.e));
   }

   @Override
   public dyb<dxs> a() {
      return dyb.a;
   }

   public static class a implements dyb<dxs> {
      @Override
      public MapCodec<dxs> a() {
         return dxs.a;
      }

      @Override
      public yw<ByteBuf, dxs> b() {
         return dxs.b;
      }
   }
}
