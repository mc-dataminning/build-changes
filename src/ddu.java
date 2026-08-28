import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class ddu implements ddt {
   private final ddr d;

   public ddu(ddr $$0) {
      this.d = $$0;
   }

   @Override
   public boolean am_() {
      return true;
   }

   @Override
   public ddr c() {
      return this.d;
   }

   @Override
   public ded al_() {
      return ded.b;
   }

   @Override
   public abstract deo<? extends ddu> a();

   public static class a<T extends ddt> implements deo<T> {
      private final MapCodec<T> w;
      private final yw<wj, T> x;

      public a(ddu.a.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec($$1 -> $$1.group(ddr.e.fieldOf("category").orElse(ddr.d).forGetter(ddt::c)).apply($$1, $$0::create));
         this.x = yw.a(ddr.g, ddt::c, $$0::create);
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
      public interface a<T extends ddt> {
         T create(ddr var1);
      }
   }
}
