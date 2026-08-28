import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public abstract class ddk extends dew {
   private final ddq d;
   private final float e;
   private final int f;

   public ddk(String $$0, ddq $$1, dea $$2, czn $$3, float $$4, int $$5) {
      super($$0, $$2, $$3);
      this.d = $$1;
      this.e = $$4;
      this.f = $$5;
   }

   @Override
   public abstract deo<? extends ddk> a();

   @Override
   public abstract dep<? extends ddk> b();

   public float c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }

   public ddq e() {
      return this.d;
   }

   protected abstract czj f();

   @Override
   public List<dfk> g() {
      return List.of(new dfj(this.k().c(), dfq.a.c, new dfq.f(this.l()), new dfq.d(this.f()), this.f, this.e));
   }

   @FunctionalInterface
   public interface a<T extends ddk> {
      T create(String var1, ddq var2, dea var3, czn var4, float var5, int var6);
   }

   public static class b<T extends ddk> implements deo<T> {
      private final MapCodec<T> w;
      private final yw<wj, T> x;

      public b(ddk.a<T> $$0, int $$1) {
         this.w = RecordCodecBuilder.mapCodec(
            $$2 -> $$2.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dew::j),
                     ddq.d.fieldOf("category").orElse(ddq.c).forGetter(ddk::e),
                     dea.d.fieldOf("ingredient").forGetter(dew::k),
                     czn.e.fieldOf("result").forGetter(dew::l),
                     Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter(ddk::c),
                     Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter(ddk::d)
                  )
                  .apply($$2, $$0::create)
         );
         this.x = yw.a(yu.p, dew::j, ddq.e, ddk::e, dea.a, dew::k, czn.i, dew::l, yu.l, ddk::c, yu.g, ddk::d, $$0::create);
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
