import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fbb(String b) implements fbd {
   public static final MapCodec<fbb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(fbb::c)).apply($$0, fbb::new));

   public static fbd a(String $$0) {
      return new fbb($$0);
   }

   @Override
   public fbc a() {
      return fbe.b;
   }

   @Override
   public fdc a(ewp $$0) {
      return fdc.c(this.b);
   }

   @Override
   public Set<bbn<?>> b() {
      return Set.of();
   }

   public String c() {
      return this.b;
   }
}
