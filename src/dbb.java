import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public abstract class dbb extends dcn {
   private final dbh c;
   private final float d;
   private final int e;

   public dbb(String $$0, dbh $$1, dbr $$2, cxh $$3, float $$4, int $$5) {
      super($$0, $$2, $$3);
      this.c = $$1;
      this.d = $$4;
      this.e = $$5;
   }

   @Override
   public abstract dcf<? extends dbb> a();

   @Override
   public abstract dcg<? extends dbb> b();

   public float c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public dbh e() {
      return this.c;
   }

   protected abstract cxd f();

   @Override
   public List<ddb> g() {
      return List.of(new dda(this.k().c(), ddh.a.c, new ddh.f(this.l()), new ddh.d(this.f()), this.e, this.d));
   }

   @FunctionalInterface
   public interface a<T extends dbb> {
      T create(String var1, dbh var2, dbr var3, cxh var4, float var5, int var6);
   }

   public static class b<T extends dbb> implements dcf<T> {
      private final MapCodec<T> w;
      private final yn<wa, T> x;

      public b(dbb.a<T> $$0, int $$1) {
         this.w = RecordCodecBuilder.mapCodec(
            $$2 -> $$2.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dcn::j),
                     dbh.d.fieldOf("category").orElse(dbh.c).forGetter(dbb::e),
                     dbr.d.fieldOf("ingredient").forGetter(dcn::k),
                     cxh.e.fieldOf("result").forGetter(dcn::l),
                     Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter(dbb::c),
                     Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter(dbb::d)
                  )
                  .apply($$2, $$0::create)
         );
         this.x = yn.a(yl.o, dcn::j, dbh.e, dbb::e, dbr.a, dcn::k, cxh.i, dcn::l, yl.l, dbb::c, yl.g, dbb::d, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public yn<wa, T> b() {
         return this.x;
      }
   }
}
