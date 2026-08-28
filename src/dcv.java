import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public abstract class dcv implements dcd<dcw> {
   private final dbz c;
   private final cxo d;
   private final String e;
   @Nullable
   private dcc f;

   public dcv(String $$0, dbz $$1, cxo $$2) {
      this.e = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public abstract dcn<? extends dcv> a();

   @Override
   public abstract dco<? extends dcv> b();

   public boolean a(dcw $$0, dhh $$1) {
      return this.c.a($$0.c());
   }

   @Override
   public String j() {
      return this.e;
   }

   public dbz k() {
      return this.c;
   }

   protected cxo l() {
      return this.d;
   }

   @Override
   public dcc ap_() {
      if (this.f == null) {
         this.f = dcc.b(this.c);
      }

      return this.f;
   }

   public cxo a(dcw $$0, js.a $$1) {
      return this.d.v();
   }

   @FunctionalInterface
   public interface a<T extends dcv> {
      T create(String var1, dbz var2, cxo var3);
   }

   public static class b<T extends dcv> implements dcn<T> {
      private final MapCodec<T> w;
      private final zt<xg, T> x;

      protected b(dcv.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dcv::j),
                     dbz.d.fieldOf("ingredient").forGetter(dcv::k),
                     cxo.d.fieldOf("result").forGetter(dcv::l)
                  )
                  .apply($$1, $$0::create)
         );
         this.x = zt.a(zr.o, dcv::j, dbz.a, dcv::k, cxo.i, dcv::l, $$0::create);
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
