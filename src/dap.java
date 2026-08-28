import com.mojang.serialization.Codec;

public record dap() {
   public static final dap a = new dap();
   public static final Codec<dap> b = Codec.unit(() -> a);
}
