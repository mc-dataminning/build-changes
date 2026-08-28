import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class dwp implements dwx {
   public static final MapCodec<dwp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(iz.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, dwp::new));
   public static final zm<ByteBuf, dwp> b = zm.a(iz.b, $$0 -> $$0.e, dwp::new);
   private final iz e;

   public dwp(iz $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<evp> a(dbw $$0) {
      return Optional.of(evp.b(this.e));
   }

   @Override
   public dwy<dwp> a() {
      return dwy.a;
   }

   public static class a implements dwy<dwp> {
      @Override
      public MapCodec<dwp> a() {
         return dwp.a;
      }

      @Override
      public zm<ByteBuf, dwp> b() {
         return dwp.b;
      }
   }
}
