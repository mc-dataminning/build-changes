import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public abstract class deb implements ddj<dec> {
   private final ddf c;
   private final cys d;
   private final String e;
   @Nullable
   private ddi f;

   public deb(String $$0, ddf $$1, cys $$2) {
      this.e = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public abstract ddt<? extends deb> a();

   @Override
   public abstract ddu<? extends deb> b();

   public boolean a(dec $$0, dip $$1) {
      return this.c.a($$0.c());
   }

   @Override
   public String j() {
      return this.e;
   }

   public ddf k() {
      return this.c;
   }

   protected cys l() {
      return this.d;
   }

   @Override
   public ddi ak_() {
      if (this.f == null) {
         this.f = ddi.a(this.c);
      }

      return this.f;
   }

   public cys a(dec $$0, jg.a $$1) {
      return this.d.v();
   }

   @FunctionalInterface
   public interface a<T extends deb> {
      T create(String var1, ddf var2, cys var3);
   }

   public static class b<T extends deb> implements ddt<T> {
      private final MapCodec<T> w;
      private final yu<wh, T> x;

      protected b(deb.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(deb::j),
                     ddf.d.fieldOf("ingredient").forGetter(deb::k),
                     cys.d.fieldOf("result").forGetter(deb::l)
                  )
                  .apply($$1, $$0::create)
         );
         this.x = yu.a(ys.o, deb::j, ddf.a, deb::k, cys.i, deb::l, $$0::create);
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
