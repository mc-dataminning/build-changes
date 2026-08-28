import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class ddf implements dde {
   private final ddc c;

   public ddf(ddc $$0) {
      this.c = $$0;
   }

   @Override
   public boolean al_() {
      return true;
   }

   @Override
   public ddc c() {
      return this.c;
   }

   @Override
   public ddo ak_() {
      return ddo.b;
   }

   @Override
   public abstract ddz<? extends ddf> a();

   public static class a<T extends dde> implements ddz<T> {
      private final MapCodec<T> w;
      private final yw<wj, T> x;

      public a(ddf.a.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec($$1 -> $$1.group(ddc.e.fieldOf("category").orElse(ddc.d).forGetter(dde::c)).apply($$1, $$0::create));
         this.x = yw.a(ddc.g, dde::c, $$0::create);
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
      public interface a<T extends dde> {
         T create(ddc var1);
      }
   }
}
