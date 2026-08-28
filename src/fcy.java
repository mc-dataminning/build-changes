import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record fcy(eyn.b c) implements fdb {
   public static final MapCodec<fcy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eyn.b.e.fieldOf("target").forGetter(fcy::c)).apply($$0, fcy::new));
   public static final Codec<fcy> b = eyn.b.e.xmap(fcy::new, fcy::c);

   public static fdb a(eyn.b $$0) {
      return new fcy($$0);
   }

   @Override
   public fda a() {
      return fdc.c;
   }

   @Nullable
   @Override
   public ffa a(eyn $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<bav<?>> b() {
      return Set.of(this.c.a());
   }
}
