import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public abstract class dbw implements dbe<dbx> {
   private final dba c;
   private final cwp d;
   private final String e;
   @Nullable
   private dbd f;

   public dbw(String $$0, dba $$1, cwp $$2) {
      this.e = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public abstract dbo<? extends dbw> a();

   @Override
   public abstract dbp<? extends dbw> b();

   public boolean a(dbx $$0, dgi $$1) {
      return this.c.a($$0.c());
   }

   @Override
   public String j() {
      return this.e;
   }

   public dba k() {
      return this.c;
   }

   protected cwp l() {
      return this.d;
   }

   @Override
   public dbd ao_() {
      if (this.f == null) {
         this.f = dbd.b(this.c);
      }

      return this.f;
   }

   public cwp a(dbx $$0, jt.a $$1) {
      return this.d.v();
   }

   @FunctionalInterface
   public interface a<T extends dbw> {
      T create(String var1, dba var2, cwp var3);
   }

   public static class b<T extends dbw> implements dbo<T> {
      private final MapCodec<T> w;
      private final ym<vz, T> x;

      protected b(dbw.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dbw::j),
                     dba.d.fieldOf("ingredient").forGetter(dbw::k),
                     cwp.c.fieldOf("result").forGetter(dbw::l)
                  )
                  .apply($$1, $$0::create)
         );
         this.x = ym.a(yk.o, dbw::j, dba.a, dbw::k, cwp.h, dbw::l, $$0::create);
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
