import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class czm implements cyx<czn> {
   protected final cyu a;
   protected final cuo b;
   private final czd<?> d;
   private final czc<?> e;
   protected final String c;

   public czm(czd<?> $$0, czc<?> $$1, String $$2, cyu $$3, cuo $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public czd<?> e() {
      return this.d;
   }

   @Override
   public czc<?> ap_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cuo a(jo.a $$0) {
      return this.b;
   }

   @Override
   public jv<cyu> a() {
      jv<cyu> $$0 = jv.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   public cuo a(czn $$0, jo.a $$1) {
      return this.b.s();
   }

   public interface a<T extends czm> {
      T create(String var1, cyu var2, cuo var3);
   }

   public static class b<T extends czm> implements czc<T> {
      final czm.a<T> x;
      private final MapCodec<T> y;
      private final yw<wj, T> z;

      protected b(czm.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                     cyu.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cuo.d.fieldOf("result").forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.z = yw.a(yu.l, $$0x -> $$0x.c, cyu.b, $$0x -> $$0x.a, cuo.i, $$0x -> $$0x.b, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.y;
      }

      @Override
      public yw<wj, T> b() {
         return this.z;
      }
   }
}
