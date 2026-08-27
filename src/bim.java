import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bim {
   bil a();

   static <T> bim.b<T> a(T $$0, int $$1) {
      return new bim.b<>($$0, bil.a($$1));
   }

   public static class a implements bim {
      private final bil a;

      public a(int $$0) {
         this.a = bil.a($$0);
      }

      public a(bil $$0) {
         this.a = $$0;
      }

      @Override
      public bil a() {
         return this.a;
      }
   }

   public static class b<T> implements bim {
      private final T a;
      private final bil b;

      b(T $$0, bil $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public bil a() {
         return this.b;
      }

      public static <E> Codec<bim.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bim.b::b), bil.a.fieldOf("weight").forGetter(bim.b::a)).apply($$1, bim.b::new)
         );
      }
   }
}
