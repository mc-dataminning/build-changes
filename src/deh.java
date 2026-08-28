import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public abstract class deh implements ddp<dei> {
   private final ddl c;
   private final cyy d;
   private final String e;
   @Nullable
   private ddo f;

   public deh(String $$0, ddl $$1, cyy $$2) {
      this.e = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public abstract ddz<? extends deh> a();

   @Override
   public abstract dea<? extends deh> b();

   public boolean a(dei $$0, div $$1) {
      return this.c.a($$0.c());
   }

   @Override
   public String j() {
      return this.e;
   }

   public ddl k() {
      return this.c;
   }

   protected cyy l() {
      return this.d;
   }

   @Override
   public ddo ak_() {
      if (this.f == null) {
         this.f = ddo.a(this.c);
      }

      return this.f;
   }

   public cyy a(dei $$0, jg.a $$1) {
      return this.d.v();
   }

   @FunctionalInterface
   public interface a<T extends deh> {
      T create(String var1, ddl var2, cyy var3);
   }

   public static class b<T extends deh> implements ddz<T> {
      private final MapCodec<T> w;
      private final yw<wj, T> x;

      protected b(deh.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(deh::j),
                     ddl.d.fieldOf("ingredient").forGetter(deh::k),
                     cyy.d.fieldOf("result").forGetter(deh::l)
                  )
                  .apply($$1, $$0::create)
         );
         this.x = yw.a(yu.o, deh::j, ddl.a, deh::k, cyy.i, deh::l, $$0::create);
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
