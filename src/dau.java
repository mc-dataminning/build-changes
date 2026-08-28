import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class dau implements dat {
   private final dar c;

   public dau(dar $$0) {
      this.c = $$0;
   }

   @Override
   public boolean ap_() {
      return true;
   }

   @Override
   public dar c() {
      return this.c;
   }

   @Override
   public dbd ao_() {
      return dbd.a;
   }

   @Override
   public abstract dbo<? extends dau> a();

   public static class a<T extends dat> implements dbo<T> {
      private final MapCodec<T> w;
      private final ym<vz, T> x;

      public a(dau.a.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec($$1 -> $$1.group(dar.e.fieldOf("category").orElse(dar.d).forGetter(dat::c)).apply($$1, $$0::create));
         this.x = ym.a(dar.g, dat::c, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public ym<vz, T> b() {
         return this.x;
      }

      @FunctionalInterface
      public interface a<T extends dat> {
         T create(dar var1);
      }
   }
}
