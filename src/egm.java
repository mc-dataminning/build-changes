import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class egm implements egu {
   public static final MapCodec<egm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(iw.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, egm::new));
   public static final ze<ByteBuf, egm> b = ze.a(iw.b, $$0 -> $$0.e, egm::new);
   private final iw e;

   public egm(iw $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<fgc> a(dkj $$0) {
      return Optional.of(fgc.b(this.e));
   }

   @Override
   public egv<egm> a() {
      return egv.a;
   }

   public static class a implements egv<egm> {
      @Override
      public MapCodec<egm> a() {
         return egm.a;
      }

      @Override
      public ze<ByteBuf, egm> b() {
         return egm.b;
      }
   }
}
