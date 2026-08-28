import com.mojang.serialization.Codec;

public record atp<T>(String a, Codec<T> b) {
}
