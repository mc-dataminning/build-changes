import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bfa {
   bez a();

   static <T> bfa.b<T> a(T $$0, int $$1) {
      return new bfa.b<>($$0, bez.a($$1));
   }

   public static class a implements bfa {
      private final bez a;

      public a(int $$0) {
         this.a = bez.a($$0);
      }

      public a(bez $$0) {
         this.a = $$0;
      }

      @Override
      public bez a() {
         return this.a;
      }
   }

   public static class b<T> implements bfa {
      private final T a;
      private final bez b;

      b(T $$0, bez $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public bez a() {
         return this.b;
      }

      public static <E> Codec<bfa.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bfa.b::b), bez.a.fieldOf("weight").forGetter(bfa.b::a)).apply($$1, bfa.b::new)
         );
      }
   }
}
