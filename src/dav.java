import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dav<T extends czx> implements dam<T> {
   private final MapCodec<T> w;
   private final zb<wo, T> x;

   public dav(dav.a<T> $$0) {
      this.w = RecordCodecBuilder.mapCodec($$1 -> $$1.group(czv.e.fieldOf("category").orElse(czv.d).forGetter(czx::d)).apply($$1, $$0::create));
      this.x = zb.a(czv.g, czx::d, $$0::create);
   }

   @Override
   public MapCodec<T> a() {
      return this.w;
   }

   @Override
   public zb<wo, T> b() {
      return this.x;
   }

   @FunctionalInterface
   public interface a<T extends czx> {
      T create(czv var1);
   }
}
