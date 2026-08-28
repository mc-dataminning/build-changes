import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fab(String b) implements fad {
   public static final MapCodec<fab> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(fab::c)).apply($$0, fab::new));

   public static fad a(String $$0) {
      return new fab($$0);
   }

   @Override
   public fac a() {
      return fae.b;
   }

   @Override
   public fcc a(evp $$0) {
      return fcc.c(this.b);
   }

   @Override
   public Set<bah<?>> b() {
      return Set.of();
   }

   public String c() {
      return this.b;
   }
}
