import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record fac(evr.b c) implements faf {
   public static final MapCodec<fac> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(evr.b.e.fieldOf("target").forGetter(fac::c)).apply($$0, fac::new));
   public static final Codec<fac> b = evr.b.e.xmap(fac::new, fac::c);

   public static faf a(evr.b $$0) {
      return new fac($$0);
   }

   @Override
   public fae a() {
      return fag.c;
   }

   @Nullable
   @Override
   public fce a(evr $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<bai<?>> b() {
      return Set.of(this.c.a());
   }
}
