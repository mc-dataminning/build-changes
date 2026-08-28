import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fae(String b) implements fag {
   public static final MapCodec<fae> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(fae::c)).apply($$0, fae::new));

   public static fag a(String $$0) {
      return new fae($$0);
   }

   @Override
   public faf a() {
      return fah.b;
   }

   @Override
   public fcf a(evs $$0) {
      return fcf.c(this.b);
   }

   @Override
   public Set<bai<?>> b() {
      return Set.of();
   }

   public String c() {
      return this.b;
   }
}
