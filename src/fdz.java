import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record fdz(ezo.b c) implements fec {
   public static final MapCodec<fdz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ezo.b.e.fieldOf("target").forGetter(fdz::c)).apply($$0, fdz::new));
   public static final Codec<fdz> b = ezo.b.e.xmap(fdz::new, fdz::c);

   public static fec a(ezo.b $$0) {
      return new fdz($$0);
   }

   @Override
   public feb a() {
      return fed.c;
   }

   @Nullable
   @Override
   public fgb a(ezo $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<bax<?>> b() {
      return Set.of(this.c.a());
   }
}
