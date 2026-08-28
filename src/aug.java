import com.mojang.serialization.Codec;

public record aug<T>(String a, Codec<T> b) {
}
