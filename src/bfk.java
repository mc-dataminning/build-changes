import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bfk {
   bfj a();

   static <T> bfk.b<T> a(T $$0, int $$1) {
      return new bfk.b<>($$0, bfj.a($$1));
   }

   public static class a implements bfk {
      private final bfj a;

      public a(int $$0) {
         this.a = bfj.a($$0);
      }

      public a(bfj $$0) {
         this.a = $$0;
      }

      @Override
      public bfj a() {
         return this.a;
      }
   }

   public static class b<T> implements bfk {
      private final T a;
      private final bfj b;

      b(T $$0, bfj $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public bfj a() {
         return this.b;
      }

      public static <E> Codec<bfk.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bfk.b::b), bfj.a.fieldOf("weight").forGetter(bfk.b::a)).apply($$1, bfk.b::new)
         );
      }
   }
}
