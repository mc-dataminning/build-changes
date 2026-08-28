import com.mojang.serialization.Codec;

public class eii implements eib {
   public static final Codec<eii> a = Codec.unit(() -> eii.b);
   public static final eii b = new eii();
}
