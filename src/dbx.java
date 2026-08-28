import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public abstract class dbx implements dbf<dby> {
   private final dbb c;
   private final cwq d;
   private final String e;
   @Nullable
   private dbe f;

   public dbx(String $$0, dbb $$1, cwq $$2) {
      this.e = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public abstract dbp<? extends dbx> a();

   @Override
   public abstract dbq<? extends dbx> b();

   public boolean a(dby $$0, dgj $$1) {
      return this.c.a($$0.c());
   }

   @Override
   public String j() {
      return this.e;
   }

   public dbb k() {
      return this.c;
   }

   protected cwq l() {
      return this.d;
   }

   @Override
   public dbe ao_() {
      if (this.f == null) {
         this.f = dbe.a(this.c);
      }

      return this.f;
   }

   public cwq a(dby $$0, jt.a $$1) {
      return this.d.v();
   }

   @FunctionalInterface
   public interface a<T extends dbx> {
      T create(String var1, dbb var2, cwq var3);
   }

   public static class b<T extends dbx> implements dbp<T> {
      private final MapCodec<T> w;
      private final yn<wa, T> x;

      protected b(dbx.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dbx::j),
                     dbb.d.fieldOf("ingredient").forGetter(dbx::k),
                     cwq.c.fieldOf("result").forGetter(dbx::l)
                  )
                  .apply($$1, $$0::create)
         );
         this.x = yn.a(yl.o, dbx::j, dbb.a, dbx::k, cwq.h, dbx::l, $$0::create);
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
