import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public abstract class ddx extends dfj {
   private final ded d;
   private final float e;
   private final int f;

   public ddx(String $$0, ded $$1, den $$2, daa $$3, float $$4, int $$5) {
      super($$0, $$2, $$3);
      this.d = $$1;
      this.e = $$4;
      this.f = $$5;
   }

   @Override
   public abstract dfb<? extends ddx> a();

   @Override
   public abstract dfc<? extends ddx> b();

   public float c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }

   public ded e() {
      return this.d;
   }

   protected abstract czw f();

   @Override
   public List<dfx> g() {
      return List.of(new dfw(this.k().c(), dgd.a.c, new dgd.f(this.l()), new dgd.d(this.f()), this.f, this.e));
   }

   @FunctionalInterface
   public interface a<T extends ddx> {
      T create(String var1, ded var2, den var3, daa var4, float var5, int var6);
   }

   public static class b<T extends ddx> implements dfb<T> {
      private final MapCodec<T> w;
      private final za<wn, T> x;

      public b(ddx.a<T> $$0, int $$1) {
         this.w = RecordCodecBuilder.mapCodec(
            $$2 -> $$2.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dfj::j),
                     ded.d.fieldOf("category").orElse(ded.c).forGetter(ddx::e),
                     den.d.fieldOf("ingredient").forGetter(dfj::k),
                     daa.e.fieldOf("result").forGetter(dfj::l),
                     Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter(ddx::c),
                     Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter(ddx::d)
                  )
                  .apply($$2, $$0::create)
         );
         this.x = za.a(yy.p, dfj::j, ded.e, ddx::e, den.a, dfj::k, daa.i, dfj::l, yy.l, ddx::c, yy.g, ddx::d, $$0::create);
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
