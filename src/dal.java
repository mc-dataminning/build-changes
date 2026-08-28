import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public abstract class dal extends dbx {
   private final dar c;
   private final float d;
   private final int e;

   public dal(String $$0, dar $$1, dbb $$2, cwq $$3, float $$4, int $$5) {
      super($$0, $$2, $$3);
      this.c = $$1;
      this.d = $$4;
      this.e = $$5;
   }

   @Override
   public abstract dbp<? extends dal> a();

   @Override
   public abstract dbq<? extends dal> b();

   public float c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public dar e() {
      return this.c;
   }

   protected abstract cwm f();

   @Override
   public List<dck> g() {
      return List.of(new dcj(this.k().c(), dcq.a.c, new dcq.f(this.l()), new dcq.d(this.f()), this.e, this.d));
   }

   @FunctionalInterface
   public interface a<T extends dal> {
      T create(String var1, dar var2, dbb var3, cwq var4, float var5, int var6);
   }

   public static class b<T extends dal> implements dbp<T> {
      private final MapCodec<T> w;
      private final yn<wa, T> x;

      public b(dal.a<T> $$0, int $$1) {
         this.w = RecordCodecBuilder.mapCodec(
            $$2 -> $$2.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dbx::j),
                     dar.d.fieldOf("category").orElse(dar.c).forGetter(dal::e),
                     dbb.d.fieldOf("ingredient").forGetter(dbx::k),
                     cwq.d.fieldOf("result").forGetter(dbx::l),
                     Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter(dal::c),
                     Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter(dal::d)
                  )
                  .apply($$2, $$0::create)
         );
         this.x = yn.a(yl.o, dbx::j, dar.e, dal::e, dbb.a, dbx::k, cwq.h, dbx::l, yl.l, dal::c, yl.g, dal::d, $$0::create);
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
