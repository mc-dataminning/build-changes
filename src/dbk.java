import com.mojang.serialization.Codec;

public record dbk() {
   public static final dbk a = new dbk();
   public static final Codec<dbk> b = Codec.unit(() -> a);
}
