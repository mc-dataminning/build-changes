import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class ebq implements eby {
   public static final MapCodec<ebq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ji.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, ebq::new));
   public static final yn<ByteBuf, ebq> b = yn.a(ji.b, $$0 -> $$0.e, ebq::new);
   private final ji e;

   public ebq(ji $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<fbb> a(dgj $$0) {
      return Optional.of(fbb.b(this.e));
   }

   @Override
   public ebz<ebq> a() {
      return ebz.a;
   }

   public static class a implements ebz<ebq> {
      @Override
      public MapCodec<ebq> a() {
         return ebq.a;
      }

      @Override
      public yn<ByteBuf, ebq> b() {
         return ebq.b;
      }
   }
}
