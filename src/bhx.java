import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bhx {
   bhw a();

   static <T> bhx.b<T> a(T $$0, int $$1) {
      return new bhx.b<>($$0, bhw.a($$1));
   }

   public static class a implements bhx {
      private final bhw a;

      public a(int $$0) {
         this.a = bhw.a($$0);
      }

      public a(bhw $$0) {
         this.a = $$0;
      }

      @Override
      public bhw a() {
         return this.a;
      }
   }

   public static class b<T> implements bhx {
      private final T a;
      private final bhw b;

      b(T $$0, bhw $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public bhw a() {
         return this.b;
      }

      public static <E> Codec<bhx.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bhx.b::b), bhw.a.fieldOf("weight").forGetter(bhx.b::a)).apply($$1, bhx.b::new)
         );
      }
   }
}
