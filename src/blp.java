import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface blp {
   blo a();

   static <T> blp.b<T> a(T $$0, int $$1) {
      return new blp.b<>($$0, blo.a($$1));
   }

   public static class a implements blp {
      private final blo a;

      public a(int $$0) {
         this.a = blo.a($$0);
      }

      public a(blo $$0) {
         this.a = $$0;
      }

      @Override
      public blo a() {
         return this.a;
      }
   }

   public static class b<T> implements blp {
      private final T a;
      private final blo b;

      b(T $$0, blo $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public blo a() {
         return this.b;
      }

      public static <E> Codec<blp.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(blp.b::b), blo.a.fieldOf("weight").forGetter(blp.b::a)).apply($$1, blp.b::new)
         );
      }
   }
}
