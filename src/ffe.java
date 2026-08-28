import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record ffe(fat.b c) implements ffh {
   public static final MapCodec<ffe> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fat.b.e.fieldOf("target").forGetter(ffe::c)).apply($$0, ffe::new));
   public static final Codec<ffe> b = fat.b.e.xmap(ffe::new, ffe::c);

   public static ffh a(fat.b $$0) {
      return new ffe($$0);
   }

   @Override
   public ffg a() {
      return ffi.c;
   }

   @Nullable
   @Override
   public fhg a(fat $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<bbk<?>> b() {
      return Set.of(this.c.a());
   }
}
