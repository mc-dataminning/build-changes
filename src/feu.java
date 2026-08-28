import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record feu(faj.b c) implements fex {
   public static final MapCodec<feu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(faj.b.e.fieldOf("target").forGetter(feu::c)).apply($$0, feu::new));
   public static final Codec<feu> b = faj.b.e.xmap(feu::new, feu::c);

   public static fex a(faj.b $$0) {
      return new feu($$0);
   }

   @Override
   public few a() {
      return fey.c;
   }

   @Nullable
   @Override
   public fgw a(faj $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<bbb<?>> b() {
      return Set.of(this.c.a());
   }
}
