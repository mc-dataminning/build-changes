import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public abstract class dbb extends dcn {
   private final dbh c;
   private final float d;
   private final int e;

   public dbb(String $$0, dbh $$1, dbr $$2, cxg $$3, float $$4, int $$5) {
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

   protected abstract cxc f();

   @Override
   public List<dda> g() {
      return List.of(new dcz(this.k().b(), ddg.a.c, new ddg.f(this.l()), new ddg.d(this.f()), this.e, this.d));
   }

   @FunctionalInterface
   public interface a<T extends dbb> {
      T create(String var1, dbh var2, dbr var3, cxg var4, float var5, int var6);
   }

   public static class b<T extends dbb> implements dcf<T> {
      private final MapCodec<T> w;
      private final zi<wv, T> x;

      public b(dbb.a<T> $$0, int $$1) {
         this.w = RecordCodecBuilder.mapCodec(
            $$2 -> $$2.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dcn::j),
                     dbh.d.fieldOf("category").orElse(dbh.c).forGetter(dbb::e),
                     dbr.d.fieldOf("ingredient").forGetter(dcn::k),
                     cxg.d.fieldOf("result").forGetter(dcn::l),
                     Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter(dbb::c),
                     Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter(dbb::d)
                  )
                  .apply($$2, $$0::create)
         );
         this.x = zi.a(zg.o, dcn::j, dbh.e, dbb::e, dbr.a, dcn::k, cxg.h, dcn::l, zg.l, dbb::c, zg.g, dbb::d, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public zi<wv, T> b() {
         return this.x;
      }
   }
}
