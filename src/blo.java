import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface blo {
   bln a();

   static <T> blo.b<T> a(T $$0, int $$1) {
      return new blo.b<>($$0, bln.a($$1));
   }

   public static class a implements blo {
      private final bln a;

      public a(int $$0) {
         this.a = bln.a($$0);
      }

      public a(bln $$0) {
         this.a = $$0;
      }

      @Override
      public bln a() {
         return this.a;
      }
   }

   public static class b<T> implements blo {
      private final T a;
      private final bln b;

      b(T $$0, bln $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public bln a() {
         return this.b;
      }

      public static <E> Codec<blo.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(blo.b::b), bln.a.fieldOf("weight").forGetter(blo.b::a)).apply($$1, blo.b::new)
         );
      }
   }
}
