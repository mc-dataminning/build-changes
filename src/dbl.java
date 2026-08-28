import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class dbl implements dbk {
   private final dbi c;

   public dbl(dbi $$0) {
      this.c = $$0;
   }

   @Override
   public boolean ap_() {
      return true;
   }

   @Override
   public dbi c() {
      return this.c;
   }

   @Override
   public dbu ao_() {
      return dbu.b;
   }

   @Override
   public abstract dcf<? extends dbl> a();

   public static class a<T extends dbk> implements dcf<T> {
      private final MapCodec<T> w;
      private final yn<wa, T> x;

      public a(dbl.a.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec($$1 -> $$1.group(dbi.e.fieldOf("category").orElse(dbi.d).forGetter(dbk::c)).apply($$1, $$0::create));
         this.x = yn.a(dbi.g, dbk::c, $$0::create);
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
      public interface a<T extends dbk> {
         T create(dbi var1);
      }
   }
}
