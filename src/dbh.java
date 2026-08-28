import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public abstract class dbh implements dat<dbi> {
   protected final dap a;
   protected final cwf b;
   private final daz<?> d;
   private final day<?> e;
   protected final String c;
   @Nullable
   private das f;

   public dbh(daz<?> $$0, day<?> $$1, String $$2, dap $$3, cwf $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public daz<?> e() {
      return this.d;
   }

   @Override
   public day<?> aq_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cwf a(js.a $$0) {
      return this.b;
   }

   @Override
   public das a() {
      if (this.f == null) {
         this.f = das.a(this.a);
      }

      return this.f;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   public cwf a(dbi $$0, js.a $$1) {
      return this.b.v();
   }

   public interface a<T extends dbh> {
      T create(String var1, dap var2, cwf var3);
   }

   public static class b<T extends dbh> implements day<T> {
      final dbh.a<T> w;
      private final MapCodec<T> x;
      private final zj<ww, T> y;

      protected b(dbh.a<T> $$0) {
         this.w = $$0;
         this.x = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                     dap.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cwf.d.fieldOf("result").forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.y = zj.a(zh.m, $$0x -> $$0x.c, dap.a, $$0x -> $$0x.a, cwf.i, $$0x -> $$0x.b, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.x;
      }

      @Override
      public zj<ww, T> b() {
         return this.y;
      }
   }
}
