import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bio {
   bin a();

   static <T> bio.b<T> a(T $$0, int $$1) {
      return new bio.b<>($$0, bin.a($$1));
   }

   public static class a implements bio {
      private final bin a;

      public a(int $$0) {
         this.a = bin.a($$0);
      }

      public a(bin $$0) {
         this.a = $$0;
      }

      @Override
      public bin a() {
         return this.a;
      }
   }

   public static class b<T> implements bio {
      private final T a;
      private final bin b;

      b(T $$0, bin $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public bin a() {
         return this.b;
      }

      public static <E> Codec<bio.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bio.b::b), bin.a.fieldOf("weight").forGetter(bio.b::a)).apply($$1, bio.b::new)
         );
      }
   }
}
