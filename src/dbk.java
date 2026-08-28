import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public abstract class dbk extends dcw {
   private final dbq c;
   private final float d;
   private final int e;

   public dbk(String $$0, dbq $$1, dca $$2, cxp $$3, float $$4, int $$5) {
      super($$0, $$2, $$3);
      this.c = $$1;
      this.d = $$4;
      this.e = $$5;
   }

   @Override
   public abstract dco<? extends dbk> a();

   @Override
   public abstract dcp<? extends dbk> b();

   public float c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public dbq e() {
      return this.c;
   }

   protected abstract cxl f();

   @Override
   public List<ddj> g() {
      return List.of(new ddi(this.k().b(), ddp.a.c, new ddp.f(this.l()), new ddp.d(this.f()), this.e, this.d));
   }

   @FunctionalInterface
   public interface a<T extends dbk> {
      T create(String var1, dbq var2, dca var3, cxp var4, float var5, int var6);
   }

   public static class b<T extends dbk> implements dco<T> {
      private final MapCodec<T> w;
      private final zt<xg, T> x;

      public b(dbk.a<T> $$0, int $$1) {
         this.w = RecordCodecBuilder.mapCodec(
            $$2 -> $$2.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dcw::j),
                     dbq.d.fieldOf("category").orElse(dbq.c).forGetter(dbk::e),
                     dca.d.fieldOf("ingredient").forGetter(dcw::k),
                     cxp.d.fieldOf("result").forGetter(dcw::l),
                     Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter(dbk::c),
                     Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter(dbk::d)
                  )
                  .apply($$2, $$0::create)
         );
         this.x = zt.a(zr.o, dcw::j, dbq.e, dbk::e, dca.a, dcw::k, cxp.h, dcw::l, zr.l, dbk::c, zr.g, dbk::d, $$0::create);
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
