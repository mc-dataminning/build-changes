import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public abstract class ddv extends dfh {
   private final deb d;
   private final float e;
   private final int f;

   public ddv(String $$0, deb $$1, del $$2, czy $$3, float $$4, int $$5) {
      super($$0, $$2, $$3);
      this.d = $$1;
      this.e = $$4;
      this.f = $$5;
   }

   @Override
   public abstract dez<? extends ddv> a();

   @Override
   public abstract dfa<? extends ddv> b();

   public float c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }

   public deb e() {
      return this.d;
   }

   protected abstract czu f();

   @Override
   public List<dfv> g() {
      return List.of(new dfu(this.k().c(), dgb.a.c, new dgb.f(this.l()), new dgb.d(this.f()), this.f, this.e));
   }

   @FunctionalInterface
   public interface a<T extends ddv> {
      T create(String var1, deb var2, del var3, czy var4, float var5, int var6);
   }

   public static class b<T extends ddv> implements dez<T> {
      private final MapCodec<T> w;
      private final yy<wl, T> x;

      public b(ddv.a<T> $$0, int $$1) {
         this.w = RecordCodecBuilder.mapCodec(
            $$2 -> $$2.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dfh::j),
                     deb.d.fieldOf("category").orElse(deb.c).forGetter(ddv::e),
                     del.d.fieldOf("ingredient").forGetter(dfh::k),
                     czy.e.fieldOf("result").forGetter(dfh::l),
                     Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter(ddv::c),
                     Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter(ddv::d)
                  )
                  .apply($$2, $$0::create)
         );
         this.x = yy.a(yw.p, dfh::j, deb.e, ddv::e, del.a, dfh::k, czy.i, dfh::l, yw.l, ddv::c, yw.g, ddv::d, $$0::create);
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
