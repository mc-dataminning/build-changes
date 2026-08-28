import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record faz(ewo.b c) implements fbc {
   public static final MapCodec<faz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ewo.b.e.fieldOf("target").forGetter(faz::c)).apply($$0, faz::new));
   public static final Codec<faz> b = ewo.b.e.xmap(faz::new, faz::c);

   public static fbc a(ewo.b $$0) {
      return new faz($$0);
   }

   @Override
   public fbb a() {
      return fbd.c;
   }

   @Nullable
   @Override
   public fdb a(ewo $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<bai<?>> b() {
      return Set.of(this.c.a());
   }
}
