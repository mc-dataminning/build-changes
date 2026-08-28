import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record fba(ewp.b c) implements fbd {
   public static final MapCodec<fba> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ewp.b.e.fieldOf("target").forGetter(fba::c)).apply($$0, fba::new));
   public static final Codec<fba> b = ewp.b.e.xmap(fba::new, fba::c);

   public static fbd a(ewp.b $$0) {
      return new fba($$0);
   }

   @Override
   public fbc a() {
      return fbe.c;
   }

   @Nullable
   @Override
   public fdc a(ewp $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<bbn<?>> b() {
      return Set.of(this.c.a());
   }
}
