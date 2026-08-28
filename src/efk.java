import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class efk implements efs {
   public static final MapCodec<efk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(iv.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, efk::new));
   public static final yw<ByteBuf, efk> b = yw.a(iv.b, $$0 -> $$0.e, efk::new);
   private final iv e;

   public efk(iv $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<fex> a(djh $$0) {
      return Optional.of(fex.b(this.e));
   }

   @Override
   public eft<efk> a() {
      return eft.a;
   }

   public static class a implements eft<efk> {
      @Override
      public MapCodec<efk> a() {
         return efk.a;
      }

      @Override
      public yw<ByteBuf, efk> b() {
         return efk.b;
      }
   }
}
