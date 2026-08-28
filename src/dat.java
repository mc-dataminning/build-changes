import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class dat implements das {
   private final daq c;

   public dat(daq $$0) {
      this.c = $$0;
   }

   @Override
   public boolean ap_() {
      return true;
   }

   @Override
   public daq c() {
      return this.c;
   }

   @Override
   public dbc ao_() {
      return dbc.b;
   }

   @Override
   public abstract dbn<? extends dat> a();

   public static class a<T extends das> implements dbn<T> {
      private final MapCodec<T> w;
      private final yn<wa, T> x;

      public a(dat.a.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec($$1 -> $$1.group(daq.e.fieldOf("category").orElse(daq.d).forGetter(das::c)).apply($$1, $$0::create));
         this.x = yn.a(daq.g, das::c, $$0::create);
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
      public interface a<T extends das> {
         T create(daq var1);
      }
   }
}
