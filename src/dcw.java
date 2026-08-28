import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public abstract class dcw implements dce<dcx> {
   private final dca c;
   private final cxp d;
   private final String e;
   @Nullable
   private dcd f;

   public dcw(String $$0, dca $$1, cxp $$2) {
      this.e = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public abstract dco<? extends dcw> a();

   @Override
   public abstract dcp<? extends dcw> b();

   public boolean a(dcx $$0, dhi $$1) {
      return this.c.a($$0.c());
   }

   @Override
   public String j() {
      return this.e;
   }

   public dca k() {
      return this.c;
   }

   protected cxp l() {
      return this.d;
   }

   @Override
   public dcd ap_() {
      if (this.f == null) {
         this.f = dcd.b(this.c);
      }

      return this.f;
   }

   public cxp a(dcx $$0, js.a $$1) {
      return this.d.v();
   }

   @FunctionalInterface
   public interface a<T extends dcw> {
      T create(String var1, dca var2, cxp var3);
   }

   public static class b<T extends dcw> implements dco<T> {
      private final MapCodec<T> w;
      private final zt<xg, T> x;

      protected b(dcw.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dcw::j),
                     dca.d.fieldOf("ingredient").forGetter(dcw::k),
                     cxp.c.fieldOf("result").forGetter(dcw::l)
                  )
                  .apply($$1, $$0::create)
         );
         this.x = zt.a(zr.o, dcw::j, dca.a, dcw::k, cxp.h, dcw::l, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public zt<xg, T> b() {
         return this.x;
      }
   }
}
