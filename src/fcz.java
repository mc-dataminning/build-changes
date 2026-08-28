import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fcz(String b) implements fdb {
   public static final MapCodec<fcz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(fcz::c)).apply($$0, fcz::new));

   public static fdb a(String $$0) {
      return new fcz($$0);
   }

   @Override
   public fda a() {
      return fdc.b;
   }

   @Override
   public ffa a(eyn $$0) {
      return ffa.c(this.b);
   }

   @Override
   public Set<bav<?>> b() {
      return Set.of();
   }

   public String c() {
      return this.b;
   }
}
