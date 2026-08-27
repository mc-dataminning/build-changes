import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import javax.annotation.Nullable;

public record drd(@Nullable UUID c, int d, int e) {
   public static final Codec<drd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ju.a.fieldOf("owner").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("slot").forGetter($$0x -> $$0x.d),
               Codec.INT.fieldOf("heat").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, drd::new)
   );
   public static final zc<ByteBuf, drd> b = za.b(a);

   @Nullable
   public UUID a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }
}
