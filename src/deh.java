import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public abstract class deh extends dft {
   private final den d;
   private final float e;
   private final int f;

   public deh(String $$0, den $$1, dex $$2, dak $$3, float $$4, int $$5) {
      super($$0, $$2, $$3);
      this.d = $$1;
      this.e = $$4;
      this.f = $$5;
   }

   @Override
   public abstract dfl<? extends deh> a();

   @Override
   public abstract dfm<? extends deh> b();

   public float c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }

   public den e() {
      return this.d;
   }

   protected abstract dag f();

   @Override
   public List<dgh> g() {
      return List.of(new dgg(this.k().c(), dgn.a.c, new dgn.f(this.l()), new dgn.d(this.f()), this.f, this.e));
   }

   @FunctionalInterface
   public interface a<T extends deh> {
      T create(String var1, den var2, dex var3, dak var4, float var5, int var6);
   }

   public static class b<T extends deh> implements dfl<T> {
      private final MapCodec<T> w;
      private final ze<wp, T> x;

      public b(deh.a<T> $$0, int $$1) {
         this.w = RecordCodecBuilder.mapCodec(
            $$2 -> $$2.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dft::j),
                     den.d.fieldOf("category").orElse(den.c).forGetter(deh::e),
                     dex.d.fieldOf("ingredient").forGetter(dft::k),
                     dak.e.fieldOf("result").forGetter(dft::l),
                     Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter(deh::c),
                     Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter(deh::d)
                  )
                  .apply($$2, $$0::create)
         );
         this.x = ze.a(zc.p, dft::j, den.e, deh::e, dex.a, dft::k, dak.j, dft::l, zc.l, deh::c, zc.g, deh::d, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public ze<wp, T> b() {
         return this.x;
      }
   }
}
