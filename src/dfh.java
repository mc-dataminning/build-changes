import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public abstract class dfh implements dep<dfi> {
   private final del d;
   private final czy e;
   private final String f;
   @Nullable
   private deo g;

   public dfh(String $$0, del $$1, czy $$2) {
      this.f = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public abstract dez<? extends dfh> a();

   @Override
   public abstract dfa<? extends dfh> b();

   public boolean a(dfi $$0, djx $$1) {
      return this.d.a($$0.c());
   }

   @Override
   public String j() {
      return this.f;
   }

   public del k() {
      return this.d;
   }

   protected czy l() {
      return this.e;
   }

   @Override
   public deo ap_() {
      if (this.g == null) {
         this.g = deo.a(this.d);
      }

      return this.g;
   }

   public czy a(dfi $$0, jh.a $$1) {
      return this.e.v();
   }

   @FunctionalInterface
   public interface a<T extends dfh> {
      T create(String var1, del var2, czy var3);
   }

   public static class b<T extends dfh> implements dez<T> {
      private final MapCodec<T> w;
      private final yy<wl, T> x;

      protected b(dfh.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dfh::j),
                     del.d.fieldOf("ingredient").forGetter(dfh::k),
                     czy.d.fieldOf("result").forGetter(dfh::l)
                  )
                  .apply($$1, $$0::create)
         );
         this.x = yy.a(yw.p, dfh::j, del.a, dfh::k, czy.i, dfh::l, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public yy<wl, T> b() {
         return this.x;
      }
   }
}
