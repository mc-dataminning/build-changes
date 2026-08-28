import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public abstract class ddd implements dcl<dde> {
   private final dch c;
   private final cxy d;
   private final String e;
   @Nullable
   private dck f;

   public ddd(String $$0, dch $$1, cxy $$2) {
      this.e = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public abstract dcv<? extends ddd> a();

   @Override
   public abstract dcw<? extends ddd> b();

   public boolean a(dde $$0, dhp $$1) {
      return this.c.a($$0.c());
   }

   @Override
   public String j() {
      return this.e;
   }

   public dch k() {
      return this.c;
   }

   protected cxy l() {
      return this.d;
   }

   @Override
   public dck ak_() {
      if (this.f == null) {
         this.f = dck.a(this.c);
      }

      return this.f;
   }

   public cxy a(dde $$0, ju.a $$1) {
      return this.d.v();
   }

   @FunctionalInterface
   public interface a<T extends ddd> {
      T create(String var1, dch var2, cxy var3);
   }

   public static class b<T extends ddd> implements dcv<T> {
      private final MapCodec<T> w;
      private final yt<wg, T> x;

      protected b(ddd.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(ddd::j),
                     dch.d.fieldOf("ingredient").forGetter(ddd::k),
                     cxy.d.fieldOf("result").forGetter(ddd::l)
                  )
                  .apply($$1, $$0::create)
         );
         this.x = yt.a(yr.o, ddd::j, dch.a, ddd::k, cxy.i, ddd::l, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public yt<wg, T> b() {
         return this.x;
      }
   }
}
