import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public abstract class dbo implements dba<dbp> {
   protected final daw a;
   protected final cwm b;
   private final dbg<?> d;
   private final dbf<?> e;
   protected final String c;
   @Nullable
   private daz f;

   public dbo(dbg<?> $$0, dbf<?> $$1, String $$2, daw $$3, cwm $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public dbg<?> e() {
      return this.d;
   }

   @Override
   public dbf<?> ap_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cwm a(js.a $$0) {
      return this.b;
   }

   @Override
   public daz a() {
      if (this.f == null) {
         this.f = daz.a(this.a);
      }

      return this.f;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   public cwm a(dbp $$0, js.a $$1) {
      return this.b.v();
   }

   public interface a<T extends dbo> {
      T create(String var1, daw var2, cwm var3);
   }

   public static class b<T extends dbo> implements dbf<T> {
      final dbo.a<T> w;
      private final MapCodec<T> x;
      private final zh<wu, T> y;

      protected b(dbo.a<T> $$0) {
         this.w = $$0;
         this.x = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                     daw.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cwm.d.fieldOf("result").forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.y = zh.a(zf.n, $$0x -> $$0x.c, daw.a, $$0x -> $$0x.a, cwm.i, $$0x -> $$0x.b, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.x;
      }

      @Override
      public zh<wu, T> b() {
         return this.y;
      }
   }
}
