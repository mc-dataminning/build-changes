import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class czi implements cyu<bqm> {
   protected final cyr a;
   protected final cuo b;
   private final cyz<?> d;
   private final cyy<?> e;
   protected final String c;

   public czi(cyz<?> $$0, cyy<?> $$1, String $$2, cyr $$3, cuo $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cyz<?> e() {
      return this.d;
   }

   @Override
   public cyy<?> ao_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cuo a(jk.a $$0) {
      return this.b;
   }

   @Override
   public jr<cyr> a() {
      jr<cyr> $$0 = jr.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cuo a(bqm $$0, jk.a $$1) {
      return this.b.s();
   }

   public interface a<T extends czi> {
      T create(String var1, cyr var2, cuo var3);
   }

   public static class b<T extends czi> implements cyy<T> {
      final czi.a<T> x;
      private final MapCodec<T> y;
      private final zm<wz, T> z;

      protected b(czi.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                     cyr.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cuo.d.fieldOf("result").forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.z = zm.a(zk.l, $$0x -> $$0x.c, cyr.b, $$0x -> $$0x.a, cuo.i, $$0x -> $$0x.b, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.y;
      }

      @Override
      public zm<wz, T> b() {
         return this.z;
      }
   }
}
