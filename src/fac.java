import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fac(String b) implements fae {
   public static final MapCodec<fac> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(fac::c)).apply($$0, fac::new));

   public static fae a(String $$0) {
      return new fac($$0);
   }

   @Override
   public fad a() {
      return faf.b;
   }

   @Override
   public fcd a(evq $$0) {
      return fcd.c(this.b);
   }

   @Override
   public Set<bai<?>> b() {
      return Set.of();
   }

   public String c() {
      return this.b;
   }
}
