import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class day<T extends daa> implements dap<T> {
   private final MapCodec<T> w;
   private final zc<wp, T> x;

   public day(day.a<T> $$0) {
      this.w = RecordCodecBuilder.mapCodec($$1 -> $$1.group(czy.e.fieldOf("category").orElse(czy.d).forGetter(daa::d)).apply($$1, $$0::create));
      this.x = zc.a(czy.g, daa::d, $$0::create);
   }

   @Override
   public MapCodec<T> a() {
      return this.w;
   }

   @Override
   public zc<wp, T> b() {
      return this.x;
   }

   @FunctionalInterface
   public interface a<T extends daa> {
      T create(czy var1);
   }
}
