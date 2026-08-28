import com.mojang.serialization.Codec;

public record aua<T>(String a, Codec<T> b) {
}
