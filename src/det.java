import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public abstract class det implements deb<deu> {
   private final ddx d;
   private final czk e;
   private final String f;
   @Nullable
   private dea g;

   public det(String $$0, ddx $$1, czk $$2) {
      this.f = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public abstract del<? extends det> a();

   @Override
   public abstract dem<? extends det> b();

   public boolean a(deu $$0, djh $$1) {
      return this.d.a($$0.c());
   }

   @Override
   public String j() {
      return this.f;
   }

   public ddx k() {
      return this.d;
   }

   protected czk l() {
      return this.e;
   }

   @Override
   public dea al_() {
      if (this.g == null) {
         this.g = dea.a(this.d);
      }

      return this.g;
   }

   public czk a(deu $$0, jh.a $$1) {
      return this.e.v();
   }

   @FunctionalInterface
   public interface a<T extends det> {
      T create(String var1, ddx var2, czk var3);
   }

   public static class b<T extends det> implements del<T> {
      private final MapCodec<T> w;
      private final yw<wj, T> x;

      protected b(det.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(det::j),
                     ddx.d.fieldOf("ingredient").forGetter(det::k),
                     czk.d.fieldOf("result").forGetter(det::l)
                  )
                  .apply($$1, $$0::create)
         );
         this.x = yw.a(yu.p, det::j, ddx.a, det::k, czk.i, det::l, $$0::create);
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
