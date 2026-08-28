import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class czk implements cyw<bqo> {
   protected final cyt a;
   protected final cuq b;
   private final czb<?> d;
   private final cza<?> e;
   protected final String c;

   public czk(czb<?> $$0, cza<?> $$1, String $$2, cyt $$3, cuq $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public czb<?> e() {
      return this.d;
   }

   @Override
   public cza<?> ao_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cuq a(jk.a $$0) {
      return this.b;
   }

   @Override
   public jr<cyt> a() {
      jr<cyt> $$0 = jr.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cuq a(bqo $$0, jk.a $$1) {
      return this.b.s();
   }

   public interface a<T extends czk> {
      T create(String var1, cyt var2, cuq var3);
   }

   public static class b<T extends czk> implements cza<T> {
      final czk.a<T> x;
      private final MapCodec<T> y;
      private final zn<xa, T> z;

      protected b(czk.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                     cyt.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cuq.d.fieldOf("result").forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.z = zn.a(zl.l, $$0x -> $$0x.c, cyt.b, $$0x -> $$0x.a, cuq.i, $$0x -> $$0x.b, $$0::create);
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
