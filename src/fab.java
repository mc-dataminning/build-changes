import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record fab(evq.b c) implements fae {
   public static final MapCodec<fab> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(evq.b.e.fieldOf("target").forGetter(fab::c)).apply($$0, fab::new));
   public static final Codec<fab> b = evq.b.e.xmap(fab::new, fab::c);

   public static fae a(evq.b $$0) {
      return new fab($$0);
   }

   @Override
   public fad a() {
      return faf.c;
   }

   @Nullable
   @Override
   public fcd a(evq $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<bai<?>> b() {
      return Set.of(this.c.a());
   }
}
