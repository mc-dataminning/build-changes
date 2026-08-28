import com.mojang.serialization.Codec;

public enum bah {
   a;

   public static final Codec<bah> b = Codec.unit(a);
}
