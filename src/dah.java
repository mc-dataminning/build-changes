import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dah<T extends czj> implements czy<T> {
   private final MapCodec<T> w;
   private final zb<wo, T> x;

   public dah(dah.a<T> $$0) {
      this.w = RecordCodecBuilder.mapCodec($$1 -> $$1.group(czh.e.fieldOf("category").orElse(czh.d).forGetter(czj::d)).apply($$1, $$0::create));
      this.x = zb.a(czh.g, czj::d, $$0::create);
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
   public interface a<T extends czj> {
      T create(czh var1);
   }
}
