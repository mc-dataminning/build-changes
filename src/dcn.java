import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public abstract class dcn implements dbv<dco> {
   private final dbr c;
   private final cxg d;
   private final String e;
   @Nullable
   private dbu f;

   public dcn(String $$0, dbr $$1, cxg $$2) {
      this.e = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public abstract dcf<? extends dcn> a();

   @Override
   public abstract dcg<? extends dcn> b();

   public boolean a(dco $$0, dgz $$1) {
      return this.c.a($$0.c());
   }

   @Override
   public String j() {
      return this.e;
   }

   public dbr k() {
      return this.c;
   }

   protected cxg l() {
      return this.d;
   }

   @Override
   public dbu ap_() {
      if (this.f == null) {
         this.f = dbu.b(this.c);
      }

      return this.f;
   }

   public cxg a(dco $$0, js.a $$1) {
      return this.d.v();
   }

   @FunctionalInterface
   public interface a<T extends dcn> {
      T create(String var1, dbr var2, cxg var3);
   }

   public static class b<T extends dcn> implements dcf<T> {
      private final MapCodec<T> w;
      private final zi<wv, T> x;

      protected b(dcn.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dcn::j),
                     dbr.d.fieldOf("ingredient").forGetter(dcn::k),
                     cxg.c.fieldOf("result").forGetter(dcn::l)
                  )
                  .apply($$1, $$0::create)
         );
         this.x = zi.a(zg.o, dcn::j, dbr.a, dcn::k, cxg.h, dcn::l, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public zi<wv, T> b() {
         return this.x;
      }
   }
}
