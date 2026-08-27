import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bhn {
   bhm a();

   static <T> bhn.b<T> a(T $$0, int $$1) {
      return new bhn.b<>($$0, bhm.a($$1));
   }

   public static class a implements bhn {
      private final bhm a;

      public a(int $$0) {
         this.a = bhm.a($$0);
      }

      public a(bhm $$0) {
         this.a = $$0;
      }

      @Override
      public bhm a() {
         return this.a;
      }
   }

   public static class b<T> implements bhn {
      private final T a;
      private final bhm b;

      b(T $$0, bhm $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public bhm a() {
         return this.b;
      }

      public static <E> Codec<bhn.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bhn.b::b), bhm.a.fieldOf("weight").forGetter(bhn.b::a)).apply($$1, bhn.b::new)
         );
      }
   }
}
