import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class ddk implements ddj {
   private final ddh c;

   public ddk(ddh $$0) {
      this.c = $$0;
   }

   @Override
   public boolean am_() {
      return true;
   }

   @Override
   public ddh c() {
      return this.c;
   }

   @Override
   public ddt al_() {
      return ddt.b;
   }

   @Override
   public abstract dee<? extends ddk> a();

   public static class a<T extends ddj> implements dee<T> {
      private final MapCodec<T> w;
      private final yw<wj, T> x;

      public a(ddk.a.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec($$1 -> $$1.group(ddh.e.fieldOf("category").orElse(ddh.d).forGetter(ddj::c)).apply($$1, $$0::create));
         this.x = yw.a(ddh.g, ddj::c, $$0::create);
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
      public interface a<T extends ddj> {
         T create(ddh var1);
      }
   }
}
