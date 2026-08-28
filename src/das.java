import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class das implements dar {
   private final dap c;

   public das(dap $$0) {
      this.c = $$0;
   }

   @Override
   public boolean ap_() {
      return true;
   }

   @Override
   public dap c() {
      return this.c;
   }

   @Override
   public dbb ao_() {
      return dbb.b;
   }

   @Override
   public abstract dbm<? extends das> a();

   public static class a<T extends dar> implements dbm<T> {
      private final MapCodec<T> w;
      private final ym<vz, T> x;

      public a(das.a.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec($$1 -> $$1.group(dap.e.fieldOf("category").orElse(dap.d).forGetter(dar::c)).apply($$1, $$0::create));
         this.x = ym.a(dap.g, dar::c, $$0::create);
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
      public interface a<T extends dar> {
         T create(dap var1);
      }
   }
}
