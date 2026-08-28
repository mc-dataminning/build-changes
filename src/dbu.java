import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public abstract class dbu implements dbc<dbv> {
   private final day c;
   private final cwn d;
   private final String e;
   @Nullable
   private dbb f;

   public dbu(String $$0, day $$1, cwn $$2) {
      this.e = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public abstract dbm<? extends dbu> a();

   @Override
   public abstract dbn<? extends dbu> b();

   public boolean a(dbv $$0, dgg $$1) {
      return this.c.a($$0.c());
   }

   @Override
   public String j() {
      return this.e;
   }

   public day k() {
      return this.c;
   }

   protected cwn l() {
      return this.d;
   }

   @Override
   public dbb ao_() {
      if (this.f == null) {
         this.f = dbb.a(this.c);
      }

      return this.f;
   }

   public cwn a(dbv $$0, jt.a $$1) {
      return this.d.v();
   }

   @FunctionalInterface
   public interface a<T extends dbu> {
      T create(String var1, day var2, cwn var3);
   }

   public static class b<T extends dbu> implements dbm<T> {
      private final MapCodec<T> w;
      private final ym<vz, T> x;

      protected b(dbu.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dbu::j),
                     day.d.fieldOf("ingredient").forGetter(dbu::k),
                     cwn.c.fieldOf("result").forGetter(dbu::l)
                  )
                  .apply($$1, $$0::create)
         );
         this.x = ym.a(yk.o, dbu::j, day.a, dbu::k, cwn.h, dbu::l, $$0::create);
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
