import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bfc {
   bfb a();

   static <T> bfc.b<T> a(T $$0, int $$1) {
      return new bfc.b<>($$0, bfb.a($$1));
   }

   public static class a implements bfc {
      private final bfb a;

      public a(int $$0) {
         this.a = bfb.a($$0);
      }

      public a(bfb $$0) {
         this.a = $$0;
      }

      @Override
      public bfb a() {
         return this.a;
      }
   }

   public static class b<T> implements bfc {
      private final T a;
      private final bfb b;

      b(T $$0, bfb $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public bfb a() {
         return this.b;
      }

      public static <E> Codec<bfc.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bfc.b::b), bfb.a.fieldOf("weight").forGetter(bfc.b::a)).apply($$1, bfc.b::new)
         );
      }
   }
}
