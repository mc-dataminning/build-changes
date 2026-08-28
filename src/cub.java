import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cub(cx.c c) implements cud {
   public static final MapCodec<cub> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cx.c.d.fieldOf("range").forGetter(cub::b)).apply($$0, cub::new));

   public boolean a(cuf $$0) {
      return this.c.d((double)$$0.b().a().as());
   }

   @Override
   public MapCodec<cub> a() {
      return a;
   }

   public cx.c b() {
      return this.c;
   }
}
