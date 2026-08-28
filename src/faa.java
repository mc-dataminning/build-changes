import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record faa(evp.b c) implements fad {
   public static final MapCodec<faa> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(evp.b.e.fieldOf("target").forGetter(faa::c)).apply($$0, faa::new));
   public static final Codec<faa> b = evp.b.e.xmap(faa::new, faa::c);

   public static fad a(evp.b $$0) {
      return new faa($$0);
   }

   @Override
   public fac a() {
      return fae.c;
   }

   @Nullable
   @Override
   public fcc a(evp $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<bah<?>> b() {
      return Set.of(this.c.a());
   }
}
