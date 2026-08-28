import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class egc implements egk {
   public static final MapCodec<egc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(iw.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, egc::new));
   public static final za<ByteBuf, egc> b = za.a(iw.b, $$0 -> $$0.e, egc::new);
   private final iw e;

   public egc(iw $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<ffs> a(djz $$0) {
      return Optional.of(ffs.b(this.e));
   }

   @Override
   public egl<egc> a() {
      return egl.a;
   }

   public static class a implements egl<egc> {
      @Override
      public MapCodec<egc> a() {
         return egc.a;
      }

      @Override
      public za<ByteBuf, egc> b() {
         return egc.b;
      }
   }
}
