import com.mojang.serialization.Codec;

public record ddp() {
   public static final ddp a = new ddp();
   public static final Codec<ddp> b = Codec.unit(() -> a);
}
