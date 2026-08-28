import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public abstract class dcp extends deb {
   private final dcv c;
   private final float d;
   private final int e;

   public dcp(String $$0, dcv $$1, ddf $$2, cys $$3, float $$4, int $$5) {
      super($$0, $$2, $$3);
      this.c = $$1;
      this.d = $$4;
      this.e = $$5;
   }

   @Override
   public abstract ddt<? extends dcp> a();

   @Override
   public abstract ddu<? extends dcp> b();

   public float c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }

   public dcv e() {
      return this.c;
   }

   protected abstract cyo f();

   @Override
   public List<dep> g() {
      return List.of(new deo(this.k().c(), dev.a.c, new dev.f(this.l()), new dev.d(this.f()), this.e, this.d));
   }

   @FunctionalInterface
   public interface a<T extends dcp> {
      T create(String var1, dcv var2, ddf var3, cys var4, float var5, int var6);
   }

   public static class b<T extends dcp> implements ddt<T> {
      private final MapCodec<T> w;
      private final yu<wh, T> x;

      public b(dcp.a<T> $$0, int $$1) {
         this.w = RecordCodecBuilder.mapCodec(
            $$2 -> $$2.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(deb::j),
                     dcv.d.fieldOf("category").orElse(dcv.c).forGetter(dcp::e),
                     ddf.d.fieldOf("ingredient").forGetter(deb::k),
                     cys.e.fieldOf("result").forGetter(deb::l),
                     Codec.FLOAT.fieldOf("experience").orElse(0.0F).forGetter(dcp::c),
                     Codec.INT.fieldOf("cookingtime").orElse($$1).forGetter(dcp::d)
                  )
                  .apply($$2, $$0::create)
         );
         this.x = yu.a(ys.o, deb::j, dcv.e, dcp::e, ddf.a, deb::k, cys.i, deb::l, ys.l, dcp::c, ys.g, dcp::d, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public yu<wh, T> b() {
         return this.x;
      }
   }
}
