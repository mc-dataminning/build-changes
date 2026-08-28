import com.mojang.serialization.Codec;

public enum bai {
   a;

   public static final Codec<bai> b = Codec.unit(a);
}
