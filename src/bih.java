import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bih {
   big a();

   static <T> bih.b<T> a(T $$0, int $$1) {
      return new bih.b<>($$0, big.a($$1));
   }

   public static class a implements bih {
      private final big a;

      public a(int $$0) {
         this.a = big.a($$0);
      }

      public a(big $$0) {
         this.a = $$0;
      }

      @Override
      public big a() {
         return this.a;
      }
   }

   public static class b<T> implements bih {
      private final T a;
      private final big b;

      b(T $$0, big $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public big a() {
         return this.b;
      }

      public static <E> Codec<bih.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bih.b::b), big.a.fieldOf("weight").forGetter(bih.b::a)).apply($$1, bih.b::new)
         );
      }
   }
}
