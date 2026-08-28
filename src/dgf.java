import com.mojang.serialization.Codec;

public record dgf() {
   public static final dgf a = new dgf();
   public static final Codec<dgf> b = Codec.unit(() -> a);
}
