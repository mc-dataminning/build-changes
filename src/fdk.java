import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record fdk(eyz.b c) implements fdn {
   public static final MapCodec<fdk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eyz.b.e.fieldOf("target").forGetter(fdk::c)).apply($$0, fdk::new));
   public static final Codec<fdk> b = eyz.b.e.xmap(fdk::new, fdk::c);

   public static fdn a(eyz.b $$0) {
      return new fdk($$0);
   }

   @Override
   public fdm a() {
      return fdo.c;
   }

   @Nullable
   @Override
   public ffm a(eyz $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<bax<?>> b() {
      return Set.of(this.c.a());
   }
}
