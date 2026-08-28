import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public abstract class dbj extends dcv {
   private final dbp c;
   private final float d;
   private final int e;

   public dbj(String $$0, dbp $$1, dbz $$2, cxo $$3, float $$4, int $$5) {
      super($$0, $$2, $$3);
      this.c = $$1;
      this.d = $$4;
      this.e = $$5;
   }

   @Override
   public abstract dcn<? extends dbj> a();

   @Override
   public abstract dco<? extends dbj> b();

   public float c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public dbp e() {
      return this.c;
   }

   protected abstract cxk f();

   @Override
   public List<ddi> g() {
      return List.of(new ddh(this.k().b(), ddo.a.c, new ddo.f(this.l()), new ddo.d(this.f()), this.e, this.d));
   }

   @FunctionalInterface
   public interface a<T extends dbj> {
      T create(String var1, dbp var2, dbz var3, cxo var4, float var5, int var6);
   }

   public static class b<T extends dbj> implements dcn<T> {
      private final MapCodec<T> w;
      private final zt<xg, T> x;

      public b(dbj.a<T> $$0, int $$1) {
         this.w = RecordCodecBuilder.mapCodec(
            $$2 -> $$2.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dcv::j),
                     dbp.d.fieldOf("category").orElse(dbp.c).forGetter(dbj::e),
                     dbz.d.fieldOf("ingredient").forGetter(dcv::k),
                     cxo.d.fieldOf("result").forGetter(dcv::l),
                     Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter(dbj::c),
                     Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter(dbj::d)
                  )
                  .apply($$2, $$0::create)
         );
         this.x = zt.a(zr.o, dcv::j, dbp.e, dbj::e, dbz.a, dcv::k, cxo.h, dcv::l, zr.l, dbj::c, zr.g, dbj::d, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public zt<xg, T> b() {
         return this.x;
      }
   }
}
