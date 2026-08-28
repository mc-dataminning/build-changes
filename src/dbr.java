import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public abstract class dbr extends ddd {
   private final dbx c;
   private final float d;
   private final int e;

   public dbr(String $$0, dbx $$1, dch $$2, cxy $$3, float $$4, int $$5) {
      super($$0, $$2, $$3);
      this.c = $$1;
      this.d = $$4;
      this.e = $$5;
   }

   @Override
   public abstract dcv<? extends dbr> a();

   @Override
   public abstract dcw<? extends dbr> b();

   public float c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public dbx e() {
      return this.c;
   }

   protected abstract cxu f();

   @Override
   public List<ddr> g() {
      return List.of(new ddq(this.k().c(), ddx.a.c, new ddx.f(this.l()), new ddx.d(this.f()), this.e, this.d));
   }

   @FunctionalInterface
   public interface a<T extends dbr> {
      T create(String var1, dbx var2, dch var3, cxy var4, float var5, int var6);
   }

   public static class b<T extends dbr> implements dcv<T> {
      private final MapCodec<T> w;
      private final yt<wg, T> x;

      public b(dbr.a<T> $$0, int $$1) {
         this.w = RecordCodecBuilder.mapCodec(
            $$2 -> $$2.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(ddd::j),
                     dbx.d.fieldOf("category").orElse(dbx.c).forGetter(dbr::e),
                     dch.d.fieldOf("ingredient").forGetter(ddd::k),
                     cxy.e.fieldOf("result").forGetter(ddd::l),
                     Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter(dbr::c),
                     Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter(dbr::d)
                  )
                  .apply($$2, $$0::create)
         );
         this.x = yt.a(yr.o, ddd::j, dbx.e, dbr::e, dch.a, ddd::k, cxy.i, ddd::l, yr.l, dbr::c, yr.g, dbr::d, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public yt<wg, T> b() {
         return this.x;
      }
   }
}
