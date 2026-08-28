import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class czj implements cyv<bqn> {
   protected final cys a;
   protected final cup b;
   private final cza<?> d;
   private final cyz<?> e;
   protected final String c;

   public czj(cza<?> $$0, cyz<?> $$1, String $$2, cys $$3, cup $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cza<?> e() {
      return this.d;
   }

   @Override
   public cyz<?> ao_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cup a(jk.a $$0) {
      return this.b;
   }

   @Override
   public jr<cys> a() {
      jr<cys> $$0 = jr.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cup a(bqn $$0, jk.a $$1) {
      return this.b.s();
   }

   public interface a<T extends czj> {
      T create(String var1, cys var2, cup var3);
   }

   public static class b<T extends czj> implements cyz<T> {
      final czj.a<T> x;
      private final MapCodec<T> y;
      private final zn<xa, T> z;

      protected b(czj.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                     cys.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cup.d.fieldOf("result").forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.z = zn.a(zl.l, $$0x -> $$0x.c, cys.b, $$0x -> $$0x.a, cup.i, $$0x -> $$0x.b, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.y;
      }

      @Override
      public zn<xa, T> b() {
         return this.z;
      }
   }
}
