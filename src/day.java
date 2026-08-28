import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public abstract class day implements daj<daz> {
   protected final daf a;
   protected final cvx b;
   private final dap<?> d;
   private final dao<?> e;
   protected final String c;
   @Nullable
   private dai f;

   public day(dap<?> $$0, dao<?> $$1, String $$2, daf $$3, cvx $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public dap<?> e() {
      return this.d;
   }

   @Override
   public dao<?> ar_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cvx a(jr.a $$0) {
      return this.b;
   }

   @Override
   public dai a() {
      if (this.f == null) {
         this.f = dai.a(this.a);
      }

      return this.f;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   public cvx a(daz $$0, jr.a $$1) {
      return this.b.v();
   }

   public interface a<T extends day> {
      T create(String var1, daf var2, cvx var3);
   }

   public static class b<T extends day> implements dao<T> {
      final day.a<T> w;
      private final MapCodec<T> x;
      private final zf<ws, T> y;

      protected b(day.a<T> $$0) {
         this.w = $$0;
         this.x = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                     daf.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cvx.d.fieldOf("result").forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.y = zf.a(zd.m, $$0x -> $$0x.c, daf.a, $$0x -> $$0x.a, cvx.i, $$0x -> $$0x.b, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.x;
      }

      @Override
      public zf<ws, T> b() {
         return this.y;
      }
   }
}
