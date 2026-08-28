import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class czh implements cyt<bql> {
   protected final cyq a;
   protected final cun b;
   private final cyy<?> d;
   private final cyx<?> e;
   protected final String c;

   public czh(cyy<?> $$0, cyx<?> $$1, String $$2, cyq $$3, cun $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cyy<?> e() {
      return this.d;
   }

   @Override
   public cyx<?> ap_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cun a(jk.a $$0) {
      return this.b;
   }

   @Override
   public jr<cyq> a() {
      jr<cyq> $$0 = jr.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cun a(bql $$0, jk.a $$1) {
      return this.b.s();
   }

   public interface a<T extends czh> {
      T create(String var1, cyq var2, cun var3);
   }

   public static class b<T extends czh> implements cyx<T> {
      final czh.a<T> x;
      private final MapCodec<T> y;
      private final zm<wz, T> z;

      protected b(czh.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                     cyq.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cun.d.fieldOf("result").forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.z = zm.a(zk.l, $$0x -> $$0x.c, cyq.b, $$0x -> $$0x.a, cun.i, $$0x -> $$0x.b, $$0::create);
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
