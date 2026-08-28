import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class efd implements efl {
   public static final MapCodec<efd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(iu.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, efd::new));
   public static final yw<ByteBuf, efd> b = yw.a(iu.b, $$0 -> $$0.e, efd::new);
   private final iu e;

   public efd(iu $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<feq> a(dja $$0) {
      return Optional.of(feq.b(this.e));
   }

   @Override
   public efm<efd> a() {
      return efm.a;
   }

   public static class a implements efm<efd> {
      @Override
      public MapCodec<efd> a() {
         return efd.a;
      }

      @Override
      public yw<ByteBuf, efd> b() {
         return efd.b;
      }
   }
}
