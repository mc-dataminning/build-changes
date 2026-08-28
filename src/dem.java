import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public abstract class dem implements ddu<den> {
   private final ddq c;
   private final czd d;
   private final String e;
   @Nullable
   private ddt f;

   public dem(String $$0, ddq $$1, czd $$2) {
      this.e = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public abstract dee<? extends dem> a();

   @Override
   public abstract def<? extends dem> b();

   public boolean a(den $$0, dja $$1) {
      return this.c.a($$0.c());
   }

   @Override
   public String j() {
      return this.e;
   }

   public ddq k() {
      return this.c;
   }

   protected czd l() {
      return this.d;
   }

   @Override
   public ddt al_() {
      if (this.f == null) {
         this.f = ddt.a(this.c);
      }

      return this.f;
   }

   public czd a(den $$0, jg.a $$1) {
      return this.d.v();
   }

   @FunctionalInterface
   public interface a<T extends dem> {
      T create(String var1, ddq var2, czd var3);
   }

   public static class b<T extends dem> implements dee<T> {
      private final MapCodec<T> w;
      private final yw<wj, T> x;

      protected b(dem.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dem::j),
                     ddq.d.fieldOf("ingredient").forGetter(dem::k),
                     czd.d.fieldOf("result").forGetter(dem::l)
                  )
                  .apply($$1, $$0::create)
         );
         this.x = yw.a(yu.o, dem::j, ddq.a, dem::k, czd.i, dem::l, $$0::create);
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
