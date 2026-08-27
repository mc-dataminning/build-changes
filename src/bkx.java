import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bkx {
   bkw a();

   static <T> bkx.b<T> a(T $$0, int $$1) {
      return new bkx.b<>($$0, bkw.a($$1));
   }

   public static class a implements bkx {
      private final bkw a;

      public a(int $$0) {
         this.a = bkw.a($$0);
      }

      public a(bkw $$0) {
         this.a = $$0;
      }

      @Override
      public bkw a() {
         return this.a;
      }
   }

   public static class b<T> implements bkx {
      private final T a;
      private final bkw b;

      b(T $$0, bkw $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public T b() {
         return this.a;
      }

      @Override
      public bkw a() {
         return this.b;
      }

      public static <E> Codec<bkx.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bkx.b::b), bkw.a.fieldOf("weight").forGetter(bkx.b::a)).apply($$1, bkx.b::new)
         );
      }
   }
}
