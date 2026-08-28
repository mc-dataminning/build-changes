import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fev(String b) implements fex {
   public static final MapCodec<fev> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(fev::c)).apply($$0, fev::new));

   public static fex a(String $$0) {
      return new fev($$0);
   }

   @Override
   public few a() {
      return fey.b;
   }

   @Override
   public fgw a(faj $$0) {
      return fgw.c(this.b);
   }

   @Override
   public Set<bbb<?>> b() {
      return Set.of();
   }

   public String c() {
      return this.b;
   }
}
