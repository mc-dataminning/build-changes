import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bom {
   bol a();

   static <T> bom.b<T> a(T $$0, int $$1) {
      return new bom.b<>($$0, bol.a($$1));
   }

   public static class a implements bom {
      private final bol a;

      public a(int $$0) {
         this.a = bol.a($$0);
      }

      public a(bol $$0) {
         this.a = $$0;
      }

      @Override
      public bol a() {
         return this.a;
      }
   }

   public static class b<T> implements bom {
      private final T a;
      private final bol b;

      b(T $$0, bol $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public bol a() {
         return this.b;
      }

      public static <E> Codec<bom.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bom.b::b), bol.a.fieldOf("weight").forGetter(bom.b::a)).apply($$1, bom.b::new)
         );
      }
   }
}
