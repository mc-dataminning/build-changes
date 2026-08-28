import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public class dwq implements dwy {
   public static final MapCodec<dwq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(iz.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, dwq::new));
   public static final zm<ByteBuf, dwq> b = zm.a(iz.b, $$0 -> $$0.e, dwq::new);
   private final iz e;

   public dwq(iz $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<evq> a(dbx $$0) {
      return Optional.of(evq.b(this.e));
   }

   @Override
   public dwz<dwq> a() {
      return dwz.a;
   }

   public static class a implements dwz<dwq> {
      @Override
      public MapCodec<dwq> a() {
         return dwq.a;
      }

      @Override
      public zm<ByteBuf, dwq> b() {
         return dwq.b;
      }
   }
}
