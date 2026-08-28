import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record fad(evs.b c) implements fag {
   public static final MapCodec<fad> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(evs.b.e.fieldOf("target").forGetter(fad::c)).apply($$0, fad::new));
   public static final Codec<fad> b = evs.b.e.xmap(fad::new, fad::c);

   public static fag a(evs.b $$0) {
      return new fad($$0);
   }

   @Override
   public faf a() {
      return fah.c;
   }

   @Nullable
   @Override
   public fcf a(evs $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<bai<?>> b() {
      return Set.of(this.c.a());
   }
}
