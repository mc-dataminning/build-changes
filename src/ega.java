import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class ega implements egi {
   public static final MapCodec<ega> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(iv.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, ega::new));
   public static final yy<ByteBuf, ega> b = yy.a(iv.b, $$0 -> $$0.e, ega::new);
   private final iv e;

   public ega(iv $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<ffq> a(djx $$0) {
      return Optional.of(ffq.b(this.e));
   }

   @Override
   public egj<ega> a() {
      return egj.a;
   }

   public static class a implements egj<ega> {
      @Override
      public MapCodec<ega> a() {
         return ega.a;
      }

      @Override
      public yy<ByteBuf, ega> b() {
         return ega.b;
      }
   }
}
