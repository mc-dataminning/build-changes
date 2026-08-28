import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public abstract class dai extends dbu {
   private final dao c;
   private final float d;
   private final int e;

   public dai(String $$0, dao $$1, day $$2, cwn $$3, float $$4, int $$5) {
      super($$0, $$2, $$3);
      this.c = $$1;
      this.d = $$4;
      this.e = $$5;
   }

   @Override
   public abstract dbm<? extends dai> a();

   @Override
   public abstract dbn<? extends dai> b();

   public float c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public dao e() {
      return this.c;
   }

   protected abstract cwj f();

   @Override
   public List<dch> g() {
      return List.of(new dcg(this.k().c(), dcn.a.c, new dcn.f(this.l()), new dcn.d(this.f()), this.e, this.d));
   }

   @FunctionalInterface
   public interface a<T extends dai> {
      T create(String var1, dao var2, day var3, cwn var4, float var5, int var6);
   }

   public static class b<T extends dai> implements dbm<T> {
      private final MapCodec<T> w;
      private final ym<vz, T> x;

      public b(dai.a<T> $$0, int $$1) {
         this.w = RecordCodecBuilder.mapCodec(
            $$2 -> $$2.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dbu::j),
                     dao.d.fieldOf("category").orElse(dao.c).forGetter(dai::e),
                     day.d.fieldOf("ingredient").forGetter(dbu::k),
                     cwn.d.fieldOf("result").forGetter(dbu::l),
                     Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter(dai::c),
                     Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter(dai::d)
                  )
                  .apply($$2, $$0::create)
         );
         this.x = ym.a(yk.o, dbu::j, dao.e, dai::e, day.a, dbu::k, cwn.h, dbu::l, yk.l, dai::c, yk.g, dai::d, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public ym<vz, T> b() {
         return this.x;
      }
   }
}
