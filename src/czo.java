import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class czo implements cyz<czp> {
   protected final cyw a;
   protected final cuq b;
   private final czf<?> d;
   private final cze<?> e;
   protected final String c;

   public czo(czf<?> $$0, cze<?> $$1, String $$2, cyw $$3, cuq $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public czf<?> e() {
      return this.d;
   }

   @Override
   public cze<?> at_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cuq a(jo.a $$0) {
      return this.b;
   }

   @Override
   public jv<cyw> a() {
      jv<cyw> $$0 = jv.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   public cuq a(czp $$0, jo.a $$1) {
      return this.b.s();
   }

   public interface a<T extends czo> {
      T create(String var1, cyw var2, cuq var3);
   }

   public static class b<T extends czo> implements cze<T> {
      final czo.a<T> x;
      private final MapCodec<T> y;
      private final yx<wk, T> z;

      protected b(czo.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                     cyw.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cuq.d.fieldOf("result").forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.z = yx.a(yv.l, $$0x -> $$0x.c, cyw.b, $$0x -> $$0x.a, cuq.i, $$0x -> $$0x.b, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.y;
      }

      @Override
      public yx<wk, T> b() {
         return this.z;
      }
   }
}
