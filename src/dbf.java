import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public abstract class dbf extends dcq {
   private final dbm c;
   private final float d;
   private final int e;

   public dbf(String $$0, dbm $$1, dbv $$2, cxk $$3, float $$4, int $$5) {
      super($$0, $$2, $$3);
      this.c = $$1;
      this.d = $$4;
      this.e = $$5;
   }

   @Override
   public abstract dci<? extends dbf> a();

   @Override
   public abstract dcj<? extends dbf> b();

   public float c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public dbm e() {
      return this.c;
   }

   protected abstract cxg f();

   @Override
   public List<ddc> g() {
      return List.of(new ddb(this.k().b(), ddi.a.c, new ddi.e(this.l()), new ddi.d(this.f())));
   }

   @FunctionalInterface
   public interface a<T extends dbf> {
      T create(String var1, dbm var2, dbv var3, cxk var4, float var5, int var6);
   }

   public static class b<T extends dbf> implements dci<T> {
      private final MapCodec<T> w;
      private final zt<xg, T> x;

      public b(dbf.a<T> $$0, int $$1) {
         this.w = RecordCodecBuilder.mapCodec(
            $$2 -> $$2.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dcq::j),
                     dbm.d.fieldOf("category").orElse(dbm.c).forGetter(dbf::e),
                     dbv.d.fieldOf("ingredient").forGetter(dcq::k),
                     cxk.e.fieldOf("result").forGetter(dcq::l),
                     Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter(dbf::c),
                     Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter(dbf::d)
                  )
                  .apply($$2, $$0::create)
         );
         this.x = zt.a(zr.o, dcq::j, dbm.e, dbf::e, dbv.a, dcq::k, cxk.i, dcq::l, zr.l, dbf::c, zr.g, dbf::d, $$0::create);
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
