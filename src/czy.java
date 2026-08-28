import com.mojang.serialization.Codec;

public record czy() {
   public static final czy a = new czy();
   public static final Codec<czy> b = Codec.unit(() -> a);
}
