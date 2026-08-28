import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cze implements cyq<bqi> {
   protected final cyn a;
   protected final cuk b;
   private final cyv<?> d;
   private final cyu<?> e;
   protected final String c;

   public cze(cyv<?> $$0, cyu<?> $$1, String $$2, cyn $$3, cuk $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cyv<?> e() {
      return this.d;
   }

   @Override
   public cyu<?> ap_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cuk a(jk.a $$0) {
      return this.b;
   }

   @Override
   public jr<cyn> a() {
      jr<cyn> $$0 = jr.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cuk a(bqi $$0, jk.a $$1) {
      return this.b.s();
   }

   public interface a<T extends cze> {
      T create(String var1, cyn var2, cuk var3);
   }

   public static class b<T extends cze> implements cyu<T> {
      final cze.a<T> x;
      private final MapCodec<T> y;
      private final zj<ww, T> z;

      protected b(cze.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                     cyn.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cuk.d.fieldOf("result").forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.z = zj.a(zh.l, $$0x -> $$0x.c, cyn.b, $$0x -> $$0x.a, cuk.i, $$0x -> $$0x.b, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.y;
      }

      @Override
      public zj<ww, T> b() {
         return this.z;
      }
   }
}
