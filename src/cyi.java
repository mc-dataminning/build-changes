import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cyi implements cxu<bpn> {
   protected final cxr a;
   protected final cto b;
   private final cxz<?> d;
   private final cxy<?> e;
   protected final String c;

   public cyi(cxz<?> $$0, cxy<?> $$1, String $$2, cxr $$3, cto $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cxz<?> e() {
      return this.d;
   }

   @Override
   public cxy<?> ao_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cto a(iz.a $$0) {
      return this.b;
   }

   @Override
   public jg<cxr> a() {
      jg<cxr> $$0 = jg.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cto a(bpn $$0, iz.a $$1) {
      return this.b.s();
   }

   public interface a<T extends cyi> {
      T create(String var1, cxr var2, cto var3);
   }

   public static class b<T extends cyi> implements cxy<T> {
      final cyi.a<T> x;
      private final MapCodec<T> y;
      private final yv<wi, T> z;

      protected b(cyi.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                     cxr.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cto.a.fieldOf("result").forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.z = yv.a(yt.k, $$0x -> $$0x.c, cxr.b, $$0x -> $$0x.a, cto.f, $$0x -> $$0x.b, $$0::create);
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
