import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bff {
   bfe a();

   static <T> bff.b<T> a(T $$0, int $$1) {
      return new bff.b<>($$0, bfe.a($$1));
   }

   public static class a implements bff {
      private final bfe a;

      public a(int $$0) {
         this.a = bfe.a($$0);
      }

      public a(bfe $$0) {
         this.a = $$0;
      }

      @Override
      public bfe a() {
         return this.a;
      }
   }

   public static class b<T> implements bff {
      private final T a;
      private final bfe b;

      b(T $$0, bfe $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public bfe a() {
         return this.b;
      }

      public static <E> Codec<bff.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bff.b::b), bfe.a.fieldOf("weight").forGetter(bff.b::a)).apply($$1, bff.b::new)
         );
      }
   }
}
