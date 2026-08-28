import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public abstract class dcq implements dbz<dcr> {
   private final dbv c;
   private final cxk d;
   private final String e;
   @Nullable
   private dby f;

   public dcq(String $$0, dbv $$1, cxk $$2) {
      this.e = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public abstract dci<? extends dcq> a();

   @Override
   public abstract dcj<? extends dcq> b();

   public boolean a(dcr $$0, dha $$1) {
      return this.c.a($$0.c());
   }

   @Override
   public String j() {
      return this.e;
   }

   public dbv k() {
      return this.c;
   }

   protected cxk l() {
      return this.d;
   }

   @Override
   public dby ap_() {
      if (this.f == null) {
         this.f = dby.b(this.c);
      }

      return this.f;
   }

   public cxk a(dcr $$0, js.a $$1) {
      return this.d.v();
   }

   @FunctionalInterface
   public interface a<T extends dcq> {
      T create(String var1, dbv var2, cxk var3);
   }

   public static class b<T extends dcq> implements dci<T> {
      private final MapCodec<T> w;
      private final zt<xg, T> x;

      protected b(dcq.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dcq::j),
                     dbv.d.fieldOf("ingredient").forGetter(dcq::k),
                     cxk.d.fieldOf("result").forGetter(dcq::l)
                  )
                  .apply($$1, $$0::create)
         );
         this.x = zt.a(zr.o, dcq::j, dbv.a, dcq::k, cxk.i, dcq::l, $$0::create);
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
