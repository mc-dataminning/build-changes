import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cvw<T extends cva> implements cvn<T> {
   private final cvw.a<T> x;
   private final Codec<T> y;
   private final ye<vr, T> z;

   public cvw(cvw.a<T> $$0) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create($$1 -> $$1.group(cuz.e.fieldOf("category").orElse(cuz.d).forGetter(cva::d)).apply($$1, $$0::create));
      this.z = ye.a(cuz.g, cva::d, $$0::create);
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   @Override
   public ye<vr, T> b() {
      return this.z;
   }

   @FunctionalInterface
   public interface a<T extends cva> {
      T create(cuz var1);
   }
}
