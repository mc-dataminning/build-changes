import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fef(String b) implements feh {
   public static final MapCodec<fef> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(fef::c)).apply($$0, fef::new));

   public static feh a(String $$0) {
      return new fef($$0);
   }

   @Override
   public feg a() {
      return fei.b;
   }

   @Override
   public fgg a(ezt $$0) {
      return fgg.c(this.b);
   }

   @Override
   public Set<bax<?>> b() {
      return Set.of();
   }

   public String c() {
      return this.b;
   }
}
