import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class ddr implements ddq {
   private final ddo d;

   public ddr(ddo $$0) {
      this.d = $$0;
   }

   @Override
   public boolean am_() {
      return true;
   }

   @Override
   public ddo c() {
      return this.d;
   }

   @Override
   public dea al_() {
      return dea.b;
   }

   @Override
   public abstract del<? extends ddr> a();

   public static class a<T extends ddq> implements del<T> {
      private final MapCodec<T> w;
      private final yw<wj, T> x;

      public a(ddr.a.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec($$1 -> $$1.group(ddo.e.fieldOf("category").orElse(ddo.d).forGetter(ddq::c)).apply($$1, $$0::create));
         this.x = yw.a(ddo.g, ddq::c, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public yw<wj, T> b() {
         return this.x;
      }

      @FunctionalInterface
      public interface a<T extends ddq> {
         T create(ddo var1);
      }
   }
}
