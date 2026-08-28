import com.mojang.serialization.Codec;

public record ato<T>(String a, Codec<T> b) {
}
