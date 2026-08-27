import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bin {
   bim a();

   static <T> bin.b<T> a(T $$0, int $$1) {
      return new bin.b<>($$0, bim.a($$1));
   }

   public static class a implements bin {
      private final bim a;

      public a(int $$0) {
         this.a = bim.a($$0);
      }

      public a(bim $$0) {
         this.a = $$0;
      }

      @Override
      public bim a() {
         return this.a;
      }
   }

   public static class b<T> implements bin {
      private final T a;
      private final bim b;

      b(T $$0, bim $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public bim a() {
         return this.b;
      }

      public static <E> Codec<bin.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bin.b::b), bim.a.fieldOf("weight").forGetter(bin.b::a)).apply($$1, bin.b::new)
         );
      }
   }
}
