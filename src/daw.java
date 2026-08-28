import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public abstract class daw implements dah<dax> {
   protected final dad a;
   protected final cvp b;
   private final dan<?> d;
   private final dam<?> e;
   protected final String c;
   @Nullable
   private dag f;

   public daw(dan<?> $$0, dam<?> $$1, String $$2, dad $$3, cvp $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public dan<?> e() {
      return this.d;
   }

   @Override
   public dam<?> aq_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cvp a(jp.a $$0) {
      return this.b;
   }

   @Override
   public dag a() {
      if (this.f == null) {
         this.f = dag.a(this.a);
      }

      return this.f;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   public cvp a(dax $$0, jp.a $$1) {
      return this.b.u();
   }

   public interface a<T extends daw> {
      T create(String var1, dad var2, cvp var3);
   }

   public static class b<T extends daw> implements dam<T> {
      final daw.a<T> w;
      private final MapCodec<T> x;
      private final zb<wo, T> y;

      protected b(daw.a<T> $$0) {
         this.w = $$0;
         this.x = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                     dad.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cvp.d.fieldOf("result").forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.y = zb.a(yz.l, $$0x -> $$0x.c, dad.a, $$0x -> $$0x.a, cvp.i, $$0x -> $$0x.b, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.x;
      }

      @Override
      public zb<wo, T> b() {
         return this.y;
      }
   }
}
