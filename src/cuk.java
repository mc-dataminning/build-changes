import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cuk(cx.c c) implements cum {
   public static final MapCodec<cuk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cx.c.d.fieldOf("range").forGetter(cuk::b)).apply($$0, cuk::new));

   public boolean a(cuo $$0) {
      return this.c.d((double)$$0.b().a().as());
   }

   @Override
   public MapCodec<cuk> a() {
      return a;
   }

   public cx.c b() {
      return this.c;
   }
}
