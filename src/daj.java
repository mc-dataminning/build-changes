import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public abstract class daj extends dbv {
   private final dap c;
   private final float d;
   private final int e;

   public daj(String $$0, dap $$1, daz $$2, cwo $$3, float $$4, int $$5) {
      super($$0, $$2, $$3);
      this.c = $$1;
      this.d = $$4;
      this.e = $$5;
   }

   @Override
   public abstract dbn<? extends daj> a();

   @Override
   public abstract dbo<? extends daj> b();

   public float c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public dap e() {
      return this.c;
   }

   protected abstract cwk f();

   @Override
   public List<dci> g() {
      return List.of(new dch(this.k().c(), dco.a.c, new dco.f(this.l()), new dco.d(this.f()), this.e, this.d));
   }

   @FunctionalInterface
   public interface a<T extends daj> {
      T create(String var1, dap var2, daz var3, cwo var4, float var5, int var6);
   }

   public static class b<T extends daj> implements dbn<T> {
      private final MapCodec<T> w;
      private final yn<wa, T> x;

      public b(daj.a<T> $$0, int $$1) {
         this.w = RecordCodecBuilder.mapCodec(
            $$2 -> $$2.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dbv::j),
                     dap.d.fieldOf("category").orElse(dap.c).forGetter(daj::e),
                     daz.d.fieldOf("ingredient").forGetter(dbv::k),
                     cwo.d.fieldOf("result").forGetter(dbv::l),
                     Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter(daj::c),
                     Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter(daj::d)
                  )
                  .apply($$2, $$0::create)
         );
         this.x = yn.a(yl.o, dbv::j, dap.e, daj::e, daz.a, dbv::k, cwo.h, dbv::l, yl.l, daj::c, yl.g, daj::d, $$0::create);
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
