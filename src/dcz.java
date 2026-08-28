import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class dcz implements dcy {
   private final dcw c;

   public dcz(dcw $$0) {
      this.c = $$0;
   }

   @Override
   public boolean al_() {
      return true;
   }

   @Override
   public dcw c() {
      return this.c;
   }

   @Override
   public ddi ak_() {
      return ddi.b;
   }

   @Override
   public abstract ddt<? extends dcz> a();

   public static class a<T extends dcy> implements ddt<T> {
      private final MapCodec<T> w;
      private final yu<wh, T> x;

      public a(dcz.a.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec($$1 -> $$1.group(dcw.e.fieldOf("category").orElse(dcw.d).forGetter(dcy::c)).apply($$1, $$0::create));
         this.x = yu.a(dcw.g, dcy::c, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public yu<wh, T> b() {
         return this.x;
      }

      @FunctionalInterface
      public interface a<T extends dcy> {
         T create(dcw var1);
      }
   }
}
