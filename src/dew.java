import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public abstract class dew implements dee<dex> {
   private final dea d;
   private final czn e;
   private final String f;
   @Nullable
   private ded g;

   public dew(String $$0, dea $$1, czn $$2) {
      this.f = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public abstract deo<? extends dew> a();

   @Override
   public abstract dep<? extends dew> b();

   public boolean a(dex $$0, djm $$1) {
      return this.d.a($$0.c());
   }

   @Override
   public String j() {
      return this.f;
   }

   public dea k() {
      return this.d;
   }

   protected czn l() {
      return this.e;
   }

   @Override
   public ded al_() {
      if (this.g == null) {
         this.g = ded.a(this.d);
      }

      return this.g;
   }

   public czn a(dex $$0, jh.a $$1) {
      return this.e.v();
   }

   @FunctionalInterface
   public interface a<T extends dew> {
      T create(String var1, dea var2, czn var3);
   }

   public static class b<T extends dew> implements deo<T> {
      private final MapCodec<T> w;
      private final yw<wj, T> x;

      protected b(dew.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dew::j),
                     dea.d.fieldOf("ingredient").forGetter(dew::k),
                     czn.d.fieldOf("result").forGetter(dew::l)
                  )
                  .apply($$1, $$0::create)
         );
         this.x = yw.a(yu.p, dew::j, dea.a, dew::k, czn.i, dew::l, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public yw<wj, T> b() {
         return this.x;
      }
   }
}
