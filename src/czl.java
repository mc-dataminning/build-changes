import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class czl implements cyx<bqp> {
   protected final cyu a;
   protected final cur b;
   private final czc<?> d;
   private final czb<?> e;
   protected final String c;

   public czl(czc<?> $$0, czb<?> $$1, String $$2, cyu $$3, cur $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public czc<?> e() {
      return this.d;
   }

   @Override
   public czb<?> ao_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cur a(jk.a $$0) {
      return this.b;
   }

   @Override
   public jr<cyu> a() {
      jr<cyu> $$0 = jr.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cur a(bqp $$0, jk.a $$1) {
      return this.b.s();
   }

   public interface a<T extends czl> {
      T create(String var1, cyu var2, cur var3);
   }

   public static class b<T extends czl> implements czb<T> {
      final czl.a<T> x;
      private final MapCodec<T> y;
      private final zn<xa, T> z;

      protected b(czl.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                     cyu.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cur.d.fieldOf("result").forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.z = zn.a(zl.l, $$0x -> $$0x.c, cyu.b, $$0x -> $$0x.a, cur.i, $$0x -> $$0x.b, $$0::create);
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
