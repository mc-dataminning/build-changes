import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czk<T extends cyo> implements czb<T> {
   private final MapCodec<T> x;
   private final zn<xa, T> y;

   public czk(czk.a<T> $$0) {
      this.x = RecordCodecBuilder.mapCodec($$1 -> $$1.group(cyn.e.fieldOf("category").orElse(cyn.d).forGetter(cyo::d)).apply($$1, $$0::create));
      this.y = zn.a(cyn.g, cyo::d, $$0::create);
   }

   @Override
   public MapCodec<T> a() {
      return this.x;
   }

   @Override
   public zn<xa, T> b() {
      return this.y;
   }

   @FunctionalInterface
   public interface a<T extends cyo> {
      T create(cyn var1);
   }
}
