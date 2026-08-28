import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bqe {
   bqd a();

   static <T> bqe.b<T> a(T $$0, int $$1) {
      return new bqe.b<>($$0, bqd.a($$1));
   }

   public static class a implements bqe {
      private final bqd a;

      public a(int $$0) {
         this.a = bqd.a($$0);
      }

      public a(bqd $$0) {
         this.a = $$0;
      }

      @Override
      public bqd a() {
         return this.a;
      }
   }

   public static record b<T>(T a, bqd b) implements bqe {
      @Override
      public bqd a() {
         return this.b;
      }

      public static <E> Codec<bqe.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bqe.b::b), bqd.a.fieldOf("weight").forGetter(bqe.b::c)).apply($$1, bqe.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public bqd c() {
         return this.b;
      }
   }
}
