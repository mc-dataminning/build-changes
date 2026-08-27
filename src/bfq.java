import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bfq {
   bfp a();

   static <T> bfq.b<T> a(T $$0, int $$1) {
      return new bfq.b<>($$0, bfp.a($$1));
   }

   public static class a implements bfq {
      private final bfp a;

      public a(int $$0) {
         this.a = bfp.a($$0);
      }

      public a(bfp $$0) {
         this.a = $$0;
      }

      @Override
      public bfp a() {
         return this.a;
      }
   }

   public static class b<T> implements bfq {
      private final T a;
      private final bfp b;

      b(T $$0, bfp $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public bfp a() {
         return this.b;
      }

      public static <E> Codec<bfq.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bfq.b::b), bfp.a.fieldOf("weight").forGetter(bfq.b::a)).apply($$1, bfq.b::new)
         );
      }
   }
}
