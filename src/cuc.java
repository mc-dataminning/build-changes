import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cuc<T extends ctg> implements ctt<T> {
   private final cuc.a<T> x;
   private final Codec<T> y;
   private final xs<vf, T> z;

   public cuc(cuc.a<T> $$0) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create($$1 -> $$1.group(ctf.e.fieldOf("category").orElse(ctf.d).forGetter(ctg::d)).apply($$1, $$0::create));
      this.z = xs.a(ctf.g, ctg::d, $$0::create);
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   @Override
   public xs<vf, T> b() {
      return this.z;
   }

   @FunctionalInterface
   public interface a<T extends ctg> {
      T create(ctf var1);
   }
}
