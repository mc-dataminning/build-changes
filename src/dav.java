import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class dav implements dau {
   private final das c;

   public dav(das $$0) {
      this.c = $$0;
   }

   @Override
   public boolean ap_() {
      return true;
   }

   @Override
   public das c() {
      return this.c;
   }

   @Override
   public dbe ao_() {
      return dbe.b;
   }

   @Override
   public abstract dbp<? extends dav> a();

   public static class a<T extends dau> implements dbp<T> {
      private final MapCodec<T> w;
      private final yn<wa, T> x;

      public a(dav.a.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec($$1 -> $$1.group(das.e.fieldOf("category").orElse(das.d).forGetter(dau::c)).apply($$1, $$0::create));
         this.x = yn.a(das.g, dau::c, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public yn<wa, T> b() {
         return this.x;
      }

      @FunctionalInterface
      public interface a<T extends dau> {
         T create(das var1);
      }
   }
}
