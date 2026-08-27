import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bhj {
   bhi a();

   static <T> bhj.b<T> a(T $$0, int $$1) {
      return new bhj.b<>($$0, bhi.a($$1));
   }

   public static class a implements bhj {
      private final bhi a;

      public a(int $$0) {
         this.a = bhi.a($$0);
      }

      public a(bhi $$0) {
         this.a = $$0;
      }

      @Override
      public bhi a() {
         return this.a;
      }
   }

   public static class b<T> implements bhj {
      private final T a;
      private final bhi b;

      b(T $$0, bhi $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public bhi a() {
         return this.b;
      }

      public static <E> Codec<bhj.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bhj.b::b), bhi.a.fieldOf("weight").forGetter(bhj.b::a)).apply($$1, bhj.b::new)
         );
      }
   }
}
