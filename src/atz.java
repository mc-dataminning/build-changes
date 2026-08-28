import com.mojang.serialization.Codec;

public record atz<T>(String a, Codec<T> b) {
}
