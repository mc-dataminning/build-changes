import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public abstract class dai implements czt<daj> {
   protected final czp a;
   protected final cvl b;
   private final czz<?> d;
   private final czy<?> e;
   protected final String c;
   @Nullable
   private czs f;

   public dai(czz<?> $$0, czy<?> $$1, String $$2, czp $$3, cvl $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public czz<?> e() {
      return this.d;
   }

   @Override
   public czy<?> as_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cvl a(jp.a $$0) {
      return this.b;
   }

   @Override
   public czs a() {
      if (this.f == null) {
         this.f = czs.a(this.a);
      }

      return this.f;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   public cvl a(daj $$0, jp.a $$1) {
      return this.b.u();
   }

   public interface a<T extends dai> {
      T create(String var1, czp var2, cvl var3);
   }

   public static class b<T extends dai> implements czy<T> {
      final dai.a<T> w;
      private final MapCodec<T> x;
      private final zb<wo, T> y;

      protected b(dai.a<T> $$0) {
         this.w = $$0;
         this.x = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                     czp.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cvl.d.fieldOf("result").forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.y = zb.a(yz.l, $$0x -> $$0x.c, czp.a, $$0x -> $$0x.a, cvl.i, $$0x -> $$0x.b, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.x;
      }

      @Override
      public zb<wo, T> b() {
         return this.y;
      }
   }
}
