import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fad(String b) implements faf {
   public static final MapCodec<fad> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(fad::c)).apply($$0, fad::new));

   public static faf a(String $$0) {
      return new fad($$0);
   }

   @Override
   public fae a() {
      return fag.b;
   }

   @Override
   public fce a(evr $$0) {
      return fce.c(this.b);
   }

   @Override
   public Set<bai<?>> b() {
      return Set.of();
   }

   public String c() {
      return this.b;
   }
}
