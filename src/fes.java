import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record fes(fah.b c) implements fev {
   public static final MapCodec<fes> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fah.b.e.fieldOf("target").forGetter(fes::c)).apply($$0, fes::new));
   public static final Codec<fes> b = fah.b.e.xmap(fes::new, fes::c);

   public static fev a(fah.b $$0) {
      return new fes($$0);
   }

   @Override
   public feu a() {
      return few.c;
   }

   @Nullable
   @Override
   public fgu a(fah $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<baz<?>> b() {
      return Set.of(this.c.a());
   }
}
