import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class dxv implements dyd {
   public static final MapCodec<dxv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jd.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, dxv::new));
   public static final yx<ByteBuf, dxv> b = yx.a(jd.b, $$0 -> $$0.e, dxv::new);
   private final jd e;

   public dxv(jd $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<exa> a(dcw $$0) {
      return Optional.of(exa.b(this.e));
   }

   @Override
   public dye<dxv> a() {
      return dye.a;
   }

   public static class a implements dye<dxv> {
      @Override
      public MapCodec<dxv> a() {
         return dxv.a;
      }

      @Override
      public yx<ByteBuf, dxv> b() {
         return dxv.b;
      }
   }
}
