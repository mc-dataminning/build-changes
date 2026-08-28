import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czi<T extends cym> implements cyz<T> {
   private final MapCodec<T> x;
   private final zn<xa, T> y;

   public czi(czi.a<T> $$0) {
      this.x = RecordCodecBuilder.mapCodec($$1 -> $$1.group(cyl.e.fieldOf("category").orElse(cyl.d).forGetter(cym::d)).apply($$1, $$0::create));
      this.y = zn.a(cyl.g, cym::d, $$0::create);
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
   public interface a<T extends cym> {
      T create(cyl var1);
   }
}
