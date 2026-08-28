import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public abstract class dfj implements der<dfk> {
   private final den d;
   private final daa e;
   private final String f;
   @Nullable
   private deq g;

   public dfj(String $$0, den $$1, daa $$2) {
      this.f = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   @Override
   public abstract dfb<? extends dfj> a();

   @Override
   public abstract dfc<? extends dfj> b();

   public boolean a(dfk $$0, djz $$1) {
      return this.d.a($$0.c());
   }

   @Override
   public String j() {
      return this.f;
   }

   public den k() {
      return this.d;
   }

   protected daa l() {
      return this.e;
   }

   @Override
   public deq ap_() {
      if (this.g == null) {
         this.g = deq.a(this.d);
      }

      return this.g;
   }

   public daa a(dfk $$0, ji.a $$1) {
      return this.e.v();
   }

   @FunctionalInterface
   public interface a<T extends dfj> {
      T create(String var1, den var2, daa var3);
   }

   public static class b<T extends dfj> implements dfb<T> {
      private final MapCodec<T> w;
      private final za<wn, T> x;

      protected b(dfj.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dfj::j),
                     den.d.fieldOf("ingredient").forGetter(dfj::k),
                     daa.d.fieldOf("result").forGetter(dfj::l)
                  )
                  .apply($$1, $$0::create)
         );
         this.x = za.a(yy.p, dfj::j, den.a, dfj::k, daa.i, dfj::l, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public za<wn, T> b() {
         return this.x;
      }
   }
}
