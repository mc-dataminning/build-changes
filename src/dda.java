import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public abstract class dda extends dem {
   private final ddg c;
   private final float d;
   private final int e;

   public dda(String $$0, ddg $$1, ddq $$2, czd $$3, float $$4, int $$5) {
      super($$0, $$2, $$3);
      this.c = $$1;
      this.d = $$4;
      this.e = $$5;
   }

   @Override
   public abstract dee<? extends dda> a();

   @Override
   public abstract def<? extends dda> b();

   public float c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public ddg e() {
      return this.c;
   }

   protected abstract cyz f();

   @Override
   public List<dfa> g() {
      return List.of(new dez(this.k().c(), dfg.a.c, new dfg.f(this.l()), new dfg.d(this.f()), this.e, this.d));
   }

   @FunctionalInterface
   public interface a<T extends dda> {
      T create(String var1, ddg var2, ddq var3, czd var4, float var5, int var6);
   }

   public static class b<T extends dda> implements dee<T> {
      private final MapCodec<T> w;
      private final yw<wj, T> x;

      public b(dda.a<T> $$0, int $$1) {
         this.w = RecordCodecBuilder.mapCodec(
            $$2 -> $$2.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dem::j),
                     ddg.d.fieldOf("category").orElse(ddg.c).forGetter(dda::e),
                     ddq.d.fieldOf("ingredient").forGetter(dem::k),
                     czd.e.fieldOf("result").forGetter(dem::l),
                     Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter(dda::c),
                     Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter(dda::d)
                  )
                  .apply($$2, $$0::create)
         );
         this.x = yw.a(yu.o, dem::j, ddg.e, dda::e, ddq.a, dem::k, czd.i, dem::l, yu.l, dda::c, yu.g, dda::d, $$0::create);
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
