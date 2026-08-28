import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public abstract class dcv extends deh {
   private final ddb c;
   private final float d;
   private final int e;

   public dcv(String $$0, ddb $$1, ddl $$2, cyy $$3, float $$4, int $$5) {
      super($$0, $$2, $$3);
      this.c = $$1;
      this.d = $$4;
      this.e = $$5;
   }

   @Override
   public abstract ddz<? extends dcv> a();

   @Override
   public abstract dea<? extends dcv> b();

   public float c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public ddb e() {
      return this.c;
   }

   protected abstract cyu f();

   @Override
   public List<dev> g() {
      return List.of(new deu(this.k().c(), dfb.a.c, new dfb.f(this.l()), new dfb.d(this.f()), this.e, this.d));
   }

   @FunctionalInterface
   public interface a<T extends dcv> {
      T create(String var1, ddb var2, ddl var3, cyy var4, float var5, int var6);
   }

   public static class b<T extends dcv> implements ddz<T> {
      private final MapCodec<T> w;
      private final yw<wj, T> x;

      public b(dcv.a<T> $$0, int $$1) {
         this.w = RecordCodecBuilder.mapCodec(
            $$2 -> $$2.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(deh::j),
                     ddb.d.fieldOf("category").orElse(ddb.c).forGetter(dcv::e),
                     ddl.d.fieldOf("ingredient").forGetter(deh::k),
                     cyy.e.fieldOf("result").forGetter(deh::l),
                     Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter(dcv::c),
                     Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter(dcv::d)
                  )
                  .apply($$2, $$0::create)
         );
         this.x = yw.a(yu.o, deh::j, ddb.e, dcv::e, ddl.a, deh::k, cyy.i, deh::l, yu.l, dcv::c, yu.g, dcv::d, $$0::create);
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
