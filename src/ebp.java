import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class ebp implements ebx {
   public static final MapCodec<ebp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ji.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, ebp::new));
   public static final yn<ByteBuf, ebp> b = yn.a(ji.b, $$0 -> $$0.e, ebp::new);
   private final ji e;

   public ebp(ji $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<fba> a(dgi $$0) {
      return Optional.of(fba.b(this.e));
   }

   @Override
   public eby<ebp> a() {
      return eby.a;
   }

   public static class a implements eby<ebp> {
      @Override
      public MapCodec<ebp> a() {
         return ebp.a;
      }

      @Override
      public yn<ByteBuf, ebp> b() {
         return ebp.b;
      }
   }
}
