import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbn<T extends daq> implements dbf<T> {
   private final MapCodec<T> w;
   private final zh<wu, T> x;

   public dbn(dbn.a<T> $$0) {
      this.w = RecordCodecBuilder.mapCodec($$1 -> $$1.group(dao.e.fieldOf("category").orElse(dao.d).forGetter(daq::d)).apply($$1, $$0::create));
      this.x = zh.a(dao.g, daq::d, $$0::create);
   }

   @Override
   public MapCodec<T> a() {
      return this.w;
   }

   @Override
   public zh<wu, T> b() {
      return this.x;
   }

   @FunctionalInterface
   public interface a<T extends daq> {
      T create(dao var1);
   }
}
