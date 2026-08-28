import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bos {
   bor a();

   static <T> bos.b<T> a(T $$0, int $$1) {
      return new bos.b<>($$0, bor.a($$1));
   }

   public static class a implements bos {
      private final bor a;

      public a(int $$0) {
         this.a = bor.a($$0);
      }

      public a(bor $$0) {
         this.a = $$0;
      }

      @Override
      public bor a() {
         return this.a;
      }
   }

   public static record b<T>(T a, bor b) implements bos {
      @Override
      public bor a() {
         return this.b;
      }

      public static <E> Codec<bos.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bos.b::b), bor.a.fieldOf("weight").forGetter(bos.b::c)).apply($$1, bos.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public bor c() {
         return this.b;
      }
   }
}
