import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public abstract class ddh extends det {
   private final ddn d;
   private final float e;
   private final int f;

   public ddh(String $$0, ddn $$1, ddx $$2, czk $$3, float $$4, int $$5) {
      super($$0, $$2, $$3);
      this.d = $$1;
      this.e = $$4;
      this.f = $$5;
   }

   @Override
   public abstract del<? extends ddh> a();

   @Override
   public abstract dem<? extends ddh> b();

   public float c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }

   public ddn e() {
      return this.d;
   }

   protected abstract czg f();

   @Override
   public List<dfh> g() {
      return List.of(new dfg(this.k().c(), dfn.a.c, new dfn.f(this.l()), new dfn.d(this.f()), this.f, this.e));
   }

   @FunctionalInterface
   public interface a<T extends ddh> {
      T create(String var1, ddn var2, ddx var3, czk var4, float var5, int var6);
   }

   public static class b<T extends ddh> implements del<T> {
      private final MapCodec<T> w;
      private final yw<wj, T> x;

      public b(ddh.a<T> $$0, int $$1) {
         this.w = RecordCodecBuilder.mapCodec(
            $$2 -> $$2.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(det::j),
                     ddn.d.fieldOf("category").orElse(ddn.c).forGetter(ddh::e),
                     ddx.d.fieldOf("ingredient").forGetter(det::k),
                     czk.e.fieldOf("result").forGetter(det::l),
                     Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter(ddh::c),
                     Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter(ddh::d)
                  )
                  .apply($$2, $$0::create)
         );
         this.x = yw.a(yu.p, det::j, ddn.e, ddh::e, ddx.a, det::k, czk.i, det::l, yu.l, ddh::c, yu.g, ddh::d, $$0::create);
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
