import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cyk implements cxw<bpp> {
   protected final cxt a;
   protected final ctq b;
   private final cyb<?> d;
   private final cya<?> e;
   protected final String c;

   public cyk(cyb<?> $$0, cya<?> $$1, String $$2, cxt $$3, ctq $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cyb<?> e() {
      return this.d;
   }

   @Override
   public cya<?> ap_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public ctq a(iz.a $$0) {
      return this.b;
   }

   @Override
   public jg<cxt> a() {
      jg<cxt> $$0 = jg.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public ctq a(bpp $$0, iz.a $$1) {
      return this.b.s();
   }

   public interface a<T extends cyk> {
      T create(String var1, cxt var2, ctq var3);
   }

   public static class b<T extends cyk> implements cya<T> {
      final cyk.a<T> x;
      private final MapCodec<T> y;
      private final yv<wi, T> z;

      protected b(cyk.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                     cxt.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     ctq.a.fieldOf("result").forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.z = yv.a(yt.k, $$0x -> $$0x.c, cxt.b, $$0x -> $$0x.a, ctq.f, $$0x -> $$0x.b, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.y;
      }

      @Override
      public yv<wi, T> b() {
         return this.z;
      }
   }
}
