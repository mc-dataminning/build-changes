import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public interface bqr {
   bqq a();

   static <T> bqr.b<T> a(T $$0, int $$1) {
      return new bqr.b<>($$0, bqq.a($$1));
   }

   public static class a implements bqr {
      private final bqq a;

      public a(int $$0) {
         this.a = bqq.a($$0);
      }

      public a(bqq $$0) {
         this.a = $$0;
      }

      @Override
      public bqq a() {
         return this.a;
      }
   }

   public static record b<T>(T a, bqq b) implements bqr {
      @Override
      public bqq a() {
         return this.b;
      }

      public static <E> Codec<bqr.b<E>> a(Codec<E> $$0) {
         return RecordCodecBuilder.create(
            $$1 -> $$1.group($$0.fieldOf("data").forGetter(bqr.b::b), bqq.a.fieldOf("weight").forGetter(bqr.b::c)).apply($$1, bqr.b::new)
         );
      }

      public T b() {
         return this.a;
      }

      public bqq c() {
         return this.b;
      }
   }
}
